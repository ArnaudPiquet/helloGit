print("Hello, Python")
x = 2
Y = [2,3,4]

#Une fonction
def une_fonction_fib(n):
    a, b = 0, 1
    while a < n:
        print(a, end=' ')
        a, b = b, a+b
    print()
une_fonction_fib(1000)

name = input("un input : \n")
print('hi ', name)


class UneClasse:
    def __init__(self):
        self.data = []
        self.varClass = 'OUI'


x = UneClasse()
print(x.varClass)