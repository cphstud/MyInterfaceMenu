package UI;

public class MenuImpDK implements Menu{

    public void printMainMenu() {
        System.out.println("1) Vis alle hunde");
        System.out.println("2) Bestil hund");
        System.out.println("3) Vis bestilling");
        System.out.println("4) Godkend bestilling");
        System.out.println("8) Skift sprog");
        System.out.println("9) Exit");
    }

    @Override
    public String getLanguage() {
        return "dansk";
    }

    public void sayNo() {
        System.out.println("Say no");
    }
}
