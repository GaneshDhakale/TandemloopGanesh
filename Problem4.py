def count_multiples(numbers):
    # Initialize a dictionary to store the counts for each divisor
    result = {i: 0 for i in range(1, 10)}
    
    # Iterate through each number in the input list
    for num in numbers:
        for i in range(1, 10):
            if num % i == 0:
                result[i] += 1
    
    return result

# Input list
numbers = [1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]

# Get the result
output = count_multiples(numbers)

# Print the result
print(output)
