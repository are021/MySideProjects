class Character:
    weapons = ["Sword","Spear","Dagger"]
    def __init__(self,name,weaponIndex):
        self.name = name
        self.weapon = Character.weapons[weaponIndex]

    def __str__(self):
        return self.weapon