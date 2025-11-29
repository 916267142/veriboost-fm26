#!/bin/bash

java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/generate/generate-bgp-properties
java -jar allinone/target/allinone-bundle-0.36.0.jar -cmdfile commands/generate/generate-ospf-properties