package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.11,1)
        };
        InvoiceSummary summary = invoiceGenerator.CalculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary,summary);
    }

    @Test
    public void GivenDistanceAndTimeForUserId_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGerator = new InvoiceGenerator();
        String userId = "Sneha";
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.11, 1)
        };
        InvoiceServices.AddRide(userId, List.of(rides));
        InvoiceSummary summary = invoiceGerator.CalculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }

}
