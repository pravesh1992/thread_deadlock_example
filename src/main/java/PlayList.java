import java.util.ArrayList;
import java.util.List;

public class PlayList {

  public static void main(String[] args) {
//4
//    wheniseeyouagain
//      borntorun
//    nothingelsematters
//      cecelia
//    1
//    cecelia

    //dancinginthedark
    //rio
    //liveoak
    //liveoak
    //0
    //liveoak

    List<String> songs = new ArrayList<>();
    songs.add("dancinginthedark");
    songs.add("rio");
    songs.add("liveoak");
    songs.add("liveoak");
    int result = playlist(songs, 0, "liveoak");
    System.out.println(result);
  }

  public static int playlist(List<String> songs, int k, String q) {
    int result = 0;
    String list2[] = new String[songs.size()];
    list2 = songs.toArray(list2);
    int count1 = 0, count2 = 0;
    for (int i = k; i < list2.length; i++) {
      if (!list2[i].equals(q)) {
        count1++;
      }
    }

    for (int i = k; i >= 0; i--) {
      if (!list2[i].equals(q)) {
        count2++;
      }
    }

    if (count1 > count2)
      result = count2;
    else
      result = count1;
    return result;
  }
}
