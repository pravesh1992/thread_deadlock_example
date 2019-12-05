package custom_collections;

public class Node {

  private String value;

  private Node nextNode;

  public Node(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public Node getNextNode() {
    return nextNode;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value='" + value + '\'' +
      '}';
  }
}
