package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fakeTag")
public class EmptyTestsDisabled {

    @Test
    @Disabled("Причина 1 откл теста")
    void justTest09(){
        assertTrue(false);
    }

    @Test
    @Disabled("Cause 2 откл теста")
    void justTest10(){
        assertTrue(true);
    }

    @Test
    @Disabled("Причина #003 откл теста")
    void justTest11(){
        assertTrue(false);
    }

    @Test
    @Disabled("Caus4 #04 откл теста")
    void justTest12(){
        assertTrue(true);
    }

}
