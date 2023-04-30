from Libretto import Libretto


class Studente:
    def __init__(self, cod, nome):
        self._cod = cod
        self._nome = nome
        self._corso = []

    def addCorso(self, l):
        self._corso.append(l)

    def media(self):
        a = 0.00
        z = 0
        for l in self._corso:
            if l._voto == "30L":
                a = a+31
            else:
                a = a+float(l._voto)
            z = z+1
        a = a/z
        return a
    

    def max(self):
        a=0.00
        nome=""
        for l in self._corso:
            if l._voto == "30L":
                return l._voto + "\t" + l._cod._nome
            else:
                if a<float(l._voto):
                    a=float(l._voto)
                    c = l
        return c
    





    def libret(self):
        res = ""
        for l in self._corso:
            res = res + l.toString()
        return res

    def toString(self):
        ciao = self.media()
        return self._nome + "\t" + str(self.media())+"["+self.libret()+"]"



