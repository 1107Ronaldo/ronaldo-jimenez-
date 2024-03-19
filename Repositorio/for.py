
volar  = {
    "Aerolínea" : "wingo" ,
    "Vuelo" : "AV670" ,
    "Origen" : "CTG" ,
    "Destino" : "MDE" ,
    "Maleta" : [ 'Cabina' , 'Mano' , 'Bodega' ]
}


print( "Valores del diccionario: " )
for  key , value in volar.items ():
   print ( f" { key } : { value } " )


print ( " \n Valores del tipo de maleta: " )
for  maleta in volar [ "Maleta" ]:
    print ( maleta )