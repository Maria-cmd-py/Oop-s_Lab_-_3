package RentalCalculation;
class VehicleRental {
    void calculateRental(int days) {
        int ratePerDay = 1000;
        int totalCost = days * ratePerDay;
        System.out.println("Rental cost for " + days + " days: Rs. " + totalCost);
    }
    void calculateRental(double kilometers) {
        double ratePerKm = 15;
        double totalCost = kilometers * ratePerKm;
        System.out.println("Rental cost for " + kilometers + " km: Rs. " + totalCost);
    }
    void calculateRental(int days, double kilometers) {
        int ratePerDay = 1000;
        double ratePerKm = 15;
        int totalCostDays = days * ratePerDay;
        double totalCostKm = kilometers * ratePerKm;
        double finalCost = Math.max(totalCostDays, totalCostKm);
        System.out.println("Final Rental Cost: Rs. " + finalCost);
    }
}
