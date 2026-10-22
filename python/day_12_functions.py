def double(n):
    return n * 2
f = double
print(f(5))

def apply_twice(func, value):
    return func(func(value))
print(apply_twice(double, 3))

message = "global"
def  test_scope():
    message = "local"
    print(message)
test_scope()
print(message)

def broken():
    global message
    message = message + "!"
    print(message)
broken()

def fixed(text):
    return text + "!"
message = fixed(message)
print(message)

def make_adder(n):
    def adder(x):
        return x + n
    return adder
add_five = make_adder(5)
add_ten = make_adder(10)

print(add_five(3))
print(add_ten(3))
print(add_five(100))

names = ["Danil", "Bob", "Alexander", "Ann"]
print(sorted(names, key = len))

nums = [1, 2, 3, 4, 5]
print(list(map(lambda x: x**2, nums)))
print(list(filter(lambda x: x > 2, nums)))

