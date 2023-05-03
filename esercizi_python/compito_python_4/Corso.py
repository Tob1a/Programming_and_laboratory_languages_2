class Corso:
    def __init__(self, cod, nomecorso, nomedoc):
        self._cod = cod
        self._nomecorso = nomecorso
        self._nomedoc = nomedoc


    def toString(self):
        return str(self._cod) + "\t"+ self._nomecorso +"\t"+ self._nomedoc + "\t"