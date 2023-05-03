
class Libretto():
    def __init__(self, cod, voto):
        self._cod = cod
        self._voto = voto

    def toString(self):
        return "("+ str(self._cod)+","+self._voto+")"
