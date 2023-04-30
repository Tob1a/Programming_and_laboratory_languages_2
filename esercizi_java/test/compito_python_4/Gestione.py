import sys
import argparse

from Corso import Corso
from Laboratorio import Laboratorio
from Studente import Studente
from Teoria import Teoria
from Libretto import Libretto


class Gestione:
    def __init__(self, arg):
        self._arg = arg

    def main(self):
        corsi = []
        studenti = []
        codProg = {}

        # punto 1
        try:
            f = open("corsi.txt", "r")
            line = f.readline().strip()
            while(line != ''):
                tok = line.split()
                cod = int(tok[0])
                tipo = tok[1]
                line = f.readline().strip()
                nomecorso = line
                line = f.readline().strip()
                nomedoc = line
                line = f.readline().strip()
                codProg[cod] = nomecorso
                if(tipo == "teoria"):
                    tok = line.split()
                    codaula = int(tok[0])
                    oreset = int(tok[1])
                    orelez = float(tok[2])
                    t = Teoria(cod, nomecorso, nomedoc,
                               codaula, oreset, orelez)
                    corsi.append(t)

                else:
                    nomelab = line
                    line = f.readline().strip()
                    nomeass = line
                    line = f.readline().strip()
                    numpos = int(line)
                    l = Laboratorio(cod, nomecorso, nomedoc,
                                    nomelab, nomeass, numpos)
                    corsi.append(l)
                line = f.readline().strip()
                line = f.readline().strip()
            f.close()

        except IOError:
            print("IO error finded")
        except:
            print("error finded", sys.exc_info()[0])
            raise

        # punto 2

        try:
            f = open("studenti.txt", "r")
            line = f.readline().strip()
            while(line != ''):
                cod = int(line)
                line = f.readline().strip()
                nome = line
                s = Studente(cod, nome)
                studenti.append(s)
                line = f.readline().strip()
                while(line != '' and line != ""):
                    tok = line.split()
                    codcor = int(tok[0])
                    voto = tok[1]

                    # aggiunta di addCorso che non funziona come in java
                    l = Libretto(codcor, voto)
                    s.addCorso(l)

                    line = f.readline().strip()
                line = f.readline().strip()
            f.close()

        except IOError:
            print("IOError findend")
        except:
            print("Error findend", sys.exc_info()[0])
            raise

        # punto 3
        print("nome, codice, docente, tipo, aula, ore sett., ore/lez., lab., assistente, postazioni")
        for c in corsi:
            print(c.toString())

        # punto 4
        print("\n")
        for s in studenti:
            print(s.toString())

        # punto 5
        print("\n")
        a = 5
        for s in studenti:
            if a == s._cod:
                print(s._nome + "\t"+str(s.max()._voto) +
                      "\t"+str(codProg[s.max()._cod]))


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('matricola', action='store')
    #matr = parser.parse_args()
    matr = 10
    g = Gestione(matr)
    g.main()
