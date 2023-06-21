package Java_Avanzado.apuntes;


public class a09_enumerations {

    public static void main(String[] args) {

        System.out.println(Day.MONDAY);

        System.out.println(Day.MONDAY.getSpanish());
    }

    /*
    Los enumerations son tipos de datos muy especiales pues es el único tipo de
    dato que posee una colección de constantes, al ser constantes estaremos
    obligados a escribirlos con mayúsculas.

    Usaremos enum cada vez que necesitemos representar un conjunto fijo de constantes.
    Los enumerations pueden tener atributos, métodos y constructores
    Por ejemplo los días de la semana:
     */

    public enum Day{
        SUNDAY("Domingo"),
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado");

        private String spanish;      //  atributo
        private Day (String s){      //  metodo
            spanish = s;
        }
        public String getSpanish(){   //  metodo
            return spanish;
        }
    }

}
