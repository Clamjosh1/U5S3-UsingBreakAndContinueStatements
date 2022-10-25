# U5S3 - Using break and continue statements

* Part A - Foundations 6.3
* Part B - Foundations practice
* Part C - Instructor Challenge

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
### Exercise 04

#### Step 01

In the package `partA.ex04` look at the file `Divisors`.

#### Step 02

* Modify the program to include comments for the loop
about …
  * Loop variables used
  * Logic of the loop
  * Number of iterations
  * Condition used
  * Control flow in the loop

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

## Part C

### Exercise 01

In the package `partC.ex01` look at the `ValidatePin` class and complete the following :

1. Declare a valid integer `securityPin`;
2. Prompt the user to enter a value for `userPin`;
3. In a while loop, perform the following steps:
    1. Compare the user-entered `userPin`  with `securityPin`
    2. If the entered `userPin`is not the same, prompt the user to enter `userPin` again.
4. Print a message confirming that the correct pin has been entered and that the user now has access to their account.

### Exercise 02
In the package `partC.ex02` look at the `DisplayMultiples` class complete the following :

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

### Exercise 03

#### Overview
Using text to create a picture is known as ASCII art.  In section 2, we made an ASCII art cat.  This required us to type every character in the art we wanted to create.  In this practice, you’ll find a way to draw basic shapes programmatically in customizable sizes.

![](./assets/img.png)

#### Task

In the package `partC.ex03` look at the `LoopShape` class and complete the following two methods:

* createRectangle(): This method accepts two arguments for width and height which should be used to print a rectangle
* createTriangle(): This method accepts one argument for the size of a leg, which should be used to print an isosceles right triangle

Try changing the value of the arguments you’re supplying these two methods from the main method.  Make sure your program can successfully draw each shape to a custom size. Additionally, your program must:

* Refuse to draw shapes with any dimension less than 1
* Be able to draw shapes with any dimension equal to 1 (a 1x1 shape should print just a single character)

If the problem seems difficult, remember to break it into smaller challenges such as:

* How do I print a single line that is a variable number of “#” characters wide?
* How do I create a String that begins and ends with a “#”, but has a variable number of spaces in between?

Finishing each smaller challenge is an accomplishment.  This problem is as much about understanding loops as it’s about understanding how to break a big problem into smaller tasks.

The knowledge you’ve gained in this section on loops will be very helpful in completing this program.  You’re free to use whichever type of loop statements you feel would be best.  You’ll also need to remember a few concepts from previous sections.

