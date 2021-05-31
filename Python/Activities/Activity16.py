class Car:
    'this is activity 16'
    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")

c1 = Car("Suzuki","Swift","2021","Manual","Red")
c2 = Car("Maruti","800","2000","Manual","White")
c3 = Car("Toyoto","Corolla","2010","Manual","Black")

c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()
   
   
