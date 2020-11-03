package entry;

import Service.DogCompoundService;
import Service.DogCompoundServiceImpl;
import domain.Order;
import domain.OrderComponent;
import presentation.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ShowMenu showMenu = new ShowMenuDK();
    ShowDogs showDogs = new ShowDogsImpl();
    DogCompoundService ds = new DogCompoundServiceImpl();
    ArrayList<Order> bestillinger = new ArrayList<>();

    public void runProgram() {
        while (choice!=9) {
            showMenu.showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1: showMenu.showMenu();break;
                case 2: createOrder();break;
                case 3: editOrder();break;
                case 4: confirmOrder();break;
                case 8: changeLanguage();break;
                default:choice=9;break;
            }
        }
    }

    private void changeLanguage() {
        String lg = showMenu.getLanguage();
            switch (lg) {
                case "danish": showMenu = new ShowMenuUK();break;
                case "english": showMenu = new ShowMenuDK();break;
            }
    }

    private void confirmOrder() {
    }

    private void editOrder() {
    }

    private void createOrder() {
        OrderUI orderUI = new OrderUIImpl();
        try {
            showDogs.showDogs(ds.getAllDogs());
            int dogId = orderUI.addDog();
            int phone = orderUI.addCustomer();
            OrderComponent orderComponent = new OrderComponent(dogId, phone);
            boolean ok = orderUI.showOrder(orderComponent);
            if (ok) {
                Order order = new Order(ds.getDogFromID(dogId),phone);
                bestillinger.add(order);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
