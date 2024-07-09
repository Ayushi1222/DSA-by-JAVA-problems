package LinkedList;

public class LinkedList {
    class Node
    {
        int val;
        Node Next;
    }
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item)
    {
        Node nn=new Node();
        nn.val=item;
        if(size==0)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else
        {
            nn.Next=head;
            head=nn;
            size++;
        }
    }
    public void addLast(int item)
    {
        if (size == 0) {
            addFirst(item);
        }
        else {
            Node nn = new Node();
            nn.val = item;
            tail.Next = nn;
            tail = nn;
            size++;
        }
    }
    //O(n)
    public void addAtIndex(int item, int k) throws Exception
    {
        if (k == 0) {
            addFirst(item);
        } else if (k == size) {
            addLast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node k_1th = GetNode(k - 1);
            nn.Next = k_1th.Next;
            k_1th.Next = nn;
            size++;

        }

    }

    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Bklol index range me dedo");

        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.Next;

        }
        return temp;

    }
    // O(1)
    public int removeFirst() {
        int rv = head.val;
        if (size == 1) {
            head = null;
            tail = null;

        } else {
            Node temp = head;
            head = head.Next;
            temp.Next = null;

        }
        size--;
        return rv;

    }

    // O(N)
    public int removeLast() throws Exception {
        if (size == 1) {
            return removeFirst();
        } else {
            int rv = tail.val;
            Node sl = GetNode(size - 2);
            sl.Next = null;
            tail = sl;
            size--;
            return rv;

        }

    }

    // O(N)
    public int removeAtIndex(int k) throws Exception {
        if (k == 0) {
            return removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        } else {

            Node K_1th = GetNode(k - 1);
            Node kth = K_1th.Next;
            K_1th.Next = kth.Next;
            kth.Next = null;
            size--;
            return kth.val;
        }

    }

    public int getFirst() {
        return head.val;

    }

    // O(1)
    public int getLast() {
        return tail.val;

    }

    // O(n)
    public int getIndex(int k) throws Exception {
        return GetNode(k).val;

    }

    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"---->");
            temp=temp.Next;
        }
        System.out.print(".");
    }


}
