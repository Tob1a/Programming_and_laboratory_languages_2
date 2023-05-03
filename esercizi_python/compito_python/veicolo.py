class veicolo:
    def __init__(self, cod, targa, modello, marca, cost):
        self.cod = cod
        self.targa = targa
        self.modello = modello
        self.marca = marca
        self.cost = cost

    def toString(self):
        return self.targa + "\t" + str(self.cod) + "\t" + self.modello + "\t" + self.marca + "\t" + str(self.cost) + "\t"
