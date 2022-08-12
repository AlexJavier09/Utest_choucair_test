#Autor: Alex Mendez
#language: es
Característica: : Registrar un usuario en utest
  Escenario: el usuario quiere registrarse en la pagina web
    Dado el usuario esta en la pagina home de utest y accedio con el boton de inicio

    Cuando el usuario rellena la informacion del primer formulario
      |strNombre|strApellido|strCorreo              |strMesN  |strDiaN|strAnioN|strLenguaje|strCuidad   |strZip   | strPais   | strRegion| strComputadora  |  strVersion         |  strLenguajeComp  | strCelular  |  strModelo       | strSistemaOP  |strContrasenia | strConfirmarContra |
      |Alex     |Mendez     |abc@g.com              | April   |9      |1998    |Spanish    | David      | 0420    | Panama    |          | Windows         |   Windows 11        | English           | Xiaomi      | Poco M3 Pro      | Android 12    |cxKU8u4a&@d1   | cxKU8u4a&@d1       |


    Entonces el usuario ha completado el registro enS la pagina de Utest
    |strFinalizado             |
    |Complete Setup            |
