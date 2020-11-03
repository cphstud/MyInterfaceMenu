package presentation;

import domain.Dog;

import java.util.List;

public class ShowDogsImpl implements ShowDogs{
    @Override
    public void showDogs(List<Dog> dogs) {
        for (Dog dog: dogs ) {
            System.out.println(dog.getId() + "Breed: " + dog.getBreed());
        }
    }
}
