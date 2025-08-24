import secrets
import string

uppercase = string.ascii_uppercase
lowercase = string.ascii_lowercase
digits = string.digits
symbols = string.punctuation

def input_get():
    while True:
        try:
            length = int(input("Enter password length (minimum 8): "))
            return length
        except (ValueError):
            print("Invalid input.")

def get_complexity():
    all_char = lowercase
    print("Please choose the Complexity of password")
    char_upper = input("Can include Uppercase letter? (y/n):").lower() == "y"
    char_digit = input("Can include Digit letter? (y/n):").lower() == "y"
    char_symbol = input("Can include symbol letter? (y/n):").lower() == "y"
    if char_upper:
        all_char += uppercase
    if char_digit:
        all_char += digits
    if char_symbol:
        all_char += symbols
    return all_char

while True:
    length = input_get()
    all_char = get_complexity()
    if length<8:
        print("Password length should be at least 8 characters.")
    else:
        password = "".join(secrets.choice(all_char)for _ in range(length))
        print(password)
        break
