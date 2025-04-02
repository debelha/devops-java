package com.exemplo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    public void testMainRuns() {
        HelloWorld.main(new String[]{});
        assertTrue(true);
    }
}
