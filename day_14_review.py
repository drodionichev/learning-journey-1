# Задача 1 (строки + условия)
# Напиши функцию check_password(password), которая проверяет пароль по правилам:
#
# длина минимум 8 символов
# есть хотя бы одна цифра
#
# Возвращает True, если оба условия выполнены, иначе False.

def check_password(password):
    return len(password) >=8 and any(char.isdigit() for char in password)

print(check_password("abc"))       # False — короткий и без цифр
print(check_password("abcdefgh"))  # False — длина ок, но цифры нет
print(check_password("abcd1234"))  # True  — и длина, и цифра есть

# Напиши функцию count_words(text),
# которая принимает строку из слов и возвращает словарь: слово → сколько раз встретилось.

def count_word(text):
    result = {}
    for word in text.split():
        result[word] = result.get(word, 0) + 1
    return result
print(count_word("apple banana apple cherry banana apple"))

# Напиши функцию count_long_words(text, min_length),
# которая считает, сколько слов в строке длиннее или равны min_length символов.

def count_long_words(text, min_length):
    count = 0
    for word in text.split():
        if len(word) >= min_length:
            count += 1
    return count

print(count_long_words("cat elephant dog hippopotamus", 5))   # 2

#Напиши функцию average_length(words), которая принимает список слов и возвращает среднюю длину слова.

def average_length(words):
    count = 0 # количество слов
    total_length = 0 # сумма длин

    for word in words.split():
        count +=1
        total_length += len(word)
    return total_length / count

print(average_length("cat elephant dog hippopotamus"))

#Напиши функцию safe_divide(a, b), которая делит a на b, но не падает, если делят на ноль.
#Если b == 0 — возвращает строку "Cannot divide by zero", иначе — результат деления.

def safe_divide(a, b):
    try:
        return a / b
    except ZeroDivisionError:
        return "Cannot divide by zero"
print(safe_divide(5, 0))