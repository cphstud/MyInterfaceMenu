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
        //1,20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
        /// dog1 = new Dog(26901,"Blenheim","Spaniel","CORKY","Female","HILLIER");
        //
        File file = new File("resource/dogstest.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        Dog dog = null;
        try {
            br.readLine();
            while((line = br.readLine()) != null) {
                String[] lineArr = line.split(",");
                System.out.println(line);
                dog = new Dog(Integer.valueOf(lineArr[1]),lineArr[2],lineArr[3],lineArr[4],lineArr[5], lineArr[6]);
                dogs.add(dog);
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
