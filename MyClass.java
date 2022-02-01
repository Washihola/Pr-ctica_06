/**
 * Este es un programa ejemplo de cambio de referencia
 * @author Sin autor, sacado de:
 * http://gregorgonzalez.com.ve/blog/parametros-por-valor-o-por-referencia-en-java/
 * @version 1.0
 */
public class MyClass {
    /**
     * Denotamos el valor del array
     * @param args
     */
    public static void main(String args[]){
        String[] array = new String[1];
      
        cambiarReferencia(array);
        System.out.println("El valor del array es: " + array[0]);
    }
    /**
     * Usamos el array para modificar los valores iniciales
     * @param array
     */
    public static void cambiarReferencia(String[] array){
       array = new String[1];
       array[0] = "Hola Mundo";
    }
}