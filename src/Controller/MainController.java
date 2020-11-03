package Controller;

import Domain.Dog;
import Service.DogService;
import Service.DogServiceImp;
import UI.Menu;
import UI.MenuImpDK;
import UI.MenuImpUK;

import java.util.Scanner;

public class MainController {
    //UI.MenuImpDK menu = new UI.MenuImpDK();
    Menu menu = new MenuImpDK();
    Scanner sc = new Scanner(System.in);
    DogService ds = new DogServiceImp();

    public void runProgram() {
        int choice = 0;
        int exitValue = 9;
        
        while(choice != exitValue) {
            menu.printMainMenu();

            choice = sc.nextInt();
            
            switch(choice) {
                case 1:showAllDogs();break;
                case 2:orderDog();break;
                case 3:showOrder();break;
                case 4:confirmOrder();break;
                case 8:changeLanguage();break;
                case 9:exit();break;
                default:choice=exitValue;
            }
            // så kør i hovedloopet
            
            
            
        }
        // TODO: evt exitMetode som rydder op, 
        // sørger for data-integritet
        System.out.println("Farvel og tak");

    }

    private void exit() {
    }

    private void changeLanguage() {
        int langChoice=0;
        System.out.println("Vil du skifte sprog til dansk tast 1, ellers 2");
        langChoice = sc.nextInt();

        switch (langChoice) {
            case 1: menu = new MenuImpDK();break;
            case 2: menu = new MenuImpUK();break;
        }
    }

    private void confirmOrder() {
    }

    private void showOrder() {
    }

    private void orderDog() {
    }

    private void showAllDogs() {
    }
}
