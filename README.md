# Recursos Android para Curso introductorio a Android
# Gobierno Regional del Callao

API a trabajar

#LOGIN
http://192.241.148.57:4000/api/users/login


Datos a enviar (POST):

{
"email":"test@abc.com",
"password":"123123"

}




Datos de respuesta exitosa
{
  "id": "oUvye7XQXSZ7lSXC3HvmifaqROcEBfrW8vB7uRu5iPQgMtznoxMPostwnJjiNfsM",
  "ttl": 1209600,
  "created": "2016-11-30T06:12:31.280Z",
  "userId": "583e6dc8ff0dba0c1405cda6"
}

#TRAER DATOS USUARIO

API
http://192.241.148.57:4000/api/users/users/{id}/

Por ejemplo
http://192.241.148.57:4000/api/users/583e6dc8ff0dba0c1405cda6



Datos de la Respuesta exitosa

{
  "first_name": "Usuario",
  "last_name": "Prueba",
  "gender": "M",
  "birth_date": "17/04/1994",
  "email": "test@abc.com",
  "id": "583e6dc8ff0dba0c1405cda6"
}
