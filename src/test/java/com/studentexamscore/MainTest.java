package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    static Main main = new Main();
    @BeforeAll
    public static void init()
    {

        main = new Main();
    }

    @Test
    void load_DataInvalidPath() {

        main.load_Data("data/score.csv");
    }
    @Test
    void load_DataValidPath() {

        main.load_Data("data/scores.csv");
    }
}