public class LinkedList {
    private Node head;
    private Node tail;
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(int element) {
        Node node = new Node(element);
        if (head == null) { 
            head = tail = node;
        } else {
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        }
        count++;
    }

    public void add(int position, int element) {
        if (position == count) { 
            add(element);
            return;
        }

        Node node = new Node(element);
        if (position == 0) { 
            node.setNext(head);
            if (head != null) {
                head.setPrevious(node);
            }
            head = node;
            if (tail == null) { 
                tail = node;
            }
            count++;
            return;
        }

        Node curr = head;
        for (int i = 0; i < position; i++) {
            curr = curr.getNext();
        }
        Node prev = curr.getPrevious();
        node.setPrevious(prev);
        node.setNext(curr);
        if (prev != null) prev.setNext(node);
        curr.setPrevious(node);
        count++;
    }

    public void remove() {
        if (count == 0) return;
        if (count == 1) {
            head = tail = null;
        } else {
            head = head.getNext();
            head.setPrevious(null);
        }
        count--;
    }

    public void remove(int position) {

        if (position == 0) {
            remove();
            return;
        }
        if (position == count - 1) {
            tail = tail.getPrevious();
            if (tail != null) tail.setNext(null);
            else head = null;
            count--;
            return;
        }
        Node curr;

        curr = head;
        for (int i = 0; i < position; i++) {
            curr = curr.getNext();
        }
        Node prev = curr.getPrevious();
        Node next = curr.getNext();
        if (prev != null) prev.setNext(next);
        if (next != null) next.setPrevious(prev);
        count--;
    }

    public int size() {
        return count;
    }
}
