package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
@Test
public void GivenDistanceAndTime_ShouldReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.CalculateFare(distance, time);
        double expected = 25;
        Assertions.assertEquals(expected, fare);
    }

    @Test
    public void GivenLessDistanceAndTime_ShouldReturnMinFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.CalculateFare(distance, time);
        double expected = 5;
        Assertions.assertEquals(expected, fare);
    }
   /* @Test
    public void GivenMultipleRides_ShouldReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.1, 1)
        };
        double fare = invoiceGenerator.CalculateFare(rides);
        double expected = 30;
        Assertions.assertEquals(expected, fare);

    }*/

    @Test
    public void givenMultipleRide_ShouldReturnInvoiceSummary(){
        InvoiceGenerator invoiceGerator = new InvoiceGenerator();
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.11,1)
        };
        InvoiceSummary summary = invoiceGerator.CalculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary,summary);
    }
}
