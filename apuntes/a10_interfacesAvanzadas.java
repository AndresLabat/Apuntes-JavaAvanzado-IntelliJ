package Java_Avanzado.apuntes;

public interface a10_interfacesAvanzadas {

    /*
    - las interfaces se componen de metodos abstractos (metodos sin implementacion)
    - Una interfaz puede tener atributos que siempre tienen que ser constantes (ej. final String color)
    - Podemos definir un objeto del tipo de la interfaz e instanciarlo con una clase que implemente dicha interfaz
    - Dentro de los metodos de la interfaz podemos tener el modificador "default", que si que nos permite darle cuerpo al metodo
    - Podemos usar el modificador de acceso "private", haciendo ese metodo solo accesible dentro de la interfaz.
    - Ahora podemos tener implementacion en metodos.
    */

    private void privateMethod(final String string){    //  este metodo privado solo se ha creado para accede a el en el otro metodo
        System.out.println(string);
    }
    default void defaultMethod(){   //  al tener la palabra default, se le puede dar cuerpo al metodo
        privateMethod("Hello from the default method!");
    }

    public void normalMethod();    //  este metodo es como los que hemos hecho siempre

}
