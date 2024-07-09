package LinkedList;

public class Link_Client {
    public static void main(String[] args)throws Exception {
        LinkedList l=new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.addFirst(40);
        l.addFirst(50);
        l.addLast(100);
        l.addAtIndex(900,2);
        l.removeFirst();
        l.removeLast();
        l.removeAtIndex(1);
        l.display();


    }
}
