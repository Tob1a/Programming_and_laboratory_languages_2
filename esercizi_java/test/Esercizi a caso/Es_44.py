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

# punto 1
dict_two = {}
for z in range(len(dict_one)-1, -1, -1):
    dict_two[z] = dict_one[list(dict_one.keys())[z]]

print(dict_two)

# punto 2
dict_three = {}
for z, y in dict_one.items():
    dict_three.setdefault(y, [])
    dict_three[y].append(z)

print(dict_three)
