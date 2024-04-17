package mylinkedlistqueue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public static int numberOfNodes = 0;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void enqueue(int info) {
        Node newTemporaryNode = new Node(info);
        increaseTheSizeOfListByOne();
        boolean isListQueueHasOneNode
                = this.tail == null;
        if (isListQueueHasOneNode) {
            this.head = this.tail = newTemporaryNode;
            return;
        }
        this.tail.next = newTemporaryNode;
        this.tail = newTemporaryNode;

    }

    public Node dequeue() {
        decreaseTheSizeOfListByOne();
        boolean isListQueueHasOneNode = this.head == null;
        if (isListQueueHasOneNode)
            return null;
        Node temporaryNode = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temporaryNode;
    }

    private void increaseTheSizeOfListByOne() {
        numberOfNodes++;
    }

    private void decreaseTheSizeOfListByOne() {
        numberOfNodes--;
    }


    public void displayNodeInfo() {
        System.out.println(" ");

    }

}
