public class Main {
    public static  void main(String[] args){
        Calculadora calculator = new Calculadora();
        lector a = new lector();

        String operation = a.archivo("cerrito.txt");

        String[] SplitOperation;

        SplitOperation = operation.split(" ");

        for (int i = 0; i < SplitOperation.length; i++){
            if(SplitOperation[i].equals("*") || SplitOperation[i].equals("-") || SplitOperation[i].equals("+") || SplitOperation[i].equals("/")){
                int operadorB = calculator.pila.pop();
                int operadorA = calculator.pila.pop();
                int nuevo = calculator.calculo(operadorA, operadorB,SplitOperation[i]);
                calculator.pila.push(nuevo);
            }else{
                int num = Integer.parseInt(SplitOperation[i]);
                calculator.pila.push(num);

            }
        }

        for (int i = 0; i< calculator.pila.size();i++){
            System.out.println(" Resultado final");
            System.out.println(calculator.pila.peek());
        }
    }

}
