# language: es
Característica: Reto tecnico choucair ll

  @TestCase
  Esquema del escenario: Creacion exitosa de publicacion
    Dado que el usuario ingresa los datos personales para su autenticacion
      |ID| user | password |
      |<ID>| <user> | <password> |
    Y realiza la creacion de la publicacion
      |textoarea|
      |<textoarea>|
    Entonces valida la creacion de la publicacion
    Ejemplos:
      | ID | user | password | textoarea |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/crearpublicacion/crearpublicacion.xlsx@Datos
      |1|opensourcecms|opensourcecms|creacion pagina|

  Esquema del escenario: Edicion exitosa de publicacion
    Dado que el usuario ingresa los datos personales para su autenticacion
      |ID| user | password |
      |<ID>| <user> | <password> |
    Y realiza la edicion de la publicacion
      |textoarea|
      |<textoarea>|
    Entonces valida la edicion de la publicacion
    Ejemplos:
      | ID | user | password | textoarea |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/crearpublicacion/crearpublicacion.xlsx@Datos
      |1|opensourcecms|opensourcecms|edicion pagina|

  @TestCase3
  Esquema del escenario: Edicion rapida exitosa de publicacion
    Dado que el usuario ingresa los datos personales para su autenticacion
      |ID| user | password |
      |<ID>| <user> | <password> |
    Y realiza la edicion rapida de la publicacion
      | titulo | slug | date | pass |
      | <titulo> | <slug> | <date> | <pass> |
    Entonces valida la edicion rapida de la publicacion

    Entonces valida la edicion de la publicacion
    Ejemplos:
      | ID | user | password | titulo | slug | date | pass |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/edicionrapidapublicacion/crearpublicacion.xlsx@Datos
      |1|opensourcecms|opensourcecms| creo titulo | creo slug | 07-Jul | creandopassword |




