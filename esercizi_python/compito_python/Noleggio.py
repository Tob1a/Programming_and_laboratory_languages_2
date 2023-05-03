
class Noleggio:
    def __init__(self, v, Noleggio):
        self.v = v
        self.n = Noleggio
        self.codice = v.cod

    def toString(self):
        return "("+ self.v.targa+","+str(self.n)+")"