/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
  public static void main(String[] args) {
    try {
      Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
      List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList = new ArrayList<>();
      ArrayList<String> inputLines = new ArrayList<>();
      while (in.hasNextLine()) {
        String line = in.nextLine();
        if (!line.isEmpty()) {
          inputLines.add(line);
        }
      }
      PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
      output.println("" + new Main().getResultString(inputLines));
      output.close();
    } catch (IOException e) {
      System.out.println("IO error in input.txt or output.txt");
    }
  }


  public String getResultString(List<String> inputLines) {
    StringBuilder resultString = new StringBuilder();
    if (inputLines != null && !inputLines.isEmpty()) {
      List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList = new ArrayList<>();
      for (String line : inputLines) {
        String[] inputLineArray = line.split(",");
        applicationAPIVersionInfoList.add(new ApplicationAPIVersionInfo(inputLineArray[0].trim(), inputLineArray[1].trim(), inputLineArray[2].trim()));
      }
      return getResultStringInternal(applicationAPIVersionInfoList);
    }

    return resultString.toString();
  }


  public String getResultStringInternal(List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList) {
    StringBuilder resultString = new StringBuilder();
    if (!applicationAPIVersionInfoList.isEmpty()) {
      resultString.append(getOlderApplicationAPIVersion(applicationAPIVersionInfoList).getApplicationName());
    }
    return resultString.toString();
  }

  private ApplicationAPIVersionInfo getOlderApplicationAPIVersion(List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList) {
    Map<String, List<ApplicationAPIVersionInfo>> apiNameToListOfApplicationAPIVersionInfo = populateApiNameToListOfApplicationAPIVersionInfoMap(applicationAPIVersionInfoList);
    applicationAPIVersionInfoList = new ArrayList<>();
    apiNameToListOfApplicationAPIVersionInfo.entrySet().removeIf(applicationAPIVersionInfoListEntry -> applicationAPIVersionInfoListEntry.getValue().size() == 1);
    for (Map.Entry<String, List<ApplicationAPIVersionInfo>> entry : apiNameToListOfApplicationAPIVersionInfo.entrySet()) {
      applicationAPIVersionInfoList.addAll(entry.getValue());
    }
    Collections.sort(applicationAPIVersionInfoList, Comparator.comparing(ApplicationAPIVersionInfo::getVersion));
    return applicationAPIVersionInfoList.get(0);
  }

  private Map<String, List<ApplicationAPIVersionInfo>> populateApiNameToListOfApplicationAPIVersionInfoMap(List<ApplicationAPIVersionInfo> applicationAPIVersionInfoList) {
    Map<String, List<ApplicationAPIVersionInfo>> apiNameToListOfApplicationAPIVersionInfo = new HashMap<>(applicationAPIVersionInfoList.size());
    for (ApplicationAPIVersionInfo applicationAPIVersionInfo : applicationAPIVersionInfoList) {
      if (apiNameToListOfApplicationAPIVersionInfo.containsKey(applicationAPIVersionInfo.getApiName())) {
        apiNameToListOfApplicationAPIVersionInfo.get(applicationAPIVersionInfo.getApiName()).add(applicationAPIVersionInfo);
      } else {
        List<ApplicationAPIVersionInfo> items = new ArrayList<>(1);
        items.add(applicationAPIVersionInfo);
        apiNameToListOfApplicationAPIVersionInfo.put(applicationAPIVersionInfo.getApiName(), items);
      }
    }
    return apiNameToListOfApplicationAPIVersionInfo;
  }


  static class ApplicationAPIVersionInfo implements Serializable {
    final String applicationName;
    final String apiName;
    final String fullVersion;
    final Integer version;

    public ApplicationAPIVersionInfo(String applicationName, String apiName, String fullVersion) {
      this.applicationName = applicationName;
      this.apiName = apiName;
      this.fullVersion = fullVersion;
      this.version = new Integer(this.fullVersion.substring(1));
    }

    public String getApplicationName() {
      return applicationName;
    }

    public String getApiName() {
      return apiName;
    }

    public String getFullVersion() {
      return fullVersion;
    }

    public Integer getVersion() {
      return version;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof ApplicationAPIVersionInfo)) return false;
      ApplicationAPIVersionInfo that = (ApplicationAPIVersionInfo) o;
      return Objects.equals(getApplicationName(), that.getApplicationName()) &&
        Objects.equals(getApiName(), that.getApiName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getApplicationName(), getApiName());
    }

    @Override
    public String toString() {
      return "ApplicationAPIVersionInfo{" +
        "applicationName='" + applicationName + '\'' +
        ", apiName='" + apiName + '\'' +
        ", version='" + fullVersion + '\'' +
        '}';
    }
  }
}