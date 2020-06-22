package hackerrank;

import java.util.regex.Pattern;

public class IPAddressValidator {
  public static void main(String[] args) {
    System.out.println(new IPAddressValidator().validateIPAddress("299.299.299.299"));
  }

  private boolean validateIPAddress(String ipAddress) {
    if (ipAddress != null && !ipAddress.trim().isEmpty()) {
      //String regexString = "[0-9]{1,3}\\.[0-9]{1,3}.[0-9]{1,3}\\.[0-9]{1,3}.[0-9]{1,3}\\.[0-9]{1,3}";
      String regexString = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
      String test = "";
      boolean result = true;
      Pattern pattern = Pattern.compile(regexString);
      return ipAddress.matches(regexString);
    }
    return false;
  }
}