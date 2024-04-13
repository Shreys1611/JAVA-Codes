def calculate_factorial(n):
    if n < 0:
        return "Factorial is not defined for negative numbers"
    elif n == 0:
        return 1
    else:
        factorial = 1
        for i in range(1, n + 1):
            factorial *= i
        return factorial

# Input a number from the user
num = int(input("Enter a number: "))

# Calculate the factorial
result = calculate_factorial(num)

# Print the result
print(f"The factorial of {num} is: {result}")