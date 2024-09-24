public class Fila<T> {
    private Node<T> top;  
    private Node<T> base; 
    private int sizeAtual;

    public Fila() {
        this.top = null;
        this.base = null;
        this.sizeAtual = 0;
    }

    public void add(T item) {
        Node<T> novoNode = new Node<>(item);

        if (isEmpty()) {
            base = novoNode;
            top = novoNode;
        } else {
            top.proximo = novoNode;
            top = novoNode;
        }
        sizeAtual++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("fila vazia! 🤣");
        }
        T valorRemovido = base.valor;
        base = base.proximo;
        sizeAtual--;

        if (base == null) {  
            top = null;
        }
        return valorRemovido;
    }

 
    public void clear() {
        top = null;
        base = null;
        sizeAtual = 0;
    }


    public boolean isFull() {
        return false;  
    }

    public boolean isEmpty() {
        return sizeAtual == 0;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("fila vazia! 🤣🤣");
        } else {
            Node<T> atual = base;
            while (atual != null) {
                System.out.println(atual.valor);
                atual = atual.proximo;
            }
        }
    }

    public int size() {
        return sizeAtual;
    }
}
