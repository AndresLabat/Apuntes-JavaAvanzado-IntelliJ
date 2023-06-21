package Java_Avanzado.apuntes;

public class a05_clasesAnidadas {

    /* llamaremos "CLASE EXTERIOR" a la clase que contiene otra clase, y "CLASE ANIDADA" a la clase declarada dentro de otra clase
      esto hace mas facil y claro reconocer la dependencia de una clase respecto a otra

    EJEMPLO:

    class ClaseExterior {

        class ClaseAnidada {

        }

    }

    Dentro de las clases anidadas, hay de distintos tipos:

    - Clases estaticas
    - Inner classes (como la del ejemplo anterior)
    - Clases dentro de metodos
    - Anonymous Inner classes (son siempre clases abstractas, osease no se pueden instanciar, se usan para herencia)


    1. CLASE ESTATICA: son básicamente lo mismo que una clase no estática,
    pero hay una diferencia: una clase estática no puede ser instanciada.
    solo podemos llamar a metodos y elementos de su misma naturaleza

    2. CLASE ANIDADA: Las clases anidadas te permiten agrupar lógicamente clases
    que solo se utilizan en un lugar, por lo tanto, esto aumenta el uso de la
    encapsulación y crea un código más fácil de leer y de mantener.
    pueden llamar a cualquier tipo de elemento o metodo

     */
}
