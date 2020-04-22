public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.show();
        System.out.println("===========================");

        myList.addFirst(5);
        myList.addLast(7);
        myList.show();
        System.out.println("===========================");
        myList.remove(2);
        System.out.println(myList.getSize());
        System.out.println("===========================");
        myList.show();
        System.out.println(myList.get(3));
        System.out.println("===========================");
        System.out.println(myList.contains(4));
        System.out.println("===========================");
        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());
    }
}
