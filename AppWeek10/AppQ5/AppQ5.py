def reverse_string(input_string):
    reversed_string = input_string[::-1]
    return reversed_string

def is_palindrome(input_string):
    return input_string == input_string[::-1]

# Input a string from the user
string = input("Enter a string: ")

# Reverse the string
reversed_str = reverse_string(string)

# Check if it's a palindrome
if is_palindrome(string):
    print(f"The reversed string of '{string}' is '{reversed_str}' and it's a palindrome.")
else:
    print(f"The reversed string of '{string}' is '{reversed_str}' and it's not a palindrome.")