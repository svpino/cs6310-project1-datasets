#!/bin/sh

classpath=${1-"/home/ubuntu/workspace/ProjectOne/bin"}
echo "Using bin folder $classpath"

for f in *.csv
do
        echo $f
        java -cp $classpath edu.gatech.cs6310.projectOne.ProjectOne -i $f
done