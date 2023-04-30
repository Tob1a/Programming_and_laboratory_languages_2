import random
# punto 1
mylist = []
y = 0
for x in range(random.randint(2, 5), 7):
    mylist.append(random.randint(2, 7))
# punto 2
for x in range(len(mylist)):
    y = mylist[x] + y
print(y)
# punto 3
print(mylist)
# punto 4
y = 0
for x in range(len(mylist)):
    mylist[x] = mylist[x]+y
    y = mylist[x]
# punto 5
print(mylist)
