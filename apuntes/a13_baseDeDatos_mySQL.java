package Java_Avanzado.apuntes;

public class a13_baseDeDatos_mySQL {

    /*
    1. JDBC Driver:

    Es un conector (que hay que instalar) que nos permite enlazarnos a la base da datos

    2. JDBC API (Java Data Base Connectivity):

    Es una API compuesta por varias clases Operaciones a base de datos

    COMPONENTES DE JDBC API:

    - DriverManager: nos permite crear una instancia de la conexion generando un objeto
    - Connection: nos genera la sesion cuando nos conectamos a la base de datos y se queda sin vida cuando nos desconectamos
    - Statement: nos ayuda a traer datos de una tabla especifica
    - PreparedStatement: nos ayuda a traer datos de una tabla especifica, pero nos permite recibir parametros dentro de la clausula WHERE
    - ResultSet: es una interfaz nos ayuda a manejar y extraer los datos una vez obtenidos para finalmente convertirlos en objetos

    UN "QUERY" ES UNA PETICION DE DATOS A UNA BASE DE DATOS (una consulta)
        executeQuery(sqlString): se usa para ejecutar un SELECT y devuelve un ResultSet
        execute(sqlString): recibe cualquier tipo de Query y lo ejecutara, segun lo que hayas ejecutado devuelve un Boolean o un ResultSet

    UN "CRUD" (Create, Read, Update and Delete) SON LA FUNCIONES BASICAS EN BASES DE DATOS
        executeUpdate(sqlString): se usa para ejecutar INSERT, UPDATE, DELETE, ETC

    ------------------------------------------------------------------------------------------------

    PHPMYADMIN:

    Para montar la base de datos y enfocarme en el proyecto utilizaré lo más simple y sencillo de manejar, este es phpmyadmin

    1) abrelo e inicia el servidor MySQL y Apache
    2) Una vez iniciados los servicios abriremos el navegador e iremos al siguiente enlace: http://localhost/phpmyadmin/
    3) Se ha abierto el panel donde crearemos nuestra base de datos así que lo primero que harás será crear un usuario
    llamado amazonviewer para ello iremos a Cuentas de usuario
    4) Buscaremos la opción de Agregar Cuenta de Usuario
    5) Capturaremos el nombre de usuario y password, en ambos pondremos amazonviewer en Host seleccionaremos Local y finalmente
    haremos Check en la opción: Crear base de datos con el mismo nombre y otorgar todos los privilegios. Para después dar click en Continuar
    6) Verás que ahora del lado izquierdo estará la base de datos creada, selecciónala y da click en importar.
    Descarga la base de datos de aquí: https://drive.google.com/file/d/1uneLZrRZ0y1ASOUkVzzw7qRQwrS0Ui-d/view?usp=sharing
    7) Ahora da click en Seleccionar archivo y pon el archivo sql de la base de datos, En seguida verás la base de datos creada
    8) Lo único que nos faltará será descargar la librería que será el conector entre nuestra base de datos MySQL y nuestro proyecto
    https://dev.mysql.com/downloads/file/?id=498587

    9) agregar el conector en intelliJ, copiamos el archivo del connector en la carpeta del proyecto, a continuacion
    vamos a File -> Project Structure -> Libraries -> le damos al simbolo "+" y seleccionamos el conector, de damos a apply y accept.

     */
}
