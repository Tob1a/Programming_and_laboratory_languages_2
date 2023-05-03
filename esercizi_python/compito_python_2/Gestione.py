import sys
import argparse


from Dipendenti import Dipendenti
from Trainer import Trainer
from Nutrizionista import Nutrizionista
from Cliente import Cliente
from Servizio import Servizio


class Gestione:
    def __init__(self, arg):
        self._arg = arg

    def main(self):
        dipendenti = []
        clienti = []
        codProg = {}

        # punto 1

        try:
            f = open("dipendenti.txt", "r")
            line = f.readline().strip()
            while(line != ''):
                tok = line.split()
                cod = int(tok[0])
                tipo = tok[1]
                line = f.readline().strip()
                nome = line
                line = f.readline().strip()
                tok = line.split()
                if tipo == "trainer":
                    ore = int(tok[0])
                    costo = float(tok[1])
                    line = f.readline().strip()
                    specialita = line

                    t = Trainer(cod, nome, costo, ore, specialita)
                    dipendenti.append(t)

                    codProg.update({cod: t})
                else:
                    tel = int(tok[0])  # ci va il long
                    medico = bool(tok[1])
                    appuntamenti = int(tok[2])
                    costo = float(tok[3])

                    n = Nutrizionista(cod, nome, costo, tel,
                                      medico, appuntamenti)
                    dipendenti.append(n)

                    codProg.update({cod: n})
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
                cod = int(line)
                line = f.readline().strip()
                nome = line
                c = Cliente(cod, nome)
                clienti.append(c)
                line = f.readline().strip()

                tok = line.split()

                while(len(tok) == 2):
                    codcliente = int(tok[0])
                    ore = float(tok[1])
                    # chiamata funzione all'interno di clienti per aggiungere
                    c.addServizio(codProg.get(codcliente), ore)

                    line = f.readline().strip()

                    tok = line.split()

                line = f.readline().strip()
            f.close()

        except IOError:
            print("IOError")
        except:
            print("Error")
            raise

        # punto 3
        print("nome, codice, tipo, ore settimanali, specialità, telefono, medico, app.sett., costo orario")
        for d in dipendenti:
            print(d.toString())

        # punto 4
        print("\n")
        for c in clienti:
            print(str(c.toString()))

        # punto 5
        a = 0
        b = 0
        ciaone = 0
        duna = ""
        nome = ""
        for d in dipendenti:
            for c in clienti:
                b = c.numServ(d.cod)
                if ciaone >= a:
                    a = a + b
                    nome = d.nome
            ciaone = a
            a = 0
            duna = nome
        print(duna + "\t" + str(ciaone))


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('matricola', action='store')
    #matr = parser.parse_args()
    matr = 10
    g = Gestione(matr)
    g.main()
