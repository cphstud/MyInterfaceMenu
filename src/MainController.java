import java.util.Scanner;

public class MainController {
    int choice = 0;
    Scanner sc = new Scanner(System.in);
    ShowMenu showMenu = new ShowMenuDK();

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
        int lchoice = 0;
            System.out.println("1) skift til engesk");
            System.out.println("2) change to danish");
            lchoice = sc.nextInt();
            switch (lchoice) {
                case 1: showMenu = new ShowMenuUK();break;
                case 2: showMenu = new ShowMenuDK();break;
            }
    }

    private void confirmOrder() {
    }

    private void editOrder() {
    }

    private void createOrder() {
    }
}
