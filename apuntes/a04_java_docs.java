package Java_Avanzado.apuntes;

public class a04_java_docs {

    // CREACION DE TAGS QUE GENERAN HTML, CUANDO JAVA NOS SUGIERA ESTAS CLASES, METODOS, ETC, TAMBIEN LO HARA CON SU DESCRIPSION CREADA POR NOSOTROS:

    // a la hora de hacer comentarios (tags), hay una manera que no he usado aun, esta manera es:

    // SIEMPRE se crean en la linea inmediatamente anterior al objeto, clase, metodo...a comentar

    /**documentacion*/

        /* todo lo que este dentro sera un comentario de documentacion llamado "doc comment"

           dentro de este tipo de comentario podemos generar codigo HTML
           para las clases, seguira la siguiente estructura:

          /**
          * [descripcion corta/titulo]
          * <p>                              ->  esto indica que tiene un parrafo de separacion
          * [descripcion larga]
          *
          * [author, versio, params, returns, throws, see, other tags]
          * [see also]
          */

    //  EJEMPLO 1 (descripcion inicial del proyecto):

    /**
     * <h1> AmazonViewer</h1>                             ->  h1 indica que es el titulo
     * Amazon viewer es un programa que permite visualizar Movies y Series con sus respectivos Chapters,
     * Books y Magazines. Te permite generar reportes generales con fecha y dia.
     * <p>
     * Existen algunas reglas como...
     *
     * @author  Andres
     * @version 1.1
     * @since   2018
     *
     * */

    //  EJEMPLO 2 (documentacion para metodos):

    /**
     * Este metodo captura el tiempo exacto de inicio de visualizacion
     * <br>                             ->  esto indica que tiene una linea de separacion
     * @param   dateI es un objeto (@code Date) con el tiempo de inicio exacto
     * @return  devuelve la fecha y hora capturada
     * */

    // el metodo era este: Date startToSee(Date date1){return ...}

    //  EJEMPLO 3 (documentacion para extends de clases e implements de interfaces:

    /**
     * Hereda de {@link File}
     * Implementa de {@link IVisualizable}
     * */

    // la clase era esta: public class Movie extends Film implements IVisualizable{

    //  EJEMPLO 4 (para indicar que un metodo tiene una procedencia, osease ha sido heredado y sobrescrito por polimorfismo):

    /**
     * {inheritDoc}
     * @see nombreClase     -> esto indica que es recomendable que tambien mires en esta clase
     * */

    //  para generar el JAVA DOC: Tools -> Generate JavaDoc...
    //  seleccionas si quieres todo el proyecto o bien solo el package en el que estas
    //  seleccionas en "output directory" donde quieres que genere la documentacion y le das a "generate"
    //  luego te vas a la carpeta donde se ha generado la documentacion u abres el archivo "Index"
}
