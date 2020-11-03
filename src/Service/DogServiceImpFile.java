package Service;

import Domain.Dog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class DogServiceImpFile implements DogService{
    List<Dog> dogs;

    public DogServiceImpFile() {
        dogs = new ArrayList<>();
        initDogs();
    }

    private void initDogs() {
        //TDOD: hent listen fra en fil
        // fil-location
        // filereader + bufferedreader
        // hent hver linje: split og lav hund
        File file = new File("resources/dogtest.csv");
        try {
            FileReader fw = new FileReader(file);
            BufferedReader br = new BufferedReader(fw);
            String line = "";
            Dog tmpDog = null;
            while((line = br.readLine())!= null) {
                //26900,Tri-Colored,Spaniel,GIDGET,Female,HILLIER

                System.out.println(line);
                dogs.add(tmpDog);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Dog> getAllDogs() {
        return dogs;
    }
}
