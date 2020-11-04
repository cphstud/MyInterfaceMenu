package Service;

import domain.Order;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface BestillingsService {
    void writeToStorage(ArrayList<Order> orders);
    void writeImprovedToStorage(ArrayList<Order> orders);
}
