#!/bin/bash

java $OPTIONS -cp target/salted-fish-*.jar com.antsdb.saltedfish.nosql.DumpRow "$@"

