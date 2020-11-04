package domain;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private static int counter = 0;
    private int id;
    private int customerPhone;
    private Dog dog;
    private List<Dog> dogs;
    private LocalDateTime orderTime;

    public Order(List<Dog> dogs, int customerPhone ) {
        this.dogs = dogs;
        this.orderTime = LocalDateTime.now();
        this.customerPhone = customerPhone;
        this.id = counter;
        counter++;
    }

    public Order(Dog dog, int customerPhone ) {
        this.dog = dog;
        this.orderTime = LocalDateTime.now();
        this.customerPhone = customerPhone;
        this.id = counter;
        counter++;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public int getId() {
        return id;
    }

    public int getCustomerPhone() {
        return customerPhone;
    }

    public Dog getDog() {
        return dog;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
