class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f"Dog(name = {self.name}, age = {self.age})"

    def __repr__(self):
        return f"Dog(name = {self.name}, age = {self.age})"

rex = Dog("Rex", 3)
print(rex)

dogs = [Dog("Rex", 3), Dog("Buddy", 5)]
print(dogs)