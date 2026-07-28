# # Начнём с чтения и записи текстовых файлов. Главная конструкция — with open(...):
# # Запись в файл
# with open("test.txt", "w") as f:
#     f.write("Hello\n")
#     f.write("World\n")
#
# # open("test.txt", "w") — открываем файл, "w" режим записи (write)
# # with ... as f: — f это наш файл внутри блока
# # with сам закрывает файл когда блок закончился (даже если ошибка) — поэтому так и пишут
#
# # в проекте создался файл test.txt
# # Если запустишь второй раз, старое содержимое сотрётся, а не добавится.
# # Для дописывания есть режим "a" (append) — но к нему вернёмся.
#
# # Теперь чтение. Три способа:
#
# # 1. Прочитать весь файл в одну строку
# with open("test.txt", "r") as f:
#     content = f.read()
#     print(content)
#
# # 2. Построчно в список
# with open("test.txt", "r") as f:
#     lines = f.readlines()
#     print(lines)
#
# # 3. Пройтись циклом по строкам (самый частый)
# with open("test.txt", "r") as f:
#     for line in f:
#         print(line.strip())
#
# def count_lines(filename):
#     count = 0
#     with open(filename) as f:
#         for line in f:
#             count += 1
#     return count
#
# print(count_lines("test.txt"))
#
# import json
#
# data = {
#     "name": "Danil",
#     "skills": ["Python", "Git"],
#     "active": True
# }
#
# # Записать словарь в JSON-файл
# with open("data.json", "w") as f:
#     json.dump(data, f, indent=2)
#
# # import json — подключаем модуль (встроенный, ставить не надо)
# # json.dump(data, f) — пишет словарь в файл как JSON
# # indent=2 — красивые отступы, чтоб читалось
#
# # Теперь обратно — читаем JSON из файла в питоновский словарь:
# with open("data.json", "r") as f:
#     loaded = json.load(f)
#
# print(loaded)
# print(loaded["name"])
# print(loaded["skills"][0])
#
# # dump/load — работают с файлом
# # dumps/loads (с s) — работают со строкой (string).
# # Вот это пригодится для API: ответ приходит строкой, делаешь json.loads(response) → словарь.
#
# def save_results(filename, results):
#     with open(filename, "w") as f:
#         json.dump(results, f, indent=2)
# results = [
#     {"test": "login", "status": "pass"},
#     {"test": "logout", "status": "fail"}
# ]
# save_results("results.json", results)
#
# def count_passed(filename):
#     with open(filename, "r") as f:
#         loading = json.load(f)
#     count = 0
#     for item in loading:
#         if item["pass"] = item.get("pass", 0) + 1
# count_passed("results.json")

def count_words(text):
    words = text.split(" ")
    result = {}
    for word in words:
        result[word] = result.get(word, 0) + 1
    return result
print(count_words("cat dog cat bird dog cat"))


