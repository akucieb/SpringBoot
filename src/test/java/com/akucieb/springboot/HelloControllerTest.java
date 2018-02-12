package com.akucieb.springboot;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class HelloControllerTest {
    private HelloController helloController = new HelloController();

    @Test
    public void helloTest() {
        assertThat(helloController.sayHello(), containsString("Hello"));
    }
}
