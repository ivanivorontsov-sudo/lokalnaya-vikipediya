#!/bin/sh
set -e; d=$(mktemp -d); javac -d $d app/src/main/java/ru/vorontsov/wiki/TextClean.java app/src/test/java/TextCleanTest.java; java -cp $d TextCleanTest
