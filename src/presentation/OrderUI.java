package presentation;

import domain.Dog;
import domain.OrderComponent;

public interface OrderUI {
    public int addDog();
    public int addCustomer();
    public int editOrder();
    public boolean showOrder(OrderComponent components);
}
