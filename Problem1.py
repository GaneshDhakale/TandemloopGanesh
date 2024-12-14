class Calculator:
    def __init__(self, a: float, b: float, operation: str):
        self.a = a
        self.b = b
        self.operation = operation

    def calculate(self):
        if self.operation == "addition":
            return self.addition()
        elif self.operation == "subtraction":
            return self.subtraction()
        elif self.operation == "multiplication":
            return self.multiplication()
        elif self.operation == "division":
            return self.division()
        else:
            return "Invalid operation"

    def addition(self):
        return self.a + self.b

    def subtraction(self):
        return self.a - self.b

    def multiplication(self):
        return self.a * self.b

    def division(self):
        if self.b != 0:
            return self.a / self.b
        else:
            return "Error: Division by zero is not allowed"

# Example usage:
a = float(input("Enter the first number (a): "))
b = float(input("Enter the second number (b): "))
operation = input("Enter the type of operation (addition, subtraction, multiplication, division): ").lower()

calculator = Calculator(a, b, operation)
result = calculator.calculate()
print(f"Result: {result}")
