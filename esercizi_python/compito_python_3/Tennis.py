from Campo import Campo


class Tennis(Campo):
    def __init__(self, cod, nome, larghezza, lunghezza, costorario, temperatura, terreno):
        super().__init__(cod, nome, larghezza, lunghezza, costorario)
        self.temperatura = temperatura
        self.terreno = terreno

    def toString(self):
        return "tennis\t"+super().toString()+str(self.temperatura)+"\t"+self.terreno+"\t-\t-\t"+str(self.costorario)
