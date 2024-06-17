example_dict = dict(apple ="40", grapes = "20", banana = "10", mango = "15")
print(example_dict)
for x,y in example_dict.items():
    print(x,y)

check = input("What are you looking for? ").lower()
 
if(check in example_dict):
    print("Yes, this is available")
else:
    print("No, this is not available")