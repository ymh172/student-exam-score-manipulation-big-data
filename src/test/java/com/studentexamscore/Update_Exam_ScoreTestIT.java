package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
class Update_Exam_ScoreTestIT {
    static Update_Exam_Score updateExamScore;
    static LinkedList<Exam_Score> scoreLinkedList = new LinkedList<>();
    static Main main;
    @BeforeAll
    public static void init()
    {
        main = new Main();
        scoreLinkedList = main.load_Data("data/scores.csv");
        updateExamScore = new Update_Exam_Score(scoreLinkedList);
    }
    @Test
    void updateAndWrite() {
        Exam_Score examScore = new Exam_Score(1006,"3.8","4.8","5");
        updateExamScore.updateAndWrite(examScore);
    }
}