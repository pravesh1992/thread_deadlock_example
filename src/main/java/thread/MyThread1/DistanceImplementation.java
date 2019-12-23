package thread.MyThread1;

class DistanceImplementation extends Distance {

  public int getFeet() {
    return this.feet;
  }

  public float getInches() {
    return this.inches;
  }


  public void setFeetAndInches(int feet, float inches) {
    this.feet = feet;
    this.inches = inches;
  }

  public String getDistanceComparison(Distance distance2) {
    String result = "BOTH ARE EQUAL";
    float totalDistance1 = this.getFeet() * 12 + this.getInches();
    float totalDistance2 = distance2.getFeet() * 12 + distance2.getInches();
    if (totalDistance1 == totalDistance2)
      return result;
    else {
      if (totalDistance1 > totalDistance2)
        result = "First distance is greater.";
      else
        result = "Second distance is greater.";
    }

    return result;
  }

  public static void main(String[] args) {
    Distance distance1 = new DistanceImplementation();
    distance1.setFeetAndInches(1, 2.0f);

    Distance distance2 = new DistanceImplementation();
    distance2.setFeetAndInches(3, 4.0f);
    System.out.println(distance1.getDistanceComparison(distance2));
  }
}
