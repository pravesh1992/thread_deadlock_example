import java.io.Serializable;
import java.util.Objects;

class ApplicationAPIVersionInfoV2 implements Serializable {
  private final String applicationName;
  private final String apiName;
  private final String fullVersion;
  private final Integer version;

  ApplicationAPIVersionInfoV2(String applicationName, String apiName, String fullVersion) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ApplicationAPIVersionInfoV2)) return false;
    ApplicationAPIVersionInfoV2 that = (ApplicationAPIVersionInfoV2) o;
    return Objects.equals(getApplicationName(), that.getApplicationName()) &&
      Objects.equals(getApiName(), that.getApiName()) &&
      Objects.equals(getFullVersion(), that.getFullVersion());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getApplicationName(), getApiName(), getFullVersion());
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