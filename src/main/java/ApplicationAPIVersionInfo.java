import java.io.Serializable;
import java.util.Objects;

public class ApplicationAPIVersionInfo implements Serializable {
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
