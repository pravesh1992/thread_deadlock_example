package tracelink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2Amazon {

  public static void main(String[] args) {
    Test2Amazon test2Amazon = new Test2Amazon();
    String[] items = new String[5];
    items[0] = "a1 9 2 3 1";
    items[1] = "g1 act car";
    items[2] = "zo4 4 7";
    items[3] = "ab1 off key dog";
    items[4] = "a8 act zoo";

    for (String log : test2Amazon.reorderLines(5, Arrays.asList(items))) {
      System.out.println(log);
    }
  }

  class Log {
    String id;
    String log;

    Log(String id, String log) {
      this.id = id;
      this.log = log;
    }
  }

  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public List<String> reorderLines(int logFileSize, List<String> logLines) {
    if (logLines != null && !logLines.isEmpty()) {
      String[] logs = new String[logLines.size()];
      for (int i = 0; i < logLines.size(); i++) {
        logs[i] = logLines.get(i);
      }


      //String[] logs = (String[]) logLines.toArray();
      String[] ans = new String[logs.length];
      ArrayList<Log> letters = new ArrayList<>();
      ArrayList<String> digits = new ArrayList<>();
      for (String log : logs) {
        int space = log.indexOf(" ");
        String id = log.substring(0, space);
        String l = log.substring(space + 1);
        if (l.charAt(0) >= '0' && l.charAt(0) <= '9') {
          digits.add(log);
        } else {
          letters.add(new Log(id, l));
        }
      }
      Collections.sort(letters, Comparator.comparing(a -> a.log));
      int i = 0;
      for (Log l : letters) {
        ans[i++] = l.id + " " + l.log;
      }
      for (String s : digits) {
        ans[i++] = s;
      }
      return Arrays.asList(ans);

    }
    return new ArrayList<>();


  }
  // METHOD SIGNATURE ENDS


  public String[] reorderLogFiles(String[] logs) {
    if (logs == null || logs.length == 0) {
      return logs;
    }
    String[] ans = new String[logs.length];
    ArrayList<Log> letters = new ArrayList<>();
    ArrayList<String> digits = new ArrayList<>();
    for (String log : logs) {
      int space = log.indexOf(" ");
      String id = log.substring(0, space);
      String l = log.substring(space + 1);
      if (l.charAt(0) >= '0' && l.charAt(0) <= '9') {
        digits.add(log);
      } else {
        letters.add(new Log(id, l));
      }
    }
    Collections.sort(letters, Comparator.comparing(a -> a.log));
    int i = 0;
    for (Log l : letters) {
      ans[i++] = l.id + " " + l.log;
    }
    for (String s : digits) {
      ans[i++] = s;
    }
    return ans;
  }
}
