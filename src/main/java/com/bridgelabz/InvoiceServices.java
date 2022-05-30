package com.bridgelabz;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
public class InvoiceServices {

        public static HashMap<String, List<Rides>> Account =  new HashMap<>();
        private static String key;
        private static List<Rides> inputRides;

        public static void AddRide(String key,List<Rides> inputRides)
        {
            InvoiceServices.key = key;
            InvoiceServices.inputRides = inputRides;
            try {
                if (key.isEmpty()) {
                    throw new IllegalArgumentException(key);
                }
                if (inputRides.isEmpty()) {
                    throw new IllegalArgumentException((Throwable) inputRides);
                }
                if (Account.containsKey(key)) {
                    Account.put(key, inputRides);
                }
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }



    }

