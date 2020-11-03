package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogCompoundTest {
    Dog dog1,dog2,dog3;
    Compound compound;

    @Before
    public void setup() {
        //26901,Blenheim,Spaniel,CORKY,Female,HILLIER
        dog1 = new Dog(26901,"Blenheim","Spaniel","CORKY","Female","HILLIER");
        dog2 = new Dog(60736,"Fawn","Greyhound","LADY","Desexed Female","ELIZABETH NORTH");
        dog3 = new Dog(101440,"Gold","Golden Retriever","GRACE","Female","CRAIGMORE");
        compound = new Compound(2,"CRAIGMORE");

    }

    @Test
    public void addDogToCompoundTest() {

    }

}