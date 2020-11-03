def divide_by_four(input_number):
    return input_number/4
result = divide_by_four(16)
# result now holds 4
print("16 divided by 4 is " + str(result) + "!")
result2 = divide_by_four(result)
print(str(result) + " divided by 4 is " + str(result2) + "!")
def create_special_string(special_item):
    return "Our special is " + special_item + "."

special_string = create_special_string("banana yogurt")

print(special_string)

def calculate_age(current_year, birth_year):
    age = current_year - birth_year
    return age

my_age = calculate_age(2049, 1993)
dads_age = calculate_age(2049, 1953)
print("I am " + str(my_age) + " years old and my dad is " + str(dads_age) +  "years old")

time = "3pm"
mood = "good"

def report():
    print("The current time is " + time)
    print("The mood is " + mood)

print("Beginning of report")

report()

train_mass = 22680
train_acceleration = 10
train_distance = 100

bomb_mass = 1
def f_to_c(f_temp):
    c_temp = (f_temp - 32) * 5/9
    return c_temp
f100_in_celsius = f_to_c(100)

def c_to_f(c_temp):
    f_temp = c_temp * (9/5) + 32
    return f_temp
c0_in_fahrenheit = c_to_f(0)
print(c0_in_fahrenheit)

def get_force(mass, acceleration):
    return mass * acceleration
train_force = get_force(train_mass, train_acceleration)
print(train_force)
print("The GE train supplies " + str(train_force) + " Newtons of force")

def get_energy(mass, c = 3*10**8):
    return mass * c*c
bomb_energy = get_energy(bomb_mass)
print(bomb_energy)
print("A 1kg bomb supplies " + str(bomb_energy) + " Joules.")

def get_work(mass, acceleration, distance):
    force = get_force(mass, acceleration)
    return force * distance
train_work = get_work(train_mass, train_acceleration, train_distance)
print("The GE train does " + str(train_work) + " Joules of work over " + str(train_distance) + " meters.")



def greater_than(x, y):
    if x > y:
        return x
    if y > x:
        return y
    if x == y:
        return "These numbers are the same"

def graduation_reqs(credits):
    if credits >= 120:
        return "You have enough credits to graduate!"

print(graduation_reqs(120))
print(greater_than(10,10))