#!/bin/bash

java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-columbus
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-colt
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-uscarrier
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-bics-ospf
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-uscarrier-ospf
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-columbus-ospf
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/benchmark/benchmark-cogentco