import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationAPIVersionInfoTest {
  public static void main(String[] args) {
    List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList = new ArrayList<>();
    List<String> input = Arrays.asList("Mail App, Authentication API, v6", "Video Call App, Authentication API, v7");
    for (String inputString : input) {
      String[] inputLineArray = inputString.split(",");
      applicationAPIVersionInfoList.add(new ApplicationAPIVersionInfo(inputLineArray[0].trim(), inputLineArray[1].trim(), inputLineArray[2].trim()));
    }
    ApplicationAPIVersionInfoTest test = new ApplicationAPIVersionInfoTest();
    ApplicationAPIVersionInfo result = test.getOlderApplicationAPIVersion(applicationAPIVersionInfoList);
    System.out.println("APIName:" + result.getApplicationName() + "::" + result.getApiName());
  }

  public ApplicationAPIVersionInfo getOlderApplicationAPIVersion(List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList) {
    Collections.sort(applicationAPIVersionInfoList, Comparator.comparing(ApplicationAPIVersionInfo::getVersion));
    return applicationAPIVersionInfoList.get(0);
  }
}