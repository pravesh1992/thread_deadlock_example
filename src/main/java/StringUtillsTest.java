import org.apache.commons.lang3.StringUtils;

class StringUtilsTest {
  public static void main(String[] args) {
    String name = null;
    //String nodeId = "view.teradata.defaultdatabase.views.account_user_rlt.";
    //String nodeId = "view.teradata.defaultdatabase.views.account_user_rlt.";
    String nodeId = "account_user_rlt";
    if (StringUtils.isEmpty(name) || name.equalsIgnoreCase("null")) {
      name = getName(nodeId, ".");
    }
    System.out.println("Name:" + name);
  }


  public static String getName(String nodeId, String pattern) {
    if (nodeId.contains(pattern)) {
      int count = StringUtils.countMatches(nodeId, pattern);
      if (count > 1) {
        return nodeId.substring(StringUtils.ordinalIndexOf(nodeId, pattern, StringUtils.countMatches(nodeId, pattern) - 1) + 1, nodeId.lastIndexOf(pattern));
      } else {
        return nodeId.substring(nodeId.lastIndexOf(pattern) + 1, nodeId.length());
      }
    } else
      return nodeId;
  }
}