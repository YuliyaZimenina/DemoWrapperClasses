# Demo Wrapper Classes

A simple console-based Java application that calculates the average of a user-defined list of numbers.

## Table of Contents
- [Description](#description)
- [Technologies](#technologies)
- [Installation and Running](#installation-and-running)
- [Author](#author)
- [Code Examples](#code-examples)
- [Screenshots](#screenshots)

## Description
This project is a command-line application that allows users to input a series of numbers and calculate their average.
It demonstrates basic Java programming concepts, including console input/output, exception handling, and the use of wrapper classes.

### Features
- Prompt the user to specify the number of values to input.
- Accept numerical inputs (integers or decimals).
- Handle invalid inputs gracefully using exception handling.
- Calculate and display the average of the entered numbers.

## Technologies
- Java 21
- Console I/O (`BufferedReader`, `InputStreamReader`)
- Basic error handling (`NumberFormatException`)
- Java wrapper classes (`Integer`, `Double`)

## Installation and Running

**Prerequisites**

To run this project, you need:

- Java Development Kit (JDK) 21 installed.
- A Java IDE (IntelliJ IDEA, Eclipse, etc.) or a text editor and command-line tools.

### Installation

1. Clone the repository:
   
```bash

git clone https://github.com/YuliyaZimenina/DemoWrapperClasses.git
cd DemoWrapperClasses

```

2. Open the project in your favorite IDE (IntelliJ IDEA, Eclipse, etc.).
3. Run the application (AverageNumbers.java).

## Author

[Yuliya Zimenina](https://github.com/YuliyaZimenina)

## Code Example

```java

public class AverageNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));

        String userString;
        int n;
        double sum = 0.0;
        double average, t;

        System.out.println("How many numbers will you enter?");
        userString = bufferedReader.readLine();
        try {
            n = Integer.parseInt(userString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            n = 0;
        }

....

```

## Screenshots






