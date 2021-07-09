package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fakeTag")
public class EmptyTestsDisabled {

    @Test
    @Disabled
    void justTest09(){
        assertTrue(false);
    }

    @Test
    @Disabled
    void justTest10(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void justTest11(){
        assertTrue(false);
    }

    @Test
    @Disabled
    void justTest12(){
        assertTrue(true);
    }

}
