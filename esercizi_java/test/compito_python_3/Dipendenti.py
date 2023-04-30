

class Dipendenti:
    def __init__(self, cod, nome, costo):
        self.cod = cod
        self.nome = nome
        self.costo = costo

    def toString(self):
        return self.nome + "\t"+ str(self.cod)