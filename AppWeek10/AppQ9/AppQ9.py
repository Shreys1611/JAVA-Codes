def count_upper_lower_case_letters(input_string):
    upper_count = 0
    lower_count = 0

    for char in input_string:
        if char.isupper():
            upper_count += 1
        elif char.islower():
            lower_count += 1

    return upper_count, lower_count

# Input a string from the user
input_str = input("Enter a string: ")

# Call the function to count uppercase and lowercase letters
upper_count, lower_count = count_upper_lower_case_letters(input_str)

print(f"Uppercase letters: {upper_count}")
print(f"Lowercase letters: {lower_count}")