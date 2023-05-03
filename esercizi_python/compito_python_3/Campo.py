class Campo:
    def __init__(self, cod, nome, larghezza, lunghezza, costorario):
        self.cod = cod
        self.nome = nome
        self.larghezza = larghezza
        self.lunghezza = lunghezza
        self.costorario = costorario

    def toString(self):
        return self.nome+"\t"+str(self.cod)+"\t"+str(self.larghezza)+"\t"+str(self.lunghezza)+"\t"
