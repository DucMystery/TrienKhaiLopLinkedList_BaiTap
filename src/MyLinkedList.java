public class MyLinkedList<E> {

    private class Node<E>{
        Node<E> next;
        Object data;

        public Node(Object data){
            this.data =data;
        }
        Object getData(){
            return this.data;
        }
    }

    private Node head;
    private int numNode;

    public MyLinkedList(Object data){
        head =new Node(data);
        numNode+=1;
    }

    void add(int index, Object data){
        Node temp = head;
        Node holder;

        for (int i=0;i<index-1 && temp.next!=null;i++){
            temp = temp.next;
        }
        holder =temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    void addFirst(E e){
        Node<E> temp = head;
        head = new Node(e);
        head.next =temp;
    }

    void addLast(E e){
        Node temp =head;

        if (temp == null){
            head  = temp;
        }else {
            temp.next =new Node(e);
            temp =temp.next;
        }
        numNode++;
    }

    E remove(int index){
        if (index<0 || index>=numNode){
            return null;
        }
        Node temp =head;
        for (int i =0;i<index;i++){
            temp =temp.next;
        }
        Node current =temp.next;
        temp.next =current.next;
        numNode--;
        return (E) current.data;
    }

    int size(){
        return numNode;
    }
    boolean contains(E e){
        Node temp =head;
        for (int i=0;i<numNode;i++){
            temp=temp.next;
            if (e.equals(temp))
                return true;
        }
        return false;
    }
    Node get(int index){
        Node temp =head;

        for (int i=0;i<index;i++){
            temp =temp.next;
        }
        return  temp;
    }

    void printList(){
        Node temp = head;

        while (temp.next!=null){
            System.out.println(temp.data);
            temp =temp.next;
        }
    }
}
