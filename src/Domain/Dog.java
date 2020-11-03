package Domain;
//Reference,Colour_Description,Breed_Description,Animal_Name,Gender,Suburb

public class Dog {
    private int id;
    private String color;
    private String breed;
    private String name;
    private String gender;
    private String suburb;

    public Dog(int id, String color, String breed, String name, String gender, String suburb) {
        this.id = id;
        this.color = color;
        this.breed = breed;
        this.name = name;
        this.gender = gender;
        this.suburb = suburb;
    }
}
