package main;

public class discountCalculator {
    public int discountCalculate(int customerType, int bills) {
        int discount = 0;
        switch (customerType) {
            case 1:
                if (bills <= 0) {
                    discount = -1;
                } else {
                    discount = bills;
                }
                break;
            case 2:
                discount = newCustomerDiscount(bills);
                break;
            case 3:
                discount = oldCustomerDiscount(bills);
                break;
        }
        return discount;
    }

    public static int newCustomerDiscount(int price) {
        if (price <= 0) {
            return -1;
        } else if (price < 100000) {
            return price;
        } else if (price < 500000) {
            return price * 95 / 100;
        } else if (price < 2000000) {
            return price * 90 / 100;
        } else {
            return price * 80 / 100;
        }
    };

    public static int oldCustomerDiscount(int price) {
        if (price <= 0) {
            return -1;
        } else if (price < 100000) {
            return price * 95 / 100;
        } else if (price < 500000) {
            return price * 90 / 100;
        } else if (price < 2000000) {
            return price * 85 / 100;
        } else {
            return price * 75 / 100;
        }
    };
}
