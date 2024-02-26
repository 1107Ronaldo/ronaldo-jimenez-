class persona:
    def __init__(self,nombre,apellido,cedula,celular,correo):
        self.nombre=nombre
        self.apellido=apellido
        self.cedula = cedula
        self.celular = celular
        self.correo = correo
        
    def Obtenernombre(self):
        return f'mi nombre es {self.nombre}'
    def Obtenerapellido(self):
        return f'mi apellido es {self.apellido}'
    def Obtenercedula(self):
        return f'mi cedula es {self.cedula}'
    def Obtenercelular(self):
        return f'mi ceular es {self.celular}'
    def Obtenercorreo(self):
        return f'mi correo es {self.correo}'
    
p = ("ronaldo","jimenez","1043299716","3042656058","ronaldo@gmail.com")
