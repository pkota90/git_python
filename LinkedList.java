public class LinkedList {

    public static void main(String []args) {
        // Write your code here:
        LinkedList seasons = new LinkedList();
        System.out.println(seasons.printList());
        seasons.removeHead();
        System.out.println(seasons.printList());
        seasons.addToHead("summer");
        seasons.addToHead("spring");
        System.out.println(seasons.printList());
        seasons.addToTail("fall");
        seasons.addToTail("winter");
        System.out.println(seasons.printList());
        seasons.removeHead();
        System.out.println(seasons.printList());
        LinkedList testList = new LinkedList();
        testList.addToHead("three");
        testList.addToHead("eight");
        testList.addToTail("two");
        testList.removeHead();
        testList.addToTail("four");
        testList.removeHead();
        System.out.println(testList.head.data);
    }

    public Node head = null;

    public LinkedList() {}

    public void addToHead(String data) {
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(data);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public String printList() {
        String output = "<head> ";
        Node currentNode = this.head;
        while (currentNode != null) {
            output += currentNode.data + " ";
            currentNode = currentNode.getNextNode();
        }
        output += "<tail>";
        System.out.println(output);
        return output;
    }

}