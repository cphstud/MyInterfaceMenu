package domain;

import java.util.List;

public class OrderComponent {

    public List<Integer> dogIds ;
    public int dogId;
    public int phone;

    public OrderComponent(List<Integer> dogIds, int phone) {
        this.dogId = dogId;
        this.phone = phone;
    }
    public OrderComponent(int dogId, int phone) {
        this.dogId = dogId;
        this.phone = phone;
    }
}
