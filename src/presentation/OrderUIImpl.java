package presentation;

import domain.OrderComponent;

import java.util.Scanner;

public class OrderUIImpl implements OrderUI{
    Scanner sc = new Scanner(System.in);
    @Override
    public int addDog() {
        int retVal = 0;
        System.out.println("Enter dogID: ");
        retVal = sc.nextInt();
        return retVal;
    }

    @Override
    public int addCustomer() {
        return 0;
    }

    @Override
    public int editOrder() {
        return 0;
    }

    @Override
    public boolean showOrder(OrderComponent components) {
        boolean retVal = true;
        System.out.println("Type 1 if confirm, else 0:");
        System.out.println("Dog: " + components.dogId);
        System.out.println("phone: " + components.phone);
        if (sc.nextInt() == 0) {
            retVal = false;
        }
        return retVal;
    }
}
