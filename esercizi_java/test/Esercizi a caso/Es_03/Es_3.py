import numpy
import random
# punto 1
z = random.randint(0, 12)
mylist = numpy.empty(z)
y = 0
# punto 2
for x in range(0, z):
    mylist[x] = random.randint(2, 7)
# punto 3
for x in range(mylist.size):
    y = mylist[x] + y
# punto 4
print(mylist)
print(y)
y = 0
# punto 5
for x in range(mylist.size):
    mylist[x] = mylist[x] + y
    y = mylist[x]
# punto 6
print(mylist)
