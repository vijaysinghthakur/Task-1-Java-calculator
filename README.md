# Task-1-Java-calculator



---

# 🧮 Java Console Calculator

This is my **first internship task** for the Java Developer Internship.  
The goal was to build a simple **calculator using Java console I/O** that can do addition, subtraction, multiplication, and division.

I am a beginner in Java, so through this task, I learned how to write methods, use Scanner for user input, handle errors like divide-by-zero, and use loops to make the program run multiple times until the user exits.

---

## 🧠 What I Learned

1. **Methods in Java** – I created separate methods for addition, subtraction, multiplication, and division.
2. **Using Scanner** – I used the `Scanner` class to take input from the user in the console.
3. **Divide-by-zero handling** – I added a simple `if` condition inside the divide method to show an error message if the user enters zero.
4. **Loops** – I used a `while` loop so the calculator keeps running until the user chooses to exit.
5. **Switch case** – I used `switch` to handle user menu choices (1–5).
6. **Clean exit** – I closed the `Scanner` using `scanner.close();` to free system resources when the program ends.

---

## ⚙️ How I Implemented It

1. Created a Java file named **Calculator.java**.
2. Imported `java.util.Scanner`.
3. Wrote methods for:
   - `add(double a, double b)`
   - `subtract(double a, double b)`
   - `multiply(double a, double b)`
   - `divide(double a, double b)`
4. Used a `while` loop and a menu system for continuous calculations.
5. Added option 5 to exit the calculator safely.

---

## 💡 Example of Divide-by-Zero Handling
In the divide method:
```java
if (b == 0) {
    System.out.println("Error: Cannot divide by zero!");
    return 0;


}

## Learning References

<img width="932" height="433" alt="Screenshot 2025-10-20 210050" src="https://github.com/user-attachments/assets/3c7e17b6-57e5-45aa-ab14-9e268b0d3ff7" />


