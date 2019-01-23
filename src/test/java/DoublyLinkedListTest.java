import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {


    private DoublyLinkedList createList(int size){
        DoublyLinkedList list = new DoublyLinkedList();
        for(int i=0; i < size; i++) {
            list.add(i);
        }

        return list;
    }

}