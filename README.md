# UserInput Java Program

This Java program takes user input to populate an ArrayList of integers, categorizes them into odd and even numbers, and finds the index of the first number with the smallest distance to its neighboring number.

## Features

1. **User Input:**
    - The program prompts the user to enter the number of inputs and then takes user input for the specified number of integers.

2. **Categorization:**
    - It categorizes the input numbers into two ArrayLists - one for even numbers and another for odd numbers.

3. **Displaying Categorized Lists:**
    - The program displays the ArrayLists containing even and odd numbers.

4. **Finding Index with Smallest Distance:**
    - It includes a function `findIndexWithSmallestDistance` that calculates the index of the first number with the smallest distance to its neighboring number in the ArrayList.

## How to Use

1. **Compile:**
    - Compile the Java file using a Java compiler.

    ```bash
    javac userInput.java
    ```

2. **Run:**
    - Run the compiled Java program.

    ```bash
    java userInput
    ```

3. **Enter Inputs:**
    - Follow the on-screen instructions to enter the number of inputs and input numbers.

4. **View Results:**
    - The program will display the categorized lists of even and odd numbers, along with the index of the number with the smallest distance.

## Function Details

### `input()`
- Takes user input, categorizes numbers, and displays results.

### `findIndexWithSmallestDistance(ArrayList<Integer> numbers)`
- Finds the index of the first number with the smallest distance to its neighboring number in the given ArrayList.


