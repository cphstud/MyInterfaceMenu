package presentation;

import domain.Dog;
import domain.OrderComponent;

import java.util.List;

public interface OrderUI {
    public int addDog();
    public List<Integer> addMoreDogs();
    public int addCustomer();
    public int editOrder();
    public boolean showOrder(OrderComponent components);
}
