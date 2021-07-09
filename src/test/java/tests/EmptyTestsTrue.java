package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fakeTag")
public class EmptyTestsTrue {

    @Test
    void justTest01(){
        assertTrue(true);
    }

    @Test
    void justTest02(){
        assertTrue(true);
    }

    @Test
    void justTest03(){
        assertTrue(true);
    }

    @Test
    void justTest04(){
        assertTrue(true);
    }

}
