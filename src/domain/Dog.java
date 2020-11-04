package domain;

public class Dog {
    //dog1 = new Dog(26901,"Blenheim","Spaniel","CORKY","Female","HILLIER");
    static int counter = 0;
    int doguid;
    int id;
    String color;
    String breed;
    String name;
    String gender;
    String location;

    public Dog(int id, String color, String breed, String name, String gender, String location) {

        this.doguid = counter;
        counter++;
        this.id = id;
        this.color = color;
        this.breed = breed;
        this.name = name;
        this.gender = gender;
        this.location = location;
    }

    public int getDoguid() {
        return doguid;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
