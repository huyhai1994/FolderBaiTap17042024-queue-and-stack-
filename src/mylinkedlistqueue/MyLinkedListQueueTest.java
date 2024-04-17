package mylinkedlistqueue;

public class MyLinkedListQueueTest {
    public static void main(String[] args) {
        MyLinkedListQueue linkedListQueue = new MyLinkedListQueue();
        linkedListQueue.enqueue(1);
        linkedListQueue.enqueue(2);
        linkedListQueue.enqueue(3);
        linkedListQueue.enqueue(4);
        linkedListQueue.enqueue(5);
        linkedListQueue.enqueue(6);
        displayAllInfo(linkedListQueue);
        displayNodeOffListQueue(linkedListQueue.dequeue());
        displayAllInfo(linkedListQueue);
    }

    public static void displayAllInfo(MyLinkedListQueue linkedListQueue) {
        displayHeadOfListQueue(linkedListQueue);
        displayNodesValueInListQueue(linkedListQueue);
        displayTailOfListQueue(linkedListQueue);
        displayNumberOfNodesInListQueue(linkedListQueue);
        System.out.println(" ");
    }

    public static void displayNodeOffListQueue(Node dequeuedNode) {
        System.out.println("dequeuedNode is: " + dequeuedNode.getKey());
    }

    public static void displayNodesValueInListQueue(MyLinkedListQueue linkedListQueue) {
        Node temporaryNodeGoThroughTheListQueue = linkedListQueue.getHead();
        while (temporaryNodeGoThroughTheListQueue != null) {
            System.out.println("The address of value " + temporaryNodeGoThroughTheListQueue.getKey() + ": " + temporaryNodeGoThroughTheListQueue);
            temporaryNodeGoThroughTheListQueue = temporaryNodeGoThroughTheListQueue.next;
        }
    }

    public static void displayNumberOfNodesInListQueue(MyLinkedListQueue linkedListQueue) {
        System.out.println("Number of nodes " + "in the list queue: " + MyLinkedListQueue.numberOfNodes);
    }

    public static void displayHeadOfListQueue(MyLinkedListQueue linkedListQueue) {
        System.out.println("head: " + linkedListQueue.getHead());

    }

    public static void displayTailOfListQueue(MyLinkedListQueue linkedListQueue) {
        System.out.println("tail: " + linkedListQueue.getTail());
    }
}
