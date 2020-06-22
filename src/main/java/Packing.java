import java.util.List;

public class Packing {
  String parentNUmber;
  String childNumber;
  int depth;
  String label;
  List<Packing> packingList;

  public String getParentNUmber() {
    return parentNUmber;
  }

  public void setParentNUmber(String parentNUmber) {
    this.parentNUmber = parentNUmber;
  }

  public String getChildNumber() {
    return childNumber;
  }

  public void setChildNumber(String childNumbeor) {
    this.childNumber = childNumber;
  }

  public int getDepth() {
    return depth;
  }

  public void setDepth(int depth) {
    this.depth = depth;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<Packing> getPackingList() {
    return packingList;
  }

  public void setPackingList(List<Packing> packingList) {
    this.packingList = packingList;
  }
}
