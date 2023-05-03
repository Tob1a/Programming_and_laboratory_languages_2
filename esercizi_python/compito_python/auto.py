from veicolo import veicolo

class auto(veicolo):
    def __init__(self, cod, targa, modello, marca, cost, cilindrata, bagaglio):
        super().__init__(cod, targa, modello, marca, cost)
        self.cilindrata = cilindrata
        self.bagaglio = bagaglio

    def toString(self):
        return "automobile" + "\t" + super().toString() + str(self.cilindrata) + "\t" + str(self.bagaglio) + "\t-\t-\t-\t"