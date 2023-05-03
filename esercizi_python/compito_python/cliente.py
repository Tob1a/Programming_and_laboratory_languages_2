from Noleggio import Noleggio


class cliente:
    def __init__(self, nome, cognome):
        self.nome = nome
        self.cognome = cognome
        self.veicolo = []

    def addVeic(self, v, giorni):
        self.veicolo.append(Noleggio(v, giorni))

    def getmassimo(self, numero):
        massimo = 0
        variabile = 0
        for n in self.veicolo:
            variabile = n.codice
            if variabile == numero:
                massimo = massimo + n.v.cost*n.n
        return massimo

    def costonoleggio(self):
        costo = 0
        for n in self.veicolo:
            costo = n.v.cost*n.n+costo
        return costo
    
    def ciao(self):
        c = ""
        for n in self.veicolo:
            c = c + n.toString()
        return c

    def toString(self):
        return self.nome + "\t" + self.cognome + "\t" + str(self.costonoleggio()) + "\t["+self.ciao()+"]"
