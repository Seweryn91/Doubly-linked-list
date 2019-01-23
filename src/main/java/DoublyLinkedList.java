@SuppressWarnings("unchecked")
public class DoublyLinkedList<T> {

    class Node <T>{
        private T content;
        private Node previous;
        private Node next;

        Node(T content){ this.content = content; }

        public Node previous(){     }

        public Node next(){     }

        public T getContent(){      }

        public void setPrevious(){      }

        public void setNext(){        }

        @Override
        public String toString() { return content.toString(); }

    }

    private Node head;
    private Node tail;
    private int size = 0;

}
