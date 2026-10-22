import math
import my_tools
print(math.sqrt(144))
pi = math.pi
print(math.sqrt(pi))

import random
print(random.randint(0,6))

import math as m
print(m.floor(3.7))

import my_tools

print(my_tools.greet("Danil"))
print(my_tools.add(2, 3))
print(my_tools.PI)

from my_tools import is_even
print(is_even(2))

from utils.string_tools import shout
print(shout("hello world"))

import datetime
now = datetime.datetime.now()
print(now)
print(now.year,now.hour)

import json
data = {
        "name":"Danil",
        "day": 11,
        "topic": "modules"
}
text = json.dumps(data)
print(text)
back = json.loads(text)
print(back["name"])
print(back["day"])
print(back["topic"])

import os
print(os.getcwd())
print(os.path.exists("data.json"))