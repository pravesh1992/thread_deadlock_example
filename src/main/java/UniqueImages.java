import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class UniqueImages {
  public static class Image {
    private String filename;
    private int width;
    private int height;
    private String fileNameWithoutExtension;

    public Image(String filename, int width, int height) throws Exception {
      this.filename = filename.toLowerCase();
      this.width = width;
      this.height = height;
      if (this.filename == null || this.filename.trim().isEmpty())
        throw new Exception("Filename ca't be null or empty:" + filename);
      fileNameWithoutExtension = this.filename.split("\\.")[0];
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Image)) return false;
      Image image = (Image) o;
      return width == image.width &&
        height == image.height &&
        Objects.equals(fileNameWithoutExtension, image.fileNameWithoutExtension);
    }

    @Override
    public int hashCode() {
      return Objects.hash(width, height, fileNameWithoutExtension);
    }

    public String toString() {
      return "Image: filename=" + filename + " Size=" + width * height;
    }
  }

  public static void printImages(Set<Image> images) {
    for (Image image : images) {
      System.out.println(image);
    }
  }

  public static void main(String[] args) {
    try {
      Image[] images = {new Image("flag.jpg", 40, 60),
        new Image("flag.gif", 40, 60),
        new Image("smile.gif", 100, 200),
        new Image("smile.gif", 50, 400),
        new Image("other.jpg", 40, 60),
        new Image("lenna.jpg", 512, 512),
        new Image("Lenna.png", 512, 512),
        new Image("Lenna.jpg", 512, 512)};
      Set<Image> set = new HashSet<Image>(Arrays.asList(images));
      UniqueImages.printImages(set);
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}