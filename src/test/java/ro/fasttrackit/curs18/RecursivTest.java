package ro.fasttrackit.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursivTest {
    Recursiv recursiv;

    @BeforeEach
    void setup() {
        recursiv = new Recursiv();
    }
    @Test
    @DisplayName("when null is recived THEN throw IllegalArgumentException")
    void ifNullThenException(){
        assertThrows(IllegalArgumentException.class, () -> recursiv.lenght(null));

    }
}
