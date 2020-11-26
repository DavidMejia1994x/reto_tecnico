# language: es
Característica: Reto tecnico choucair

  @TestCase1
  Esquema del escenario: Registro exitoso en pagina
    Dado que el usuario ingresa al sitio e ingresa los datos personales
     |ID| nombres | apellidos | email | mesNacimiento | diaNacimiento | yearNacimiento |
     |<ID>| <nombres> | <apellidos> | <email> | <mesNacimiento> | <diaNacimiento> | <yearNacimiento> |
    Y verifica campos autodetectados
     | ciudad | codigoPostal | Pais |
     | <ciudad> | <codigoPostal> | <Pais> |
    Y valida los datos de su equipo e ingresa los datos de su dispositivo
     | equipo | version | lenguaje | celular | modelo | sistemaOperativo |
     | <equipo> | <version> | <lenguaje> | <celular> | <modelo> | <sistemaOperativo> |
    Entonces ingresa claves y valida su registro
     | clave | confirmarClave |
     | <clave> | <confirmarClave> |

    Ejemplos:
      | ID | nombres | apellidos | email | mesNacimiento | diaNacimiento | yearNacimiento | ciudad | codigoPostal | Pais |equipo| version | lenguaje | celular | modelo | sistemaOperativo | clave | confirmarClave |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/registrousuario/registrarusuarios.xlsx@Datos
	|1|David Mauricio|Mejia Arias|davidmma2012@hotmail.com|December|8|1994|Medellin|050015|Colombia|Windows|10|Spanish|Alcatel|MD01|Android 2.0|Davidmejia8|Davidmejia8|




	



