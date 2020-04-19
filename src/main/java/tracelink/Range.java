package tracelink;

public class Range implements Comparable<Range> {
  final Integer lowerBound;
  final Integer upperBound;

  public Range(Integer lowerBound, Integer upperBound) {
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  public Integer getLowerBound() {
    return lowerBound;
  }

  public Integer getUpperBound() {
    return upperBound;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Range) {
      Range range = (Range) obj;
      return (range.getLowerBound() == lowerBound) && (range.getUpperBound() == upperBound);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return 10;
  }

  @Override
  public String toString() {
    return "Range{" +
      "lowerBound=" + lowerBound +
      ", upperBound=" + upperBound +
      '}';
  }

  @Override
  public int compareTo(Range o) {
    return 0;
  }
}