package ro.fasttrackit.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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
    @Test
    @DisplayName("WHEN empty string is recived THEN 0 is returned")
    void emptyString() {
        assertThat(recursiv.lenght("")).isEqualTo(1);
    }
    @Test
    @DisplayName("When given a word THEN return its lenght")
    void forWord() {
        assertThat(recursiv.lenght("word")).isEqualTo(4);
    }
}
}
