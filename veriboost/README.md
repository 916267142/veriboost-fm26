# VeriBoost : Efficient Accelerating SMT-based Failure Tolerance Verification for WANs.

This project is a prototype implementation of VeriBoost.

------------------------------------------

## Introduction
VeriBoost is a tool designed to accelerate SMT-based verifiers. 
It is built upon the SMT-based verifier [Minesweeper](https://github.com/batfish/batfish/releases/tag/2021-03-16-minesweeper). 
Our modifications aim to reduce the SMT solving space by reducing the symbolic links.

- Pruning the symbolic links that are irrelevant to the property.

- Compressing the symbolic links that are equivalent to the property.

------------------------------------------

## Setup

### Prerequisites
- **Linux System** (Path format errors will occur in Windows, recommend ubuntu22.04)
- **glibc >= 2.29:** (required by Z3 4.12.2)
- **Maven:** version 3.6.3
- **JAVA:** version 1.8
- **Z3:** version 4.12
- **Git**

### Install Z3

Minesweeper and VeriBoost rely on [Z3](https://github.com/Z3Prover/z3). 
To facilitate deployment, we package z3 in our `tools/`.

```bash
sudo sh ./tools/install_z3.sh
```

Then, check the install of z3.

```bash
z3 -h
```

**Important Notes:**
- Ensure the Z3 binary file has executable permission. If not, use:

```bash
sudo chmod +x Z3_BIN_PATH
```

### Complie VeriBoost

```bash
cd veriboost
make clean package
```

------------------------------------------

## Code Modification

We have made the following modifications to the [Minesweeper](https://github.com/batfish/batfish/releases/tag/2021-03-16-minesweeper) source code:

- The `prune/` directory contains the implementation of VeriBoost.
- Code segments between `VERIBOOST_ADD_BEGIN` and `VERIBOOST_ADD_END` mark our modifications to Minesweeper.

```bash
VeriBoost/
    |
    |----datasets/
    |----results/     
    |----tools/                                     // Scripts for reproduction  
    |----commands/                                  // Commands run VeriBoost     
    |----minesweeper/
    |       |----src/main/java/org/batfish/minesweeper/
    |               |----smt/
    |               |     |----PropertyChecker.java // Interface between Minesweeper
    |               |     |----Encoder.java         // Interface between Minesweeper     
    |               |----prune/                     // All codes of VeriBoost
    |----...
```

------------------------------------------

## Datasets

`/dataset` directory contains all experimental datasets used in the paper:
- `bgp/`: 9 synthetic BGP configurations from [NetSMT](https://sngroup.org.cn/work/pdf/NetSMT-INFOCOM24.pdf).
- `ospf/`: 3 synthetic OSPF configurations from [Config2spec](https://www.usenix.org/conference/nsdi20/presentation/birkner).
- `topologyzoo/`: 260 wide area network (WANs) topologies from [Topoloy Zoo](https://topology-zoo.org/).

## Reproduction

### Scalability Evaluation

1. Generate the properties to be verfied (`reaches.txt` will be generated)
```bash
bash tools/run_properties.sh
```

2. Verify the properties (`_results.txt` and `properties_summary.txt` will be generated). 

- *We recommend skipping this step, as Minesweeper require extremely long execution times. We have pre-saved the run results, allowing to proceed directly to subsequent steps.*


- This file recall the entry point for the VeriBoost main program. For detailed parameter descriptions, see [Runtime Parameters](#runtime-parameters).

```bash
bash tools/run_verification.sh
```

3. Summarize experimental results from (`_results.txt` and `properties_summary.txt`) files. (`/all_summary.csv` will be generated for Minesweeper and VeriBoost).
```bash
bash tools/run_batch_time.sh
```

### Effectiveness and Overhead Evaluation

The following command generates experimental results for all 260 topologies in the `result/topologyzoo/` directory:

- `*_link.csv`: Records the number of links reduced by Link Pruning and Link Compression
- `*_time.csv`: Records the execution time of Link Pruning and Link Compression operations

```bash
bash tools/run_topologyzoo.sh
```

### Correctness Evalustion
The following command compares properties (based on `properties_summary.txt`) for Minesweeper and VeriBoost. It generates two log files in the `result/correctness/` directory:
- `batch_summary.log`: Summary log with overall comparison results
- `batch_comparison.log`: Detailed log with individual comparison details

```bash
bash tools/compare_all_folder.sh
```

### Draw the Figure in Case Study
The following command generates visual HTML graphs for the 9 BGP datasets and 3 OSPF datasets (including `Uscarrier` example in the paper).

```bash
bash tools/run_case_study.sh
```

## Development

This section is intended for developers. For simply running VeriBoost, this part can be skipped.

### IDE

We use *vscode* for both development and debugging.

### Runtime Parameters

The following command serves as the main entry point for VeriBoost property verification:

```bash
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark-properties
```

We explain the parameters for `benchmark-properties` as the following.

```bash
**init-snapshot** <parameters>
- `path`: Path to the initial network configuration
- `name`: Log identifier for the current run

Example: `init-snapshot dataset/bgp/colt colt-veriboost`

**get smt-benchmark-properties** <parameters>
- `benchmark`: Whether to record Z3 solving statistics (true/false)
- `topologyPath`: Path to topology file within `./dataset` directory
- `prune`: Whether to enable VeriBoost (true/false)
# Other parameters are unused and are for debugging purposes only. 

Example: `get smt-benchmark-properties benchmark=true, networkType=0, topologyPath="wan/default/cogentco_lon", guided=true, prune=true`
```

Run VeriBoost with interactive mode.

```bash
java -jar allinone/target/allinone-bundle-0.36.0.jar -runmode interactive -loglevel info -batfishmode workservice -coordinatorargs "-templatedirs questions"
```
