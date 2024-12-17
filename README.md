# Groovy NullPointerException in Arithmetic Operations

This repository demonstrates a common error in Groovy related to handling null values in arithmetic operations.  Groovy's dynamic typing can mask potential `NullPointerExceptions` if not properly handled.

The `bug.groovy` file shows a simple method that adds two numbers. However, it fails if either input is null. The `bugSolution.groovy` file provides a corrected version.

## How to Reproduce
1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the unexpected null output and potential `NullPointerExceptions`.
4. Run `bugSolution.groovy` to see the corrected behavior.

## Solution
The solution involves explicitly checking for null values before performing the arithmetic operation. This ensures that the code gracefully handles null inputs without causing exceptions.