class Cat:
    def __init__(self, name, color):
        self.name = name
        self.color = color

    def meow(self):
        return f"{self.name} says meow"

my_cat = Cat("Whiskers", "black")
print(my_cat.name)
print(my_cat.color)
print(my_cat.meow())

class Counter:
    def __init__(self):
        self.count = 0

    def increment(self):
        self.count +=1

    def get_count(self):
        return self.count

c = Counter()
c.increment()
c.increment()
c.increment()
print(c.get_count())   # 3

class BankAccount:
    def __init__(self, owner, balance=0):
        self.owner = owner
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount > self.balance:
                return "Insufficient funds"
        self.balance -= amount

    def get_balance(self):
        return self.balance

acc = BankAccount("Danil", 100)
acc.deposit(50)
print(acc.get_balance())   # 150
acc.withdraw(30)
print(acc.get_balance())   # 120
print(acc.withdraw(1000))  # Insufficient funds

acc = BankAccount("Danil", 100)
print(acc.withdraw(1000))   # Insufficient funds
print(acc.get_balance())    # должно остаться 100, а не уйти в минус!

class Student:
    def __init__(self, name):
        self.grades = []

    def add_grade(self, grade):
        self.grades.append(grade)

    def average(self):
        if len(self.grades) == 0:
            return "делить на ноль низя"
        return sum(self.grades) / len(self.grades)
s = Student("Danil")
s.add_grade(5)
s.add_grade(4)
s.add_grade(3)
print(s.average())    # 4.0

empty = Student("Bob")
print(empty.average())   # 0  — оценок нет, но не падаем
