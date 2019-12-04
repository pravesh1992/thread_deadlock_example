package stream;

import java.util.Objects;

public class ObjectEdge {

  private static final String SEPERATOR = "#";

  long source;

  long target;

  ObjectEdge(long source, long target) {
    this.source = source;
    this.target = target;
  }

  public long getSource() {
    return source;
  }

  public long getTarget() {
    return target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ObjectEdge that = (ObjectEdge) o;
    StringBuffer value = new StringBuffer(source + SEPERATOR + target);
    StringBuffer reverseValue = new StringBuffer(target + SEPERATOR + source);
    StringBuffer objectValue = new StringBuffer(that.source + SEPERATOR + that.target);
    return value.toString().equals(objectValue.toString()) || reverseValue.toString().equals(objectValue.toString());
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(new Long(source + target).intValue());
  }
}