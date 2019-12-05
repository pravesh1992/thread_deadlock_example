package custom_collections;

public class ReverseLinkedList {
  public static void main(String[] args) {
    Node node1 = new Node("10");
    Node node2 = new Node("20");
    node1.setNextNode(node2);
    Node node3 = new Node("30");
    node2.setNextNode(node3);
    Node node4 = new Node("40");
    node3.setNextNode(node4);
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    reverseLinkedList.print(node1);
    Node headNode = reverseLinkedList.reverseLinkedList(node1);
    System.out.println("After reverse");
    reverseLinkedList.print(headNode);
  }

  public void print(Node head) {
    if (head != null) {
      System.out.println("Value :" + head.getValue());
      while (head.getNextNode() != null) {
        head = head.getNextNode();
        System.out.println("Value :" + head.getValue());
      }
    }
  }

  public Node reverseLinkedList(Node head) {
    if (head != null) {
      Node previousNode = head;
      head = head.getNextNode();
      previousNode.setNextNode(null);
      if (head != null) {
        Node currentNode = head;
        while (head != null) {
          currentNode = head;
          head = head.getNextNode();
          currentNode.setNextNode(previousNode);
          previousNode = currentNode;
        }
        head = currentNode;
      } else
        return previousNode;
    }

    return head;
  }
}