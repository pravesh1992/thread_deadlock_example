import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AppAPIVersionInfoTest {
  public static void main(String[] args) throws Exception {
    try {
      File input = new File("input.txt");
      File output = new File("output.txt");
      BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
      List<AppAPIVersionInfo> appAPIVersionInfoItems = new ArrayList<>(10);
      String line = null;
      while ((line = bufferedReader.readLine()) != null) {
        String[] inputLineArray = line.split(",");
        appAPIVersionInfoItems.add(new AppAPIVersionInfo(inputLineArray[0].trim(), inputLineArray[1].trim(), inputLineArray[2].trim()));
      }

      AppAPIVersionInfoTest appAPIVersionInfoTest = new AppAPIVersionInfoTest();
      FileWriter writer = new FileWriter(output, false);
      String result = appAPIVersionInfoTest.getAppNameByAPIVersion(appAPIVersionInfoItems);
      System.out.println("Result : " + result);
      writer.write(result);
      writer.close();
    } catch (IOException e) {
      throw new Exception(e.getMessage(), e);
    }
  }

  String getAppNameByAPIVersion(List<AppAPIVersionInfo> appAPIVersionInfoItems) throws Exception {
    if (appAPIVersionInfoItems == null || appAPIVersionInfoItems.isEmpty()) {
      throw new Exception("appAPIVersionInfoItems cam't be null or empty");
    }

    // This map contains api name vs latest version
    HashMap<String, Integer> apiVsLatestVersions = new HashMap<>(appAPIVersionInfoItems.size() / 2);
    // This map contains appName vs Map which contains apiName to version
    HashMap<String, HashMap<String, Integer>> appNameVsAppAPIVersionInfoItems = new HashMap<>(appAPIVersionInfoItems.size() / 2);
    // This map contains app vs count of api counts for that api
    HashMap<String, Integer> appVsUniqueApiCounts = new HashMap<>(appAPIVersionInfoItems.size() / 2);
    for (AppAPIVersionInfo appAPIVersionInfo : appAPIVersionInfoItems) {
      Integer version = appAPIVersionInfo.getVersion();
      String apiName = appAPIVersionInfo.getApiName();
      String appName = appAPIVersionInfo.getApplicationName();
      // Logic to store api vs latest version
      if (apiVsLatestVersions.containsKey(apiName)) {
        if (version > apiVsLatestVersions.get(apiName)) {
          apiVsLatestVersions.put(apiName, version);
        }
      } else {
        apiVsLatestVersions.put(apiName, version);
      }
      // Logic to store app vs map of api name vs latest version
      if (appNameVsAppAPIVersionInfoItems.containsKey(appName)) {
        HashMap<String, Integer> apiVsLatestVersionsPerApp = appNameVsAppAPIVersionInfoItems.get(appName);
        if (apiVsLatestVersionsPerApp.containsKey(apiName)) {
          if (version > apiVsLatestVersionsPerApp.get(apiName)) {
            apiVsLatestVersionsPerApp.put(apiName, version);
          }
        } else {
          apiVsLatestVersionsPerApp.put(apiName, version);
        }
      } else {
        HashMap<String, Integer> apiVsLatestVersionPerApp = new HashMap<>(appAPIVersionInfoItems.size() / 2);
        apiVsLatestVersionPerApp.put(apiName, version);
        appNameVsAppAPIVersionInfoItems.put(appName, apiVsLatestVersionPerApp);
      }
    }

    for (Map.Entry<String, HashMap<String, Integer>> entry : appNameVsAppAPIVersionInfoItems.entrySet()) {
      appVsUniqueApiCounts.put(entry.getKey(), entry.getValue().size());
    }

    // Sort above map based on value
    // Create a entryList from elements of HashMap
    List<Map.Entry<String, Integer>> entryList = new LinkedList<>(appVsUniqueApiCounts.entrySet());
    // Sort the entryList
    Collections.sort(entryList, Comparator.comparing(Map.Entry::getValue));
    for (Map.Entry<String, Integer> entry : entryList) {
      appVsUniqueApiCounts.put(entry.getKey(), entry.getValue());
    }

    String appName = null;
    Boolean latestVersion = false;
    for (Map.Entry<String, Integer> apiVsUniqueAPiCountsEntry : appVsUniqueApiCounts.entrySet()) {
      HashMap<String, Integer> apiNameVsLatestVersionPerAp = appNameVsAppAPIVersionInfoItems.get(apiVsUniqueAPiCountsEntry.getKey());
      for (Map.Entry<String, Integer> apiVsLatestVersionEntry : apiNameVsLatestVersionPerAp.entrySet()) {
        if (apiVsLatestVersions.containsKey(apiVsLatestVersionEntry.getKey()) && apiVsLatestVersionEntry.getValue().equals(apiVsLatestVersions.get(apiVsLatestVersionEntry.getKey()))) {
          latestVersion = true;
        } else {
          latestVersion = false;
        }
      }
      if (latestVersion) {
        appName = apiVsUniqueAPiCountsEntry.getKey();
      }
    }

    return appName;
  }

  static class AppAPIVersionInfo {
    private final String applicationName;
    private final String apiName;
    private final String fullVersion;
    private final Integer version;

    AppAPIVersionInfo(String applicationName, String apiName, String fullVersion) {
      this.applicationName = applicationName;
      this.apiName = apiName;
      this.fullVersion = fullVersion;
      this.version = new Integer(this.fullVersion.substring(1));
    }

    String getApplicationName() {
      return applicationName;
    }

    String getApiName() {
      return apiName;
    }

    String getFullVersion() {
      return fullVersion;
    }

    Integer getVersion() {
      return version;
    }
  }
}