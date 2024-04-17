package mylinkedlistqueue;

public class Node {
    private int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
    public int getKey(){
        return this.key;
    }

}
