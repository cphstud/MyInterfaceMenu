public class ShowMenuUK implements ShowMenu{
    @Override
    public void showMenu() {
        System.out.println("1) show menu");
        System.out.println("2) create order");
        System.out.println("3) edit order");
        System.out.println("4) confirm order");
        System.out.println("8) switch to danish ");
        System.out.println("9) exit ");

    }

    @Override
    public String getLanguage() {
        return "english";
    }
}
