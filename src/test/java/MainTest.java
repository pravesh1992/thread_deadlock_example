import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {

  @Test
  public void test1() {
    try {
      List<String> inputLines =
        Arrays.asList("Mail App, Authentication API, v6",
          "Video Call App, Authentication API, v7",
          "Mail App, Data Storage API, v10",
          "Chat App, Data Storage API, v11",
          "Mail App, Search API, v6",
          "Chat App, Authentication API, v8",
          "Chat App, Presence API, v2",
          "Video Call App, Data Storage API, v11",
          "Video Call App, Video Compression API, v3");
      String result = new Main().getResultString(inputLines);
      Assert.assertEquals(result, "Mail App");
    } catch (Exception exception) {
      Assert.fail();
      exception.getMessage();
    }
  }

  @Test
  public void test2() {
    try {
      List<String> inputLines =
        Arrays.asList("Mail App, Authentication API, v6",
          "Video Call App, Authentication API, v7",
          "Mail App, Data Storage API, v10",
          "Chat App, Data Storage API, v11",
          "Mail App, Search API, v6",
          "Chat App, Authentication API, v8",
          "Video Call App, Presence API, v3",
          "Video Call App, Presence API, v2",
          "Video Call App, Data Storage API, v11",
          "Video Call App, Video Compression API, v3");
      String result = new Main().getResultString(inputLines);
      Assert.assertEquals(result, "Video Call App");
    } catch (Exception exception) {
      Assert.fail();
      exception.getMessage();
    }
  }

  @Test
  public void test3() {
    try {
      List<String> inputLines = Arrays.asList();
      String result = new Main().getResultString(inputLines);
      Assert.assertEquals(result, "");
    } catch (Exception exception) {
      Assert.fail();
      exception.getMessage();
    }
  }
}

//  Mail App, Authentication API, v6
//  Video Call App, Authentication API, v7
//  Mail App, Data Storage API, v10
//  Chat App, Data Storage API, v11
//  Mail App, Search API, v6
//  Chat App, Authentication API, v8
//  Chat App, Presence API, v2
//  Video Call App, Presence API, v3
//  Video Call App, Data Storage API, v11
//  Video Call App, Video Compression API, v3