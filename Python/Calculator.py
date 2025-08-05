num1 = float(input("Enter the 1st number: "))
num2 = float(input("Enter the 2st number: "))
print('''
Choose the operator:
      1. Addition (+)
      2. Subtraction (-)
      3. Multiplication (*)
      4. Division (/)
''')
choice = str(input("Enter the operator (+, -, *, /):"))
if(choice == "+"):
    print("Result:",num1+num2)
elif(choice == "-"):
    print("Result:",num1-num2)
elif(choice == "*"):
    print("Result:",num1*num2)
elif(choice == "/"):
    if num2!=0:
        print("Result:",num1/num2)
    else:
        print("Error: cannot divided by zero")
else:
    print("Invalid input")
