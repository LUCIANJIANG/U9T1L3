public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public boolean chargeAndDropOffRiders(double farePerRider)
  {
    int riders = getPassengers() - 1;
    double totalFare = riders * farePerRider;
    fareCollected += totalFare;

    boolean dropOff = dropOffPassengers(riders);
    return dropOff;
  }

  public double getFareCollected()
  {
    return fareCollected;
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Total fare collected: " + fareCollected);
  }
}