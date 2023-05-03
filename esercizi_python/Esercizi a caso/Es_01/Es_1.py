n1 = 1
n2 = 2
s1 = 'hi'
s2 = 'hello'
# punto 1

if type(n1) == type(n2):
    if n1 > n2:
        print('N1 è maggiore di n2')
    else:
        if n1 == n2:
            print('N1 è uguale a N2')
        else:
            print('N1 (', n1, ') è minore di N2 (', n2, ')')

# punto 2
# sottostringa vuol dire che all'interno della variabile s1 vi è una  stringa di codice uguale a s2 esempio s1= "world" s2= "hello world"

if type(s1) == type(s2):
    if s1 in s2:
        print("s1 è sottostringa di s2")
    else:
        if type(s1) == type(s2):
            print('s2 è una sottostringa di s1')
        else:
            print("s1 e s2 sono differenti tra di loro")
