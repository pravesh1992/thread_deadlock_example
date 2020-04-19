package tracelink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class RangeMergeTest {
  public static void main(String[] args) {
    List<Range> mergedList = mergeRanges(Arrays.asList(
      new Range(1, 3),
      new Range(2, 6),
      new Range(8, 12),
      new Range(10, 15),
      new Range(6, 18),
      new Range(20, 25),
      new Range(23, 30),
      new Range(31, 50),
      new Range(45, 52)
    ));

    System.out.println("Merged Range list:" + mergedList);
  }

  static List<Range> mergeRanges(List<Range> ranges) {
    Collections.sort(ranges, Comparator.comparing(Range::getLowerBound));
    if (ranges.size() > 1) {
      HashSet<Range> mergedList = new HashSet<>(ranges.size());
      Range createdRange = null;
      for (int i = 1; i < ranges.size(); i++) {
        Range range = ranges.get(i);
        boolean create = false;
        if (createdRange == null) {
          if (range.getUpperBound() > ranges.get(0).getUpperBound()) {
            createdRange = new Range(range.getLowerBound() > ranges.get(0).getLowerBound() ? ranges.get(0).getLowerBound() : range.getLowerBound(), range.getUpperBound());
            create = true;
          }
        } else {
          if (range.getUpperBound() > createdRange.getUpperBound()) {
            if (range.getLowerBound() >= createdRange.getUpperBound()) {
              createdRange = range;
              create = true;
            } else {
              mergedList.remove(createdRange);
              createdRange = new Range(createdRange.getLowerBound(), range.getUpperBound());
              create = true;
            }
          }
        }
        if (create)
          mergedList.add(createdRange);
      }
      return new ArrayList<>(mergedList);
    } else {
      return ranges;
    }
  }


//  static List<Range> mergeRanges(List<Range> ranges) {
//    Collections.sort(ranges, Comparator.comparing(Range::getLowerBound));
//    if (ranges.size() > 1) {
//      ArrayList<Range> sortedList = new ArrayList<>(ranges.size());
//      Range lastList = ranges.get(0);
//      Range createdRange = lastList;
//      for (int i = 1; i < ranges.size() - 1; i++) {
//        Range range = ranges.get(i);
//        if (range.getUpperBound() >= createdRange.getUpperBound()) {
//          if (range.getLowerBound() >= createdRange.getUpperBound()) {
//            createdRange = new Range(range.getLowerBound(), range.getUpperBound());
//          } else {
//            createdRange = new Range(createdRange.getLowerBound(), range.getUpperBound());
//          }
//        }
//        if (sortedList.size() > 0 && sortedList.contains(createdRange))
//          sortedList.add(createdRange);
//        else
//          sortedList.add(createdRange);
//      }
//      return sortedList;
//    } else return ranges;
//  }

  public static Range getRange(List<Range> rangeList, Range range) {
    Range result = null;
    if (rangeList != null && !rangeList.isEmpty()) {
      for (Range tempRange : rangeList) {
        if ((tempRange.getUpperBound() < range.getUpperBound()) && (tempRange.getUpperBound() > range.getLowerBound())) {
          result = tempRange;
          break;
        }
      }
    }
    return result;
  }
}
