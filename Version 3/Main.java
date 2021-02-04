import java.io.*;
import java.util.Vector;
public class Main {
    public static  void main(String[] args){
        Calculadora calculator = new Calculadora();
        Vector <String> varios = new Vector<String>();

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

        for(int a =0;a<varios.size();a++){
            String num = calculator.Calculo(varios.get(a));
            System.out.println();
            System.out.println(" Resultado operacion "+(a+1));
            System.out.println(num);
            System.out.println();
        }
        
    }

}
