package thread.MyThread1;

abstract class Distance {

  protected int feet;

  protected float inches;

  abstract public void setFeetAndInches(int feet, float inches);

  abstract public int getFeet();

  abstract public float getInches();

  abstract String getDistanceComparison(Distance dist2);
}
