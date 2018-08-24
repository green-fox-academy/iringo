import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    private Animal animal;

    @Before
    public void createAnimal() {
        animal = new Animal(20, 20);
    }

    @Test
    public void eat() {
        assertEquals(animal.eat(), 19);
    }

    @Test
    public void eatWithWrongOutcome() {
        assertEquals(animal.eat(), 18);
    }
    @Test
    public void eatWithNullOutcome() {
        assertEquals(animal.eat(), null);
    }


    @Test
    public void drink() {
        assertEquals(animal.drink(), 19);
    }

    @Test
    public void drinkWithWrongOutcome() {
        assertEquals(animal.drink(), 122);
    }

    @Test
    public void drinkWithNullOutcome() {
        assertEquals(animal.eat(), null);
    }


    @Test
    public void play() {
        assertEquals(animal.play(), 42);
    }

    @Test
    public void playtWithWrongOutcome() {
        assertEquals(animal.eat(), 188);
    }
}