import java.util.Vector;

public class StackVector<T> implements Stack<T>{


    Vector <T> pila = new Vector<T>();

    @Override
    public void push(T num) {
        pila.add(num);
    }

    @Override
    public boolean empty() {
        pila.removeAll(pila);
        boolean cantidad = false;
                if (pila.size()==0){
                    cantidad = true;
                }
        return cantidad;
    }

    @Override
    public int size() {
        return pila.size();
    }

    @Override
    public T pop() {
        T num = peek();
        pila.removeElementAt(pila.size()-1);
        return num;
    }

    @Override
    public T peek() {
        return pila.get(pila.size()-1);
    }
}
