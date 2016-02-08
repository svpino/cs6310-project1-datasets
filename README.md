# CS6310 - Software Architecture and Design 

### Project 1 Sample Datasets

The following is a list of sample datasets that you can use to test your solution for Project 1. These files follow the same format than the student_demand files provided as part of the project.

### "Demand" datasets 

The `/demand` folder contains 12 different datasets with something in common: all the students require all the courses. This tests the ability of our program to properly schedule prerequisites in the right order. Some datasets also leave out the prerequisite courses to make sure our program adds them back.

Next to each file, you can see the expected result:

* demand1 - __X = 4.00__
* demand2 - __X = 5.00__
* demand3 - __X = 9.00__
* demand4 - __X = 13.00__
* demand5 - __X = 17.00__
* demand6 - __X = 4.00__
* demand7 - __X = 5.00__
* demand8 - __X = 9.00__
* demand9 - __X = 13.00__
* demand10 - __X = 17.00__
* demand11 - __X = 1.00__
* demand12 - __X = 3.00__

### "Random" datasets

The `/random` folder contains 10 sample datasets. These are completely random datasets each with 50 students. There's nothing special about these datasets since they were generated automatically with no rules in mind.

Next to each file, you can see the expected result.

* random1 - __X = 8.00__
* random2 - __X = 8.00__
* random3 - __X = 10.00__
* random4 - __X = 12.00__
* random5 - __X = 10.00__
* random6 - __X = 10.00__
* random7 - __X = 11.00__
* random8 - __X = 10.00__
* random9 - __X = 8.00__
* random10 - __X = 10.00__

### "Large" datasets

The `/large` folder containts another 5 datasets. I thought it was going to be interesting to test the project with some large datasets (larger than 600), so I created the following datasets for you to test:

* large1000 - __X = 170.00__
* large3000 - __X = 529.00__
* large5000 - __X = 897.00__
* large7000 - __X = 1227.00__
* large10000 - __X = 1761.00__

As a heads up, the 7,000 and 10,000 samples take several minutes to complete (at least on my computer they did.)

### Automated Test Running

To automatically test your program output, use the `test_runner.sh` shell script (_thanks to Shim Manning for the idea!_). It will automatically assume the path to your java class to be `/home/ubuntu/workspace/ProjectOne`, but this can be overridden as follows:

```
./test_runner.sh /home/ubuntu/alternative/path/to/bin
```