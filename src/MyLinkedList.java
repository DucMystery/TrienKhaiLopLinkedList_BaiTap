

public class MyLinkedList<T> {

    private class Node<T>{
        Node<T> next;
        T data;

        public Node(T data){
            this.data =data;
        }

        public T getData(){
            return data;
        }
    }

    Node<T> head =null;
    Node<T> tail =null;
    int size;

    public MyLinkedList(){}

    void addFirst(T data){
        if (head == null){
            head =new Node<>(data);
            tail =head;
        }else {
            Node temp = head;
            head = new Node<>(data);
            head.next = temp;
            ++size ;
        }
    }

    void addLast(T data){
        if (head == null){
            head = new Node<>(data);
            tail = head;
        }else {
            tail.next = new Node<>(data);
            tail =tail.next;
            ++size;
        }
    }

//    void add(T data){
//        if (head == null){
//            head = new Node<>(data);
//            tail =head;
//        }else {
//            tail.next = new Node<>(data);
//            tail =tail.next;
//            size ++;
//        }
//    }

    T remove(int index){
        Node temp = head;
        if (index<0 || index>=size){
            return null;
        }else {
            for (int i =0;i<index;i++){
                temp =temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
        return (T) temp.data;

    }

    int getSize(){
        return ++size ;
    }

    boolean contains(T data){
        Node<T> temp =  head;
        for (int i=0;i<size;i++){
            if (temp.data ==data)
                return true;
            temp =temp.next;
        }
        return false;
    }

    T get(int index){
        Node temp = head;
        if (index<0 || index>=size){
            return null;
        }else {
            for (int i= 0; i<index-1;i++){
                temp =temp.next;
            }
        }
        return (T) temp.next.data;
    }

    T getFirst(){
        if (head ==null){
            return null;
        }else {
            return head.data;
        }
    }

    T getLast(){
        Node<T> temp = head;
        if (head == null){
            return null;
        }else {
            while (temp.next!=null){
                temp =temp.next;
            }
        }
        return temp.data;
    }



    void show(){
        Node<T> temp =head;
        while (temp!= null){
            System.out.println(temp.data);
            temp =temp.next;
        }
    }


}
