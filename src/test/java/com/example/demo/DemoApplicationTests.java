package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.codeborne.selenide.Selenide.open;

class DemoApplicationTests {

    @Test
    void openGoogle() {
        open();
    }

}
