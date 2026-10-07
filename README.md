Command Line Arguments - Java
Description
This is a simple Java program that demonstrates how to read and display command line arguments using the args parameter of the main() method.

The program checks whether any command line arguments were provided when the application was executed:

If arguments are provided, the program prints each argument.

If no arguments are provided, it displays a message indicating that no arguments were found.

Project Structure
day8/
└── Sample.java

Code
The main class is Sample, located in the day8 package.

package day8;

public class Sample {

    public static void main(String[] args) {
        // Printing command line arguments
        if (args.length > 0) {
            System.out.print("The command line " + " arguments are:");
            for (String val : args) {
                System.out.println(val);
            }
        } else {
            System.out.println("No command line " + " arguments found.");
        }
    }
}

How It Works
The main() method receives command line arguments through:

String[] args

The program first checks the number of arguments using:

args.length > 0

If one or more arguments are present, a for-each loop is used to print each argument:

for (String val : args) {
    System.out.println(val);
}

If there are no arguments, the program prints:

No command line arguments found.

How to Compile
Open a terminal in the project directory and compile the Java file:

javac day8/Sample.java

How to Run
Run the program without arguments:

java day8.Sample

Output:

No command line arguments found.

Run the program with arguments:

java day8.Sample Hello Java Day8

Output:

The command line  arguments are:Hello
Java
Day8

Example
For the command:

java day8.Sample Apple Orange Mango

The program receives the following values:

args[0] = Apple
args[1] = Orange
args[2] = Mango

and prints:

The command line  arguments are:Apple
Orange
Mango

Key Concepts
This program demonstrates the following Java concepts:

Java main() method

Command line arguments

String arrays

args.length

if-else statements

Enhanced for loop

Console output using System.out.println()
