from Campo import Campo


class Squash(Campo):
    def __init__(self, cod, nome, larghezza, lunghezza, costorario, altezza, piano):
        super().__init__(cod, nome, larghezza, lunghezza, costorario)
        self.altezza = altezza
        self.piano = piano

    def toString(self):
        return "squash\t"+super().toString()+"-\t-\t"+str(self.altezza)+"\t"+str(self.piano)+"\t"+str(self.costorario)
