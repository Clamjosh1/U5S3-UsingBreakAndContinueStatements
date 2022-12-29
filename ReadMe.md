# U5S3 - Using break and continue statements

* Part A - Foundations 6.3
* Part B - Foundations practice
* Part C - Algorithm Challenge

## Part A

### Exercise 01

#### Step 01

In the package `partA.ex01` look at the file `ComputeSum`. 
#### Step 02

In the package `partA.ex01` examine `ComputeSum`.

* Implement the following:
  * Accept 10 numbers from the user
  * Compute the sum of the numbers entered
  * When 0 is entered, the program must exit and display the
  sum of the numbers
  * Test the program by entering 1,2,3,4,5,6,7,8,9,10 then enter 0 to exit the program
  
    Your program is working correctly, if when run, the following is the output:
```
55
```

### Exercise 02

#### Step 01

In the package `partA.ex02` look at the file `CountChar`. 

#### Step 02

* Examine `CountChar`
  * The program is used to count the number of occurrences of
  the char ‘w’ in the string
  * Modify the program to …
    *  Resolve the syntax error
    * Print the count of char ‘w’
  * Expected Output:
    * Number of w : 3

### Exercise 03

#### Step 01

In the package `partA.ex03` look at the file `BreakContinue`.

#### Step 02

* Modify the program by using break and continue
statements …
  * If the number is even, the number should not be printed
  * Execution of the loop should stop when the value of the loop
  counter is 7
```
 Expected Output:
The number is 1
The number is 3
The number is 5
The number is 7 
```

## Part B

### Exercise 01

#### Step 01

In the package `partB.ex01` look at the file `LoopWithBreakExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex01` complete the `LoopWithBreak` class so that it accepts positive numbers from a user, sums them, and returns them.
Use a break statement to check if the user enters a negative number, if so, ensure that the program terminates.

Your program is working correctly, if when run, the following is the output.

> Use LoopWithBreakExample for reference.

```
Enter a number: 4.5
Enter a number: 3.5
Enter a number: 2
Enter a number: -3
Sum = 10.0
```

### Exercise 02

#### Step 01

In the package `partB.ex02` look at the file `LoopWithContinueExample` and write comments for each line of code. When complete review with instructor.

#### Step 02

In the package `partB.ex02` complete the `LoopWithContinue` class so that you loop through and print 0 through 10.
If the number is between 4 and 9, ensure that the program continues by using the continue keyword.

Your program is working correctly, if when run, the following is the output.

> Use LoopWithContinueExample for reference.

```
1
2
3
4
9
10
```
### Exercise 03
In the package `partB.ex03` look at the `DisplayMultiples` class complete the following :

#### Overview

Develop a java program to calculate the multiples of a given number using a for loop.

#### Task
Have the user enter a number, and then use a for loop to display all the multiples of that number from 1 to 50.
Expected Output:

```
Please enter a value:
3
All of these numbers are a multiple of 3:
0 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48
```

## Part C

### Problem 1
We are looking to write down a list of all possible numbers that can be a
multiple of 3 or 5.
You will be given any number, but to be put on the list the number has to be a non-negative number.

Return true if the given number can be added to the list.

Tip: Think about using the % "mod" operator

Example:
```java
multipleOf(3) --> true
multipleOf(10) --> true
multipleOf(8) --> false
```
### Problem 2
You are given two random temperatures from different states.
Between these two temperatures, we need to check if one state is freezing while the other is having an extreme hot day.
Both of these statements need to be true to prove that some states have extreme cases of temperatures.

Return true, if one temp is less than 0 and the other is greater than 100.

Example:
```java
checkTemp(120, -1) --> true
checkTemp(-1, 120) --> true
checkTemp(2, 120) --> false
```


