# https://stackoverflow.com/questions/36901/what-does-double-star-asterisk-and-star-asterisk-do-for-parameters

def foo(*args):
    for a in args:
        print(a)        

foo(1)
# 1

foo(1,2,3)
# 1
# 2
# 3


def bar(**kwargs):
    for a in kwargs:
        print(a, kwargs[a])  

bar(name='one', age=27)
# name one
# age 27

print("-----")
def func1(arg1, arg2, *args, **kwargs):
   print(arg1, arg2)
   print(args)
   print(kwargs)
temp1 = [1,2,3]
temp = {"a":1,"b":2}
func1(1, 2, *[*temp1, 5], **{**temp, "e":3})
print("-----")




def foo(a, b, c):
    print(a, b, c)

obj = {'b':10, 'c':'lee'}

foo(100,**obj)
# 100 10 lee



first, *rest = [1,2,3,4]
first, *l, last = [1,2,3,4]



def func(arg1, arg2, arg3, *, kwarg1, kwarg2):
    pass


x = [1, 2]
print([*x])
print([*x, 3, 4])

x = {1:1, 2:2}
print(x)
print({**x, 3:3, 4:4})
