# language: es
Característica: Reto tecnico choucair ll

  @TestCase
  Esquema del escenario: Creacion exitosa de pagina
    Dado que el usuario ingresa los datos personales para su autenticacion
      |ID| user | password |
      |<ID>| <user> | <password> |
    Y realiza la creacion de la pagina
      |textoarea|
      |<textoarea>|
    Entonces valida la creacion de la pagina

    Ejemplos:
      | ID | user | password | textoarea |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/paginas/crearpagina.xlsx@Datos
      |1|opensourcecms|opensourcecms|creo pagina|

  Esquema del escenario: Edicion exitosa de pagina
    Dado que el usuario ingresa los datos personales para su autenticacion
      |ID| user | password |
      |<ID>| <user> | <password> |
    Y realiza la edicion de la pagina
      |textoarea|
      |<textoarea>|
    Entonces valida la edicion de la pagina
    Ejemplos:
      | ID | user | password | textoarea |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/crearpublicacion/crearpublicacion.xlsx@Datos
      |1|opensourcecms|opensourcecms|edito pagina|

  Esquema del escenario: Edicion rapida exitosa de pagina
    Dado que el usuario ingresa los datos personales para su autenticacion
      |ID| user | password |
      |<ID>| <user> | <password> |
    Y realiza la edicion rapida de la pagina
      | titulo | slug | date | pass |
      | <titulo> | <slug> | <date> | <pass> |
    Entonces valida la edicion rapida de la pagina

    Ejemplos:
      | ID | user | password | titulo | slug | date | pass |
      ##@externaldata@./src/test/resources/co.com.choucair.certificacion.retotecnico/datadriver/edicionrapidapublicacion/crearpublicacion.xlsx@Datos
      |1|opensourcecms|opensourcecms| creo titulo | creo slug | 07-Jul | creandopassword |