list1 = [2,6,7,9,11]
list2 = [3,6,8,5,9]
print("First List is :" , list1)
print("Second List is :", list2)
list3 = []
for num in list1:
    if(num %2 != 0):
        list3.append(num)

for num in list2:
    if(num %2 ==0):
        list3.append(num)

print("Third list is :", list3 )       