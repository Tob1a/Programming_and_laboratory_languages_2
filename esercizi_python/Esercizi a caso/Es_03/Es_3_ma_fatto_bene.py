from numpy import array as numpy_array
from array import array as arr_array

# creation of the array from numpy using the function range
nmp = numpy_array(range(2, 8))
# creation of the array from array using the function range, note the definition of the type: 'I' -> unsigned integer
arr = arr_array('I', range(2, 8))

# variable containing the sum of elements in list
sum = 0

# for loop on the elements
for el in nmp:
    sum = sum + el

print(sum)

print("The numpy array now is: ", nmp)
# note the differences in the translation into string!
print("The array array now is: ", arr)

# we don't need cycles for numpy!
nmp = nmp + sum
# we would need a cycle for arr (now sum is of type numpy.int64 which is automatically casted to an array.array)
sum = int(sum)  # <- to transform sum back into an int
# arr = arr + sum  # ERROR! need of a cycle
for i in range(len(arr)):
    arr[i] += sum


print(type(arr))
# note the use of str() to cast a list into a string
print("After the cycle the numpy array is: " + str(nmp))
print("After the cycle the array array is: " + str(arr))
