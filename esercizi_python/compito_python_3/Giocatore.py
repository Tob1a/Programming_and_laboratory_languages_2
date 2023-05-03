from Prenotazioni import Prenotazioni


class Giocatore:
    def __init__(self, cod, nome, eta, categoria):
        self.cod = cod
        self.nome = nome
        self.eta = eta
        self.categoria = categoria
        self.prenotazione = []

    def addPrenotazione(self, c, orainiz):
        self.prenotazione.append(Prenotazioni(c, orainiz))
    
    def ciaone(self):
        x= ""
        for p in self.prenotazione:
            x = x+ p.toString()
        return  x
    
    def volte(self, b):
        a = 0
        for p in self.prenotazione:
            if b == p.c.cod:
                a = p.c.costorario+a
        return a




    def toString(self):
        return str(self.cod)+"\t"+self.nome+"\t"+str(self.eta)+"\t"+str(self.categoria)+"\t["+self.ciaone()+"]"
