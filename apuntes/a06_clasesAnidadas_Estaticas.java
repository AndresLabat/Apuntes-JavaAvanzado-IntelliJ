package Java_Avanzado.apuntes;

public class a06_clasesAnidadas_Estaticas {

   /*
    1. CLASES ESTATICAS ANIDADAS:

    class ClaseExterior {

        static class ClaseStaticaAnidada {

        }

        class ClaseInterna {

        }

    }

    las clases estaticas no necesitan ser instanciadas para ser llamadas;
    se llaman poniendo el nombre de la clase exterior, punto, nombre de la clase anidada;
    solo se puede llamar a los metodos estaticos.
    */

    private static int x = 1;

        public static class ClaseEstaticaAnidada {

            private void metodo (){
                 System.out.println("Metodo");
            }

    }

    public static void GenerarObjeto(){
        // este metodo tiene que ser estatico tambien para poder llamar al metodo de la clase estatica
        // declaramos un objeto de la clase anidada:
        a06_clasesAnidadas_Estaticas.ClaseEstaticaAnidada objeto = new a06_clasesAnidadas_Estaticas.ClaseEstaticaAnidada();
        objeto.metodo();
    }

}

