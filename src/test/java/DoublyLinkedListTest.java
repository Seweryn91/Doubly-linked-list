import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    @DisplayName("Test head")
    void testHead() {
        DoublyLinkedList list = createList(5);
        assertEquals("0", list.head().toString());
    }

    @Test
    @DisplayName("Test tail")
    void testTail() {
        DoublyLinkedList list = createList(5);
        assertEquals("4", list.tail().toString());
    }

    @Test
    @DisplayName("Test insert")
    void testInsert() {
        DoublyLinkedList list = createList(5);
        list.insert(1, "7");
        assertEquals("0 7 1 2 3 4", list.toString());
    }

    @Test
    @DisplayName("Test insert with improper index")
    void testInsert_improperIndex() {
        DoublyLinkedList list = createList(5);
        assertThrows(IllegalArgumentException.class, () -> list.insert(-1, "7"));
    }

    @Test
    @DisplayName("Test remove")
    void testRemove() {
        DoublyLinkedList list = createList(5);
        list.remove(1);
        assertEquals("0 2 3 4", list.toString());
    }

    @Test
    @DisplayName("Test add")
    void testAdd() {
        DoublyLinkedList list = createList(5);
        list.add(5);
        assertEquals("0 1 2 3 4 5", list.toString());
    }

    @Test
    @DisplayName("Test get")
    void testGet() {
        DoublyLinkedList list = createList(5);
        assertEquals("1", list.get(1).toString());
    }

    @Test
    @DisplayName("Test get with too high index")
    void testGet_improperIndex_tooHigh() {
        DoublyLinkedList list = createList(5);
        assertThrows(IllegalArgumentException.class, () -> list.get(5));
        
    }

    @Test
    @DisplayName("Test get with negative index")
    void testGet_improperIndex_negative() {
        DoublyLinkedList list = createList(5);
        assertThrows(IllegalArgumentException.class, () -> list.get(-3));
    }

    @Test
    @DisplayName("Test size")
    void testSize() {
        DoublyLinkedList list = createList(5);
        assertEquals(5, list.size());
        list.remove(1);
        assertEquals(4, list.size());
    }

    private DoublyLinkedList createList(int size){
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i=0; i < size; i++)
            list.add(i);

        return list;
    }

}