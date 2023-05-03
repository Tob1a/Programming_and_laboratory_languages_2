from veicolo import veicolo

class furgone(veicolo):
    def __init__(self, cod, targa, modello, marca, cost, categoria, posti, vano):
        super().__init__(cod, targa, modello, marca, cost)
        self.categoria = categoria
        self.posti = posti
        self.vano = vano

    def toString(self):
        return "commerciale" + "\t"+ super().toString() + "\t-"+"\t-"+"\t"+self.categoria+"\t"+str(self.posti)+"\t"+str(self.vano)