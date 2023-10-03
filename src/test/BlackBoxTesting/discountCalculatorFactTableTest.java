package test.BlackBoxTesting;

import main.discountCalculator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Các ca kiểm thử được tạo ra sau khi sử dụng phương pháp Xây dựng bảng quyết định
public class discountCalculatorFactTableTest {
    @Test
    public void calculatorNormalCustomerTest1() {
        int customerType = 1;
        int bills = -1;
        var calculator = new discountCalculator();
        assertEquals(-1, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorNormalCustomerTest2() {
        int customerType = 1;
        int bills = 100000;
        var calculator = new discountCalculator();
        assertEquals(100000, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorNewCustomerTest1() {
        int customerType = 2;
        int bills = -1;
        var calculator = new discountCalculator();
        assertEquals(-1, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorNewCustomerTest2() {
        int customerType = 2;
        int bills = 50000;
        var calculator = new discountCalculator();
        assertEquals(50000, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorNewCustomerTest3() {
        int customerType = 2;
        int bills = 250000;
        var calculator = new discountCalculator();
        assertEquals(237500, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorNewCustomerTest4() {
        int customerType = 2;
        int bills = 1000000;
        var calculator = new discountCalculator();
        assertEquals(900000, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorNewCustomerTest5() {
        int customerType = 2;
        int bills = 2500000;
        var calculator = new discountCalculator();
        assertEquals(2000000, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorOldCustomerTest1() {
        int customerType = 3;
        int bills = -1;
        var calculator = new discountCalculator();
        assertEquals(-1, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorOldCustomerTest2() {
        int customerType = 3;
        int bills = 50000;
        var calculator = new discountCalculator();
        assertEquals(47500, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorOldCustomerTest3() {
        int customerType = 3;
        int bills = 250000;
        var calculator = new discountCalculator();
        assertEquals(225000, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorOldCustomerTest4() {
        int customerType = 3;
        int bills = 1000000;
        var calculator = new discountCalculator();
        assertEquals(850000, calculator.discountCalculate(customerType, bills));
    }

    @Test
    public void calculatorOldCustomerTest5() {
        int customerType = 3;
        int bills = 2500000;
        var calculator = new discountCalculator();
        assertEquals(1875000, calculator.discountCalculate(customerType, bills));
    }
}
