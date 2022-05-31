package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {

    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    @Test
public void GivenDistanceAndTime_ShouldReturnTotalFare()
    {
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.CalculateFare(distance, time);
        double expected = 25;
        Assertions.assertEquals(expected, fare);
    }

    @Test
    public void GivenLessDistanceAndTime_ShouldReturnMinFare()
    {
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.CalculateFare(distance, time);
        double expected = 5;
        Assertions.assertEquals(expected, fare);
    }
    @Test

    public void givenMultipleRides_shouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Rides[] rides ={ new Rides(2.0, 5),
                new Rides(0.1,1)
        };
        double fare = invoiceGenerator.CalculateFare(rides);
        Assertions.assertEquals(30,fare,0.0);
    }

    @Test
    public void givenMultipleRide_ShouldReturnInvoiceSummary(){
        InvoiceGenerator invoiceGerator = new InvoiceGenerator();
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.11,1)
        };
        InvoiceSummary summary = invoiceGerator.invoiceSummary(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary,summary);
    }
    @Test
    public void GivenDistanceAndTimeNormal_ShouldReturnTotalFare() {

        double distance = 2.0;
        int time = 5;
        double fare = RideType.CalculateFareNormal(distance, time);
        Assertions.assertEquals(25, fare, 0.0);
    }
    @Test
    public void GivenDistanceAndTimeForPremium_ShouldReturnTotalFare()
    {
        double distance = 2.0;
        int time = 5;
        double fare = RideType.CalculateFarePER(distance, time);
        Assertions.assertEquals(40, fare,0.0);
    }


}
