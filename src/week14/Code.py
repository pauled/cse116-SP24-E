class GameItem:
    bob="what"
    def __init__(self, xLoc, yLoc):
        self.xLoc =  xLoc
        self.yLoc = yLoc

    def move(self,x,y):
        self.xLoc+=x
        self.yLoc+=y
    def __str__(self):
        return "(x: "+str(self.xLoc)+", y: "+str(self.yLoc)+")"

class HealthPotion(GameItem):
    def __init__(self,x,y,heal):
        super().__init__(x,y)
        self.heal=heal
    def __str__(self):
        temp=super().__str__()
        return temp+" heal: "+str(self.heal)
    
location=HealthPotion(1,2,10)

location.move(3,4)
print(location.xLoc)
print(location)