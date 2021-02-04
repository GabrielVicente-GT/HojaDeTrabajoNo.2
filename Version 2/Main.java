import java.io.*;
import java.util.Vector;
public class Main {
    public static  void main(String[] args){
        String operation = "";
        Vector <String> varios = new Vector<String>();
        Vector <String[]> listos = new Vector<String[]>();
        Vector <Integer> ya = new Vector<Integer>();

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
        
        /*Se agrega de manera separada cada oracion a un vector con sus caracteres separados*/
        for(int a=0; a<varios.size();a++){
            listos.add(varios.get(a).split(" "));
        }

        Calculadora calculator = new Calculadora();

       for(int a= 0; a<varios.size();a++){
        for(int i= 0; i<listos.get(a).length;i++){
           if(listos.get(a)[i].equals("*") ||listos.get(a)[i].equals("+") ||listos.get(a)[i].equals("-") ||listos.get(a)[i].equals("/")){
            int numeroB = calculator.pila.pop();
            int numeroA = calculator.pila.pop();
            int nuevo = calculator.calculo(numeroA,numeroB,listos.get(a)[i]);
            calculator.pila.push(nuevo);
           }else{
            int num = Integer.parseInt(listos.get(a)[i]);
            calculator.pila.push(num);
           }
        
        }
        ya.add(calculator.pila.pop());
        calculator.pila.empty();
       }
       for(int a = 0; a<ya.size();a++){
        System.out.println("");
        System.out.println("Resultado operacion: " + (a+1));
        System.out.println(ya.get(a));
       }

      
    }

}
