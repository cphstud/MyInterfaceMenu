package Service;

import domain.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BestillingsServiceFileImpl implements BestillingsService{
    @Override
    public void writeToStorage(ArrayList<Order> orders) {
        File file = new File("resource/bestillinger.csv");
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Order order : orders) {
                String msg = String.format("DOGID: %d, CustPhone: %d, Date: %s", order.getDog().getId(), order.getCustomerPhone(), order.getOrderTime().toString());
                bw.write(msg);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
