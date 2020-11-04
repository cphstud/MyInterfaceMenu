package entry;

import Service.BestillingsService;
import Service.BestillingsServiceFileImpl;
import Service.DogCompoundService;
import Service.DogCompoundServiceImpl;
import domain.Dog;
import domain.Order;
import domain.OrderComponent;
import presentation.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ShowMenu showMenu = new ShowMenuDK();
    ShowDogs showDogs = new ShowDogsImpl();
    DogCompoundService ds = new DogCompoundServiceImpl();
    BestillingsService bs = new BestillingsServiceFileImpl();
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
                case 5: writeBestillingerToStorage();break;
                case 8: changeLanguage();break;
                default:choice=9;break;
            }
        }
    }
    private void writeBestillingerToStorage() {
        bs.writeToStorage(bestillinger);
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
            List<Dog> allDogs = ds.getAllDogs();
            showDogs.showDogs(allDogs);
            //int dogId = orderUI.addDog();
            List<Integer> dogIds = orderUI.addMoreDogs();
            int phone = orderUI.addCustomer();
            //OrderComponent orderComponent = new OrderComponent(dogId, phone);
            OrderComponent orderComponent = new OrderComponent(dogIds, phone);
            boolean ok = orderUI.showOrder(orderComponent);
            if (ok) {
                Order order = new Order(ds.getDogsFromID(dogIds),phone);
                bestillinger.add(order);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
