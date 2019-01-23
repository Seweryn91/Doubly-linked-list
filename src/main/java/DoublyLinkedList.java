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

        public void setPrevious(Node previous) { this.previous = previous; }

        public void setNext(Node next) { this.next = next; }

        @Override
        public String toString() { return content.toString(); }

    }

    private Node head;
    private Node tail;
    private int size = 0;

    public Node head() { return this.head; }

    public Node tail() { return this.tail; }

    public void add(T element) {
        Node newNode = new Node();

        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrevious(this.tail);
            this.tail = newNode;
        }

        this.size++;
    }

    public void remove(int index) {

    }

    public void insert(int index, T element) {}

    public Node get(int index) {    }

    public String toString() {     }

    public Node popNode(Node node) { }

    public Node setTail() {}

    private Node findNode(int index) {
        int nodeIndex = 0;
        Node currentNode = this.head;

        while (nodeIndex != index) {
            currentNode = currentNode.next();
            nodeIndex++;
        }

        return currentNode;
    }
}
