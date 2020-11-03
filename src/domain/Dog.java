package domain;

public class Dog {
    //dog1 = new Dog(26901,"Blenheim","Spaniel","CORKY","Female","HILLIER");
    int id;
    String color;
    String breed;
    String name;
    String gender;
    String location;

    public Dog(int id, String color, String breed, String name, String gender, String location) {
        this.id = id;
        this.color = color;
        this.breed = breed;
        this.name = name;
        this.gender = gender;
        this.location = location;
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
