import sys
import argparse

from cliente import cliente
from Noleggio import Noleggio
from furgone import furgone
from auto import auto


class gestione:
    def __init__(self, arg):
        self.arg = arg

    def main(self):
        veicoli = []
        clienti = []
        codProg = {}

        try:
            f = open("veicoli.txt", "r")
            line = f.readline().strip()
            while line != '':
                tok = line.split()
                cod = int(tok[0])
                tipo = tok[1]
                targa = tok[2]
                line = f.readline().strip()
                modello = line
                line = f.readline().strip()
                marca = line
                line = f.readline().strip()
                if tipo == "auto":
                    tok = line.split()
                    cilindrata = int(tok[0])
                    bagaglio = int(tok[1])
                    line = f.readline().strip()
                    costo = float(line)
                    a = auto(cod, targa, modello, marca,
                             costo, cilindrata, bagaglio)
                    veicoli.append(a)
                    codProg.update({cod: a})

                else:
                    categoria = line
                    line = f.readline().strip()
                    tok = line.split()
                    posti = int(tok[0])
                    vano = bool(tok[1])
                    line = f.readline().strip()
                    costo = float(line)
                    fu = furgone(cod, targa, modello, marca,
                                 costo, categoria, posti, vano)
                    veicoli.append(fu)
                    codProg.update({cod: fu})
                line = f.readline().strip()
            f.close()

        except IOError:
            print("IOError")
        except:
            print("Error")
            raise

        # punto 2

        try:
            f = open("clienti.txt", "r")
            line = f.readline().strip()
            while line != '':
                tok = line.split()
                nome = tok[0]
                cognome = tok[1]
                line = f.readline().strip()

                c = cliente(nome, cognome)
                clienti.append(c)
                tok = line.split()
                x = 0
                while (len(tok) != x):
                    cod = int(tok[x])
                    x = x+1
                    giorni = int(tok[x])
                    x = x+1
                    # chiamata a funzione
                    c.addVeic(codProg.get(cod), giorni)
                line = f.readline().strip()
            f.close()
        except IOError:
            print("IOError")
        except:
            print("Error")
            raise

        # punto 3

        print("tipo, targa, codice, modello, marca, costo giornaliero, cilindrata, bagagliaio, categoria, numero di\n" +
              "posti, vano di carico")
        for v in veicoli:
            print(v.toString())

        #punto 4

        print("\n")
        for c in clienti:
            print(c.toString())


        #punto 5
        print("\n")
        t = 3 #comando dato in arg
        bellissimo = 0
        for c in clienti:
            bellissimo = c.getmassimo(t) + bellissimo
        print(str(bellissimo))



if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('matricola', action='store')
    #matr = parser.parse_args()
    matr = 10
    g = gestione(matr)
    g.main()
