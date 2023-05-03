class Prenotazioni:
    def __init__(self, c, orelez):
        self.c = c
        self.orelez = orelez

    def toString(self):
        return "('"+str(self.c.cod)+","+str(self.orelez)+"')"