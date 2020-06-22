import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ApplicationAPIVersionInfoTest {
  public static void main(String[] args) {
    List<ApplicationAPIVersionInfoV2> applicationAPIVersionInfoList = new ArrayList<>();
    List<String> input = Arrays.asList("Mail App, Authentication API, v6", "Video Call App, Authentication API, v7");
    for (String inputString : input) {
      String[] inputLineArray = inputString.split(",");
      applicationAPIVersionInfoList.add(new ApplicationAPIVersionInfoV2(inputLineArray[0].trim(), inputLineArray[1].trim(), inputLineArray[2].trim()));
    }
    ApplicationAPIVersionInfoTest test = new ApplicationAPIVersionInfoTest();
    ApplicationAPIVersionInfoV2 result = test.getOlderApplicationAPIVersion(applicationAPIVersionInfoList);
    System.out.println("APIName:" + result.getApplicationName() + "::" + result.getApiName());
  }

  public ApplicationAPIVersionInfoV2 getOlderApplicationAPIVersion(List<ApplicationAPIVersionInfoV2> applicationAPIVersionInfoList) {
    Collections.sort(applicationAPIVersionInfoList, Comparator.comparing(ApplicationAPIVersionInfoV2::getVersion));
    return applicationAPIVersionInfoList.get(0);
  }
}