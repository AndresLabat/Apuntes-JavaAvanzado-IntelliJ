package Java_Avanzado.apuntes;

public class a08_clasesAnidadas_LocalesAMetodo {

    // CLASE DENTRO DE UN METODO:

    static void run(){
        class Local {
            void metodo() {
                // method implementation
            }
        }
        // para que una clase, que esta dentro de un metodo, pueda ser utilizada,
        // se tiene que instanciar dicha clase dentro del propio metodo:
        Local local = new Local ();
        local.metodo();
    }

    public void test(){
        a08_clasesAnidadas_LocalesAMetodo objeto = new a08_clasesAnidadas_LocalesAMetodo();
        a08_clasesAnidadas_LocalesAMetodo.run();
    }

}
