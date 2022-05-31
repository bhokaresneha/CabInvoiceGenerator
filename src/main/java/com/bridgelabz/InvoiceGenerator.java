package com.bridgelabz;

public class InvoiceGenerator {
    private String type;
    /*public static void main(String[] args) {
            System.out.println("Welcome to Cab Invoice Generator");
        }*/

    private static int costPerTime = 1;
    private static double minimumCostPerKilometer = 10;
    private static double minimumFare = 5;
        RideType type= new RideType();
    public double CalculateFare(double distance, int time )
    {
        double totalFare = distance * minimumCostPerKilometer + time * costPerTime;
        if (totalFare < minimumFare)
        {
            return minimumFare;
        }
        return totalFare;
    }

    public double CalculateFare(Rides[] rides) {
        double totalFare = 0.0;
        for (Rides ride : rides) {
            totalFare += this.CalculateFare(ride.distance , (int) ride.time);
        }
        return totalFare;
    }

    //Invoice summary...
    public InvoiceSummary invoiceSummary(Rides[] rides) {
        double totalFare = 0.0;
        for (Rides ride : rides) {
            totalFare = totalFare + CalculateFare(ride.distance, (int) ride.time);
        }
        //    System.out.println(rides.length);
        return new InvoiceSummary(rides.length, totalFare);
    }



}


