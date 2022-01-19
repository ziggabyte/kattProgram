package com.example.kattprogram;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KattProgramApplicationTests {

    @Autowired
    CatController catController;

    @Test
    void test_create_cat() {
        CatController.CatDTO catDTO = catController.create(new CatController.CreateCat("Kitty", "Bore"));
    }

}
