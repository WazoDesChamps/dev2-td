package Bisextille;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyDateTest {
    @Test
    void isLenient_false_when_note_multiple_of_4(){
        MyDate date = new MyDate(1, 1 , 2023);
        assertFalse(date.isLenient());
    }

    @Test
    void isLenient_true_when_multiple_of_4_but_not_100() {
        MyDate date = new MyDate(1, 1 , 2004);
        assertTrue(date.isLenient());
    }
    @Test
    void isLenient_false_when_multiple_of_100() {
        MyDate date = new MyDate(1, 1 , 2100);
        assertFalse(date.isLenient());
    }

    @Test
    void isLenient_true_when_multiple_of_4() {
        MyDate date = new MyDate(1, 1 , 2400);
        assertTrue(date.isLenient());
    }
}