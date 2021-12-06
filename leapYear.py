
Year = int(input("Enter your number "))

if((Year % 4 ==0) and (Year %100 !=0) or (Year % 400 == 0)):
    print(Year, " is a leap Year")
else:
    print(Year, " is not a leap Year")