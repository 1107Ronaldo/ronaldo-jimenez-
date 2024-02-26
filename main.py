from persona import persona

p= persona("ronaldo","apellido","cedula","celular","correo")
print(p.Obtenernombre())

p= persona("ronaldo","jimenez","cedula","celular","correo")
print(p.Obtenerapellido())

p= persona("ronaldo","jimenez","1043299716","celular","correo")
print(p.Obtenercedula())

p= persona("ronaldo","jimenez","1043299716","3042656058","correo")
print(p.Obtenercelular())

p= persona("ronaldo","jimenez","1043299716","3042656058","ronaldo@gmail.com")
print(p.Obtenercorreo())