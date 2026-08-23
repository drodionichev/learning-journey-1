class Vehicle:
    def __init__ (self, brand):
        self.brand = brand

    def start (self):
        return f"{self.brand} is starting"

class Car(Vehicle):
    def __init__ (self, brand, color):
        super().__init__(brand)
        self.color = color
    def honk(self):
        return f"{self.brand} says beep"

class ElectricCar(Car):
    def start (self):
        return f"{self.brand} is starting silently"
my_car = Car("Toyota", "red")
print(my_car.start())   # Toyota is starting  ← brand дошёл через super()
print(my_car.color)     # red                 ← своё поле
print(my_car.honk())    # Toyota says beep!

tesla = ElectricCar("Tesla", "white")
print(tesla.start())   # Tesla is starting silently  ← переопределённый
print(tesla.color)     # white                        ← от Car через цепочку
print(tesla.honk())    # Tesla says beep!             ← от Car