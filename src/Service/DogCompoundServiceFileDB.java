package Service;

import domain.Dog;
import domain.DogCompound;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DogCompoundServiceFileDB implements DogCompoundService{

    @Override
    public List<Dog> getAllDogs() throws FileNotFoundException {
        List<Dog> dogs = new ArrayList<>();
        // TODO: get dogs from file
        File file = new File("resource/dogstest.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        try {
            while((line = br.readLine()) != null) {
                String[] lineArr = line.split(",");
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dogs;
    }

    @Override
    public void addDogToCompound(DogCompound dogCompound, Dog dog) {

    }

    @Override
    public Dog getDogFromCompoundByID(DogCompound dogCompound, int id) {
        return null;
    }

    @Override
    public DogCompound getDogCompoundByID(int id) {
        return null;
    }

    @Override
    public List<DogCompound> getAllCompounds() {
        return null;
    }

    @Override
    public double getDogCarePrice(DogCompound dogCompound) {
        return 0;
    }
}
