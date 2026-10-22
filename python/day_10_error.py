#Задача: оберни int(part[1]) в try/except так, чтобы при некорректном возрасте
#(например "Danil,двадцать") функция не падала, а ставила age = 0.

def parse_user(csv_line):
    part = csv_line.split(",")
    try:
        age = int(part[1])       # тут может упасть, если part[1] не число
    except (ValueError, IndexError) as e:
        age = 0
        print(f"такого возраста нет: {e}")
    return {"name": part[0], "age": age}
print(parse_user("Danil,двадцать"))

def safe_divide(a, b):
    # верни результат деления a на b
    # если делят на ноль — верни None и напечатай "на ноль нельзя"
    try:
        return a / b
    except ZeroDivisionError as e:
        print(f"на ноль нельзя: {e}")
        return None
print(safe_divide(1, 0))

def get_element(lst, index):
    # верни элемент списка по индексу
    # если индекса нет (IndexError) — верни "нет такого индекса"
    # если index не число, а строка (TypeError) — верни "индекс должен быть числом"
    try:
        return lst[index]
    except IndexError:
        return "нет такого индекса"
    except TypeError:
        return "индекс должен быть числом"
print(get_element([1,2,3], 1))    # 2
print(get_element([1,2,3], 10))   # нет такого индекса
print(get_element([1,2,3], "a"))  # индекс должен быть числом

def read_config(filename):
    # попробуй открыть и прочитать файл
    # если файла нет (FileNotFoundError) — верни "файл не найден" и не падай
    try:
        with open(filename) as f:
            content = f.read()
            return content
    except FileNotFoundError:
        return "файл не найден"
print(read_config("test.txt"))          # содержимое файла
print(read_config("нет_такого.txt"))    # файл не найден

