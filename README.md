# COE 211 Java exercises

This repository collects introductory Java exercises from COE 211. The examples cover basic program structure, object-oriented modeling, file-backed data, and small console applications.

## Exercise index

- [`HelloWorld.java`](HelloWorld.java) — minimal Java entry point.
- [`lab_6/`](lab_6/) — related classes for employees, weekly schedules, a calculator, and an `EntryPoint` driver.
- [`lab8/ExpensesTracker.java`](lab8/ExpensesTracker.java) — a small expense tracker with sample data in [`lab8/expenses.txt`](lab8/expenses.txt).
- [`lab9/Skeleton.java`](lab9/Skeleton.java) — a standalone lab exercise skeleton.
- [`staffManagement/`](staffManagement/) — a compact employee and staff-management example.

## Running an exercise

Use a Java Development Kit from the directory containing the relevant source files. For example:

```bash
cd lab8
javac ExpensesTracker.java
java ExpensesTracker
```

Exercises that span multiple classes should be compiled together from their directory:

```bash
cd staffManagement
javac *.java
java EntryPoint
```

These files are preserved as coursework examples; they are independent exercises rather than a single production application.
