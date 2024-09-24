public class Node<T> {
    T valor;
    Node<T> proximo;

    public Node() {}

    public Node(T valor) {
        this.valor = valor;
        this.proximo = null; 
    }
}
