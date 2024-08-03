package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Delete_Exam_ScoreTestIT {
    static Delete_Exam_Score deleteExamScore;
    static LinkedList<Exam_Score> scoreLinkedList = new LinkedList<>();
    static Main main;
    @BeforeAll
    public static void init() {
        main = new Main();
        scoreLinkedList = main.load_Data("data/scores.csv");
        deleteExamScore = new Delete_Exam_Score(scoreLinkedList);
    }
    @Test
    void deleteAndWrite() {

        deleteExamScore.deleteAndWrite();
    }
}