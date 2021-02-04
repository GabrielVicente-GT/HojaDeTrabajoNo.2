public class Calculadora {
    StackVector<Integer> pila = new StackVector<Integer>();

    public int calculo(int a, int b, String sentencia){
        int operacion = 10;
        if (sentencia.equals("*")){
            operacion = a*b;
        }else if (sentencia.equals("/")){
            operacion = a/b;
        }else if (sentencia.equals("+")){
            operacion = a+b;
        }else if (sentencia.equals("-")){
            operacion = a-b;
        }

        return operacion;
    }
}
