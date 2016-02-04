# CS6310 - Software Architecture and Design 

### Project 1 Sample Datasets

The following is a list of sample datasets that you can use to test your solution for Project 1. These files follow the same format than the student_demand files provided as part of the project.

Next to each file, you can see the expected result.

* demand1 - __X = 4__
* demand2 - __X = 5__
* demand3 - __X = 9__
* demand4 - __X = 13__
* demand5 - __X = 17__
* demand6 - __X = 4__
* demand7 - __X = 5__
* demand8 - __X = 9__
* demand9 - __X = 13__
* demand10 - __X = 17__
* demand11 - __X = 1__
* demand12 - __X = 3__

### Large datasets

I thought it was going to be interesting to test Project1 code with some large datasets (larger than 600), so I created a small program to generate some random values. The code is in `Generator.java`, and you can read the instructions inside that file.

I personally created the following samples:

* large1000 - __X = 170__
* large3000 - __X = 529__
* large5000 - __X = 897__
* large7000 - __X = 1227__
* large10000 - __X = 1761__

As a heads up, the 7,000 and 10,000 samples take several minutes to complete (at least on my computer they did.)

### Automated Test Running

To automatically test your program output, use the `test_runner.sh` shell script (_thanks to Shim Manning for the idea!_). It will automatically assume the path to your java class to be `/home/ubuntu/workspace/ProjectOne`, but this can be overridden as follows:

```
./test_runner.sh /home/ubuntu/alternative/path/to/bin
```