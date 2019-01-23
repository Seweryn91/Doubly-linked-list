@SuppressWarnings("unchecked")
public class DoublyLinkedList<T> {

    class Node <T>{
        private T content;
        private Node previous;
        private Node next;

        Node(T content) { this.content = content; }

        public Node previous() { return this.previous; }

        public Node next() { return this.next; }

        public T getContent() { return this.content; }

        public void setPrevious() {      }

        public void setNext() {        }

        @Override
        public String toString() { return content.toString(); }

    }

    private Node head;
    private Node tail;
    private int size = 0;

    public Node head() {     }

    public Node tail() {     }

    public void add(T element) {    }

    public void remove(int index) {     }

    public void insert(int index, T element) {}

    public Node get(int index) {    }

    public String toString() {     }

    public Node popNode(Node node) { }

    public Node setTail() {}

    private Node findNode(int index){}
}
