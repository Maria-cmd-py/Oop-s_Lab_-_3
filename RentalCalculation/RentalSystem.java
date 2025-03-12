package RentalCalculation;
public class RentalSystem {
    public static void main(String[] args) {
        VehicleRental rental = new VehicleRental();
        rental.calculateRental(5); // Rental based on days
        rental.calculateRental(200); // Rental based on km
        rental.calculateRental(3, 150); // Rental based on both
    }
}