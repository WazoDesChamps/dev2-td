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

    @Test
    void isWeightBetween_nb1_before_nb2_and_weight_is_inside() {
        Dog dog = new Dog("chien", 10);
        assertTrue(dog.isWeightBetween(4, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weight_is_below() {
        Dog dog = new Dog("chien", 12);
        assertFalse(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weight_is_above() {
        Dog dog = new Dog("chien", 25);
        assertFalse(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weight_is_nb1() {
        Dog dog = new Dog("chien", 13);
        assertTrue(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_before_nb2_and_weight_is_nb2() {
        Dog dog = new Dog("chien", 24);
        assertTrue(dog.isWeightBetween(13, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weight_is_inside() {
        Dog dog = new Dog("chien", 30);
        assertTrue(dog.isWeightBetween(42, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weight_is_below() {
        Dog dog = new Dog("chien", 23);
        assertFalse(dog.isWeightBetween(33, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weight_is_above() {
        Dog dog = new Dog("chien", 34);
        assertFalse(dog.isWeightBetween(33, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weight_is_nb1() {
        Dog dog = new Dog("chien", 33);
        assertTrue(dog.isWeightBetween(33, 24));
    }

    @Test
    void isWeightBetween_nb1_after_nb2_and_weight_is_nb2() {
        Dog dog = new Dog("chien", 24);
        assertTrue(dog.isWeightBetween(33, 24));
    }
}