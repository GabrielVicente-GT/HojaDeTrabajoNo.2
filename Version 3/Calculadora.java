public class Calculadora implements CalculadoraGeneral{
    StackVector<Integer> stack = new StackVector<Integer>();

    public String Calculo(String expresion){
        String operacion = "";
        boolean com = true;
        String[] SplitOperation;
        int operadorB =0;
        int operadorA =0;
        int nuevo =0;
        SplitOperation = expresion.split(" ");

        for (int i = 0; i < SplitOperation.length; i++){
            if(SplitOperation[i].equals("*") || SplitOperation[i].equals("-") || SplitOperation[i].equals("+") || SplitOperation[i].equals("/")){
                if(stack.size()>=2){
                    operadorB = stack.pop();
                    operadorA = stack.pop();
                    if(SplitOperation[i].equals("*")){
                        nuevo = operadorA*operadorB;
                     }else if(SplitOperation[i].equals("/")){
                        nuevo = operadorA/operadorB;
                     }else if(SplitOperation[i].equals("+")){
                        nuevo = operadorA+operadorB;
                    }else if(SplitOperation[i].equals("-")){
                        nuevo = operadorA-operadorB;
                    }
                    stack.push(nuevo);
                }else{
                    com = false;
                }
                
                
            }else{
                int num = Integer.parseInt(SplitOperation[i]);
                stack.push(num);
            }
        }
        if(com == true){
            operacion = Integer.toString(stack.pop());
        }else if(com == false){
            operacion = "No es posible operar";
        }
        
        return operacion;
    }
}
