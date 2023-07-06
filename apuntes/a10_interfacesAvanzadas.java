package Java_Avanzado.apuntes;

public interface a10_interfacesAvanzadas {

    /*
    - las interfaces se componen de metodos abstractos (metodos sin implementacion)
    - Una interfaz puede tener atributos que siempre tienen que ser constantes (ej. final String color)
    - Podemos definir un objeto del tipo de la interfaz e instanciarlo con una clase que implemente dicha interfaz
    - Dentro de los metodos de la interfaz podemos tener el modificador "default", que si que nos permite darle cuerpo al metodo
    - Podemos usar el modificador de acceso "private", haciendo ese metodo solo accesible dentro de la interfaz.
    - Ahora podemos tener implementacion en metodos.

    DIFERENCIA ENTRE UNA INTERFAZ Y UNA CLASE ABSTRACTA:

    una CLASE ABSTRACTA unicamente se utilizara para definir subclases, es decir, siempre debera ser heredada para podert utilizar
    y sobreescribir los metodos de la clase padre, como ya sabiamos, de ella no se pueden crear instancias (objetos),
    en otras palabras, las clases abstractas nos sirven para redefinir nuevas clases sincrear nuevos objetos

    UNA interfaz sirve para que sus metodos los compartan las clases, de forma no lineal, o lo que es lo mismo, se pueden
    implementar en muchas familias

    HERENCIA ENTRE INTERFACES:

    la interfaces pueden heredar de otras interfaces con la palabra "extends", heredandose asi los metodos de la interfaz padre, aqui si
    se permite la herencia multiple, seria algo asi.

        EJEMPLO:

    public interface Visualizable extends IReadable, Serializable{

    public void setViewed();

    public Boolean isViewed();

    etc....

    Con los metodosa private y Default, podemos sobreescribir métodos y añadirles cuerpo (polimorfismo)

    }

    */

    private void privateMethod(final String string){    //  este metodo privado solo se ha creado para accede a el en el otro metodo
        System.out.println(string);
    }
    default void defaultMethod(){   //  al tener la palabra default, se le puede dar cuerpo al metodo
        privateMethod("Hello from the default method!");
    }

    public void normalMethod();    //  este metodo es como los que hemos hecho siempre

}
