import sys
import argparse

from Squash import Squash
from Tennis import Tennis
from Giocatore import Giocatore


def main(arg):
    campi = []
    giocatori = []
    codProg = {}

    try:
        f = open("campi.txt", "r")
        line = f.readline().strip()
        while line != '':
            tok = line.split()
            cod = int(tok[0])
            tipo = tok[1]
            line = f.readline().strip()
            nome = line
            line = f.readline().strip()
            tok = line.split()
            larghezza = float(tok[0])
            lunghezza = float(tok[1])
            if tipo == "tennis":
                temperatura = float(tok[2])
                line = f.readline().strip()
                terreno = line
                line = f.readline().strip()
                costorario = float(line)
                t = Tennis(cod, nome, larghezza, lunghezza,
                           costorario, temperatura, terreno)
                campi.append(t)
                codProg.update({cod: t})
            else:
                altezza = float(tok[2])
                piano = int(tok[3])
                costorario = float(tok[4])
                s = Squash(cod, nome, larghezza, lunghezza,
                           costorario, altezza, piano)
                campi.append(s)
                codProg.update({cod: s})
            line = f.readline().strip()
        f.close()
    except IOError:
        print("IOError")
    except:
        print("Error")
        raise

    try:
        f = open("giocatori.txt", "r")
        line = f.readline().strip()
        while (line != ''):
            cod = int(line)
            line = f.readline().strip()
            nome = line
            line = f.readline().strip()
            tok = line.split()
            eta = int(tok[0])
            categoria = int(tok[1])
            g = Giocatore(cod, nome, eta, categoria)
            giocatori.append(g)
            line = f.readline().strip()
            tok = line.split()
            x = 0
            while (len(tok) != x):
                codcampo = int(tok[x])
                x = x+1
                orainiz = int(tok[x])
                x = x+1
                g.addPrenotazione(codProg.get(codcampo), orainiz)
            line = f.readline().strip()
    except IOError:
        print("IOError")
    except:
        print("Error")
        raise

    # punto 3

    print("bla bla")
    for c in campi:
        print(c.toString())

    # punto 4
    print("\n")
    for g in giocatori:
        print(g.toString())

    # punto 5
    print("\n")
    lol = int(arg.matricola)
    costot = 0
    for g in giocatori:
        costot = g.volte(lol)+costot

    print(costot)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('-corso', action='store')
    arg = parser.parse_args()

    main(arg)
