import time


def my_decorator(func):
    def wrapper ():
        print("Start")
        func()
        print("End")
    return wrapper

def greet():
    print("Hello")

greet = my_decorator(greet)
greet()

@my_decorator
def farewell():
    print("Bye, Danil!")

farewell()

def my_decorator(func):
    def wrapper(*args, **kwargs):
        print("Start")
        result = func(*args, **kwargs)
        print("End")
        return result
    return wrapper

@my_decorator
def add(a, b):
    return a + b

result = add(3, 5)
print(result)

import time
def timer(func):
    def wrapper(*args, **kwargs):
        start = time.time()
        result = func(*args, **kwargs)
        end = time.time()
        print(f"{func.__name__} took {end - start:.4f} sec")
        return result
    return wrapper

@timer
def slow_function():
    total = 0
    for i in range(10_000_000):
        total += 1
    return total
slow_function()