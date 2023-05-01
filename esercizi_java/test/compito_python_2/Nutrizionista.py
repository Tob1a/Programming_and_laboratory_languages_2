from Dipendenti import Dipendenti

class Nutrizionista(Dipendenti):
    def __init__(self, cod, nome, costo, telefono, medico, appuntamenti):
        super().__init__(cod, nome, costo)
        self.telefono = telefono
        self.medico = medico
        self.appuntamenti = appuntamenti
        self.costo = costo

    def toString(self):
        return super().toString() + "\tnutri"+"\t-\t-\t-\t" + str(self.telefono) + "\t"+str(self.medico)+"\t"+str(self.appuntamenti)+"\t"+str(self.costo)
