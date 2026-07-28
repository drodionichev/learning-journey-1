stack = [1,2,3]
stack.append(5)
top = stack[-1]
def is_empty(stack):
    return len(stack) == 0
print(top)
print(stack)
print(is_empty(stack))