/* (C)2022 */
package edu.cmu.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MessageUtilsTest {
    @Test
    void testGetMessage() {
        assertEquals("Hello      World!", MessageUtils.getMessage());
    }
}
