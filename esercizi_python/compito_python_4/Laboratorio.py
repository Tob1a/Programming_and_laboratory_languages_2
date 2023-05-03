from Corso import Corso


class Laboratorio(Corso):
    def __init__(self, cod, nomecorso, nomedoc, nomelab, nomeass, numpos):
        super().__init__(cod, nomecorso, nomedoc)
        self._nomelab = nomelab
        self._nomeass = nomeass
        self._numpos = numpos

    def toString(self):
        return super().toString()+"lab.\t-\t-\t-\t"+self._nomelab+"\t"+self._nomeass+"\t"+str(self._numpos)
