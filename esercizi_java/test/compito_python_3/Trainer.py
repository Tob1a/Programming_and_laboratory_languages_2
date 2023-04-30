from Dipendenti import Dipendenti

class Trainer(Dipendenti):
    def __init__(self, cod, nome, costo, ore, specialita):
        super().__init__(cod, nome, costo)
        self.ore = ore
        self.specialita = specialita
        self.costo = costo

    def toString(self):
        return super().toString()+"\ttrainer\t"+str(self.ore)+"\t"+self.specialita+"\t-\t-\t-\t"+str(self.costo)
