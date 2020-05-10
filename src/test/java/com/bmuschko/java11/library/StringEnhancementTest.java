package com.bmuschko.java11.library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringEnhancementTest {
    @Test
    void canRepeatString() {
        assertEquals("CPU Usage:                  5%", renderInfo("CPU Usage:", "5%"));
        assertEquals("Memory Usage:          9.14 MB", renderInfo("Memory Usage:", "9.14 MB"));
        assertEquals("Free Disk:             96.5 GB", renderInfo("Free Disk:", "96.5 GB"));
    }


    // 1#
    private String renderInfo(String title, String value) {
        int numberOfSpacesToAdd = 30 - title.length() - value.length();

        return title + /* Add here the right number of space with the right java 11 method */ value;
    }

    // 2#
    @Test
    void canCheckIfStringContainsWhitespaces() {
        String normalName = "Bob";
        String dirtyName = " Bob   ";
        String emptyName = "  ";

        // Assert that normalName does not contain whitespaces only
        // assertTrue();

        // Assert that dirtyName does not contain whitespaces only
        // assertTrue();

        // Assert that emptyName contains whitespaces only
        // assertTrue();
    }

    // 3#
    @Test
    void canStripStringOfLeadingAndTrailingWhitespaces() {
        String fooString = "      foo     ";

        // Use the right method to :

        // remove left spaces AND right spaces at the same time
        // assertEquals("foo", );
        // remove only left spaces
        // assertEquals("foo     ", );
        // remove only right spaces
        // assertEquals("      foo", );
    }

    // 4#
    @Test
    void canStreamLines() {
        String testString = "This\nis\na\ntest";
        List<String> lines = new ArrayList<>();
        // Use the right method to stream to cut testString into a stream of lines
        // testString
                // ???
                // .forEach(lines::add);
        assertEquals(List.of("This", "is", "a", "test"), lines);
    }
}
