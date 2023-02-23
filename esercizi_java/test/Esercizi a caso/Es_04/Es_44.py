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
    # praticamente mette in una lista le chiavi del dizionario dict_one con list(dict_one.keys()) e poi all'interno di quella lista si va a prendre la variabile di numero z
    dict_two[z] = dict_one[list(dict_one.keys())[z]]
    print(list(dict_one.keys())[z])
    print(dict_one[list(dict_one.keys())[z]])
    # per aggiungere una nuova voce al volcabolario si usa questo comando: dictone["color"] = "red"
    # color è la chiave mentre red è il colore
    # in questo caso list(dict_one.keys())[z] recupera la chiave del dizionario partendo dall'ultimo
    # quindi quando viene insierito nel comdando: dict_one[list(dict_one.keys())[z]] viene ricavato il valore che si trova con quella chiave detta precedentemente
    # viene inserito il valore con chiave il numero z perchè di default la lista mette i numeri come chiavi 1,2,3,4,5,6,7,8,... ed infatti quando chiedo di stamparmi la lista mi stampa anche i numeri
    # nella lista perô parte da otto perchè l'ordine viene dato da quando si inserisce quel valore e quindi parte al contrario perô funzionaaa

print(dict_two)

# punto 2
dict_three = {}
for z, y in dict_one.items():
    dict_three.setdefault(y, [])
    dict_three[y].append(z)


# ßprint(dict_three)
