package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fakeTag")
public class EmptyTestsFalse {

    @Test
    void justTest05(){
        assertTrue(false);
    }

    @Test
    void justTest06(){
        assertTrue(false);
    }

    @Test
    void justTest07(){
        assertTrue(false);
    }

    @Test
    void justTest08(){
        assertTrue(false);
    }

}
