package com.bridgelabz;

public class InvoiceSummary {
     final int numOfRides;
    final double totalFare;
     final double avgOfFare;

    public InvoiceSummary(int NoOfRides, double totalFare) {
        this.numOfRides = NoOfRides;
        this.totalFare = totalFare;
        this.avgOfFare = this.totalFare / this.numOfRides;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.avgOfFare, avgOfFare) == 0;
    }


}