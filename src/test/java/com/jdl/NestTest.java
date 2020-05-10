package com.jdl;

import com.jdl.nest.Outer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NestTest {

    private static final String NEST_HOST_NAME = "com.jdl.nest.Outer";

    @Test
    public void whenGetNestHostFromOuter_thenGetNestHost() {
        assertEquals(NEST_HOST_NAME, Outer.class.getNestHost().getName());
    }

    @Test
    public void whenGetNestHostFromInner_thenGetNestHost() {
        assertEquals(NEST_HOST_NAME, Outer.Inner.class.getNestHost().getName());
    }

    @Test
    public void whenCheckNestmatesForNestedClasses_thenGetTrue() {
        assertTrue(Outer.Inner.class.isNestmateOf(Outer.class));
    }

    @Test
    public void whenCheckNestmatesForUnrelatedClasses_thenGetFalse() {
        assertFalse(Outer.Inner.class.isNestmateOf(String.class));
    }

    @Test
    public void whenGetNestMembersForNestedClasses_thenGetAllNestedClasses() {
        Set<String> nestMembers = Arrays.stream(Outer.Inner.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());

        assertEquals(2, nestMembers.size());

        assertTrue(nestMembers.contains("com.jdl.nest.Outer$Inner"));
        assertTrue(nestMembers.contains("com.jdl.nest.Outer"));
    }
}
