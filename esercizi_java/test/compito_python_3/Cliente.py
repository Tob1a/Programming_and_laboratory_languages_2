from Servizio import Servizio
class Cliente:
    def __init__(self, cod, nome):
        self.cod = cod
        self.nome = nome
        self.servizi = []


    def addServizio(self, d, ore):
        self.servizi.append(Servizio(d,ore))


    def numServ(self, codice):
        a = 0

        for s in self.servizi:
            if codice == s.dipendente.cod:
                a = a + 1
        return a


    def getCost(self):
        c=0
        for s in self.servizi: 
            c = s.ore*s.dipendente.costo+c
        return c

    def toString(self):
        return str(self.cod) + "\t"+self.nome + "\t" + str(self.getCost())
