public interface Stack<T> {

    void    push(T num);
    boolean empty();
    int     size();
    T       pop();
    T       peek();
}
