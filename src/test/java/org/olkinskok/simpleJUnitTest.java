package org.olkinskok;

import org.junit.jupiter.api.*;

public class simpleJUnitTest {

    @BeforeAll
    static void beforall() {
        System.out.println("\n\n### @BeforeAll\n");
    }
    @AfterAll
    static void afterall() {
        System.out.println("\n### @AfterAll\n\n");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("###    @BeforeEach");
    }
    @Test
void firstTest() {
        System.out.println("###       @Test firstTest");
        Assertions.assertTrue( 2 * 2 == 4);
    }
    @Test
    void secondTest() {
        System.out.println("###       @Test secondTest");
        Assertions.assertTrue( 2 + 2 == 4);
    }
}
