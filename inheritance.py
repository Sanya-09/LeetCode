class Agent:
    def __init__(self, name, age):
        print('Welcome to the Game')
        self.name = name
        self.age = age
        self.health = 100
        self.alive = True

    def curr_health(self):
        print('Current Health of', self.name, 'is', self.health)

    def punched(self):
        self.health -= 10

    def shooted(self):
        self.health -= 50

    def is_alive(self):
        if self.health <= 0:
            self.alive = False

    def info(self):
        print('Name    : ', self.name)
        print('Age     : ', self.age)
        print('Health  : ', self.health)
        print('Alive   : ', self.alive)

class Boss(Agent):  # Inheriting from Agent class
    def blow_fire(self):
        print('blow fire!')

# Creating an object of the Boss class
bs = Boss('Devansh', 1000)
bs.info()
bs.blow_fire()
