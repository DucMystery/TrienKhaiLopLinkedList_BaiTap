public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>(10);
        integerMyLinkedList.addLast(12);
        integerMyLinkedList.addLast(13);
        integerMyLinkedList.addLast(14);
        integerMyLinkedList.addLast(15);

        integerMyLinkedList.printList();
    }
}
