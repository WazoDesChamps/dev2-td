package Dog;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DogTest {
    @Test
    void sound_weight_9_is_small() {
        Dog dog = new Dog("chien", 9);
        assertEquals( "Yip Yip", dog.sound());
    }

    @Test
    void sound_weight_10_is_medium() {
        Dog dog = new Dog("chien", 10);
        assertEquals( "Wouf", dog.sound());
    }

    @Test
    void sound_wight_11_is_medium() {
        Dog dog = new Dog("chien", 11);
        assertEquals( "Wouf", dog.sound());
    }

    @Test
    void sound_weight_25_medium() {
        Dog dog = new Dog("chien", 25);
        assertEquals( "Wouf", dog.sound());
    }

    @Test
    void sound_weight_30_is_medium() {
        Dog dog = new Dog("chien", 30);
        assertEquals( "Wouf", dog.sound());
    }

    @Test
    void sound_weight_31_is_big() {
        Dog dog = new Dog("chien", 31);
        assertEquals( "WOUUUUF", dog.sound());
    }

    @Test
    void new_dog_not_injuried(){
        Dog dog = new Dog("chien", 10);
        assertFalse(dog.injured);
    }

    @Test
    void run_after_run_is_hungry(){
        Dog dog = new Dog("chien", 10);
        dog.run();
        assertTrue(dog.isHungry());
    }

    @Test
    void eat_not_hungry_anyone(){
        Dog dog = new Dog("chien", 10);
        dog.run();
        assertTrue(dog.isHungry());
        dog.eat();
        assertFalse(dog.isHungry());
    }

    @Test
    void run_when_hungry_does_not_run_ISE(){
        Dog dog = new Dog("chien", 10);
        dog.run();
        assertTrue(dog.isHungry());
        assertThrows(IllegalStateException.class, () -> dog.run());
    }

}