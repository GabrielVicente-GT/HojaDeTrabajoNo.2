/***
 * @author Gabriel Alejandro Vicente Lorenzo
 * Clase Main que tiene el método main que ejecuta el programa
 */

import java.io.*;
import java.util.Vector;
public class Main {
    public static  void main(String[] args){
        /***
         * Instancias de un calculadora para usar su operacion de calculo
         * Creacion de un vector para guardar todas las operaciones Postfix que tenga el .txt
         */
        Calculadora calculator = new Calculadora();
        Vector <String> varios = new Vector<String>();

        /***
         * try que lee el archivo.txt haciendo que cada linea se agregue al vector a modo de String
         */
        try{
            FileReader r = new FileReader("datos.txt");
            BufferedReader buffer = new BufferedReader(r);

            String temp ="";

            while(temp!=null){
                temp = buffer.readLine();
                if(temp == null){
                    break;
                }
                varios.add(temp);

            }
        }catch(Exception e){
            System.out.println("archivo no encontrado");
        }

        /***
         * Segun la cantidad de operaciones Postfix que existan en el vector a cada una se le aplica la operación de
         * calculo de la clase calculadora que devuelve el resultado de la sentencia Postfix y lo imprime al usuario.
         */
        for(int a =0;a<varios.size();a++){
            String num = calculator.Calculo(varios.get(a));
            System.out.println();
            System.out.println(" Resultado operacion "+(a+1));
            System.out.println(num);
            System.out.println();
        }

    }

}
