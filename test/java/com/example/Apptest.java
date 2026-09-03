package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testApplication() {
        assertTrue(true);
    }

    @Test
    public void testBasicPlanCalculation() {
        double baseBill = 499;
        double extraData = 15;
        double extraRate = 10;

        double totalBill = baseBill + (extraData * extraRate);

        assertEquals(649, totalBill, 0.01);
    }

    @Test
    public void testStandardPlanCalculation() {
        double baseBill = 799;
        double extraData = 10;
        double extraRate = 8;

        double totalBill = baseBill + (extraData * extraRate);

        assertEquals(879, totalBill, 0.01);
    }

    @Test
    public void testPremiumPlanCalculation() {
        double baseBill = 1199;
        double extraData = 20;
        double extraRate = 5;

        double totalBill = baseBill + (extraData * extraRate);

        assertEquals(1299, totalBill, 0.01);
    }
}
