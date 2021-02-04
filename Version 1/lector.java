import java.io.*;
public class lector {
    public String archivo(String direccion){
        String operation = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
            operation = temp;
        }catch(Exception e){
            System.out.println("No se encuentra el archivo");
        }
        return operation;
    }
}
