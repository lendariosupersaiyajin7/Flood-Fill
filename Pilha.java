public class Pilha<T> {
     Node<T> top;

    
    public void push(T valor) {
        Node<T> novo = new Node<T>(valor);
        novo.proximo = top;
        top = novo;
    }

    public T pop() {
        if(isEmpty()){
            throw new RuntimeException("pilha vazia");
        } else {
            T valor = top.valor;
            return valor;
        }
    }

    public boolean isFUll(){
        return false;
    }

    public boolean isEmpty() {
        return top == null;
    }

}