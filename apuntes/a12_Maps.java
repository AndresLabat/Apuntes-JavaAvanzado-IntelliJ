package Java_Avanzado.apuntes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class a12_Maps {

    public static void main(String[] args) {

    /* Un Mapa (MAP) está definido por un conjunto de claves, una colección de valores y un conjunto de pares
    clave-valor (también llamadas entradas), que son realmente los elementos de los que está compuesto.

    Permite aplicar una función dada a cada elemento de una colección y devolver una nueva colección con los resultados

    TIPOS DE MAPS:

    - HASHMAP: Los elementos no se ordenan. No aceptan claves duplicadas ni valores nulos.
    EJEMPLO: */

        Map<Integer, String> map = new HashMap<Integer, String>();

        //	COMPUESTO DE UNA CLAVE, Y LUEGO UN VALOR (QUE PUEDE SER UNA CLASE)

        map.put(10, "clave1");
        map.put(20, "clave2");
        map.put(30, "clave3");

        map.put(30, "clave4");		//	substituye el valor de 30 y, sino existe, crealo
        map.replace(30, "clave5");	//	substituye el valor de 30
        map.remove("clave2");	//	elimina del mapa la entrada con "clave2"

        System.out.println(map.get(10));	//	yo le digo la clave, y me devuelve el valor

        System.out.println(map);	//	me imprime el mapa en horizontal

        for(Integer i:map.keySet()) {	//	PARA IMPRIMIR LAS CLAVES
            System.out.println(i);
        }

        for(String i:map.values()) {	//	PARA IMPRIMIR LOS VALORES
            System.out.println(i);
        }

        for(Map.Entry<Integer, String> i:map.entrySet()) {  // PARA IMPRIMIR AMBOS
            System.out.println("Elemento clave es: " + i.getKey());
            System.out.println("Elemento valor es: " + i.getValue());
        }

     /*
    - LINKEDHASHMAP: Ordena los elementos conforme se van insertando; provocando que las
    búsquedas sean más lentas que las demás clases. EJEMPLO:    */

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

    /*
    - TREEMAP: El Mapa lo ordena de forma “natural”. Por ejemplo, si la clave son valores
    enteros (como luego veremos), los ordena de menos a mayor. EJEMPLO: */

        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

    }
}