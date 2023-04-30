dict_one = {
    'Boss Nass': 'Star Wars',
    'Tom Bombadil': 'The Lord of the Rings',
    'Hari Seldon': 'Foundation series',
    'Polliver': 'Game of Thrones',
    'Jules Winnfield': 'Pulp Fiction',
    'The Mule': 'Foundation series',
    'Flynn Rider': 'Rapunzel',
    'Yoda': 'Star Wars',
    'Vince Vega': 'Pulp Fiction'
}
print(dict_one)
dict_two = {}
dict_three = {}
x = dict_one.keys()
for z in range(0, len(dict_one), -1):
    dict_two[z].update(dict_one[y])

print(len(dict_one))
print(dict_two)

# punto 2

for z, y in dict_one.items():
    if y not in dict_three:
        dict_three[y].update(dict_one[y])
        dict_three[z] = + ', ' + dict_one[z]

print(dict_three)
