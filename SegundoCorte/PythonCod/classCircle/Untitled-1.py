class Circle:
    pi=3.14
    
    def __init__(self, diameter):
        self.radius= diameter / 2
    
    
    def area(self):
        return self.pi*self.radius**2
    
    def perimeter(self):
        return self.pi*self.radius*2

medium_pizza = Circle(12)

print ("El area de la pizza es ", medium_pizza.area())
print ("El perimetro de la pizza es ", medium_pizza.perimeter())

lote = Circle(100)

print("El area del lote es", lote.area())