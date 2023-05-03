from Corso import Corso


class Teoria(Corso):
    def __init__(self, cod, nomecorso, nomedoc, codaula, oreset, orelab):
        super().__init__(cod, nomecorso, nomedoc)
        self._codaula = codaula
        self._oreset = oreset
        self._orelab = orelab

    def toString(self):
        return super().toString() + "\t teoria \t" + str(self._codaula) + "\t" + str(self._oreset) + "\t" + str(self._orelab)
