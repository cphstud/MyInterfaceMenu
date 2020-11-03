package UI;

public class MenuImpUK implements Menu{
    public void printMainMenu() {
        System.out.println("1) Show all dogs");
        System.out.println("2) Order dog");
        System.out.println("3) Show order");
        System.out.println("4) Confirm order");
        System.out.println("8) change language");
        System.out.println("9) Exit");
    }

    @Override
    public String getLanguage() {
        return "engelsk";
    }
}
