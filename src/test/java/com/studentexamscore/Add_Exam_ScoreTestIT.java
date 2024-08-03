package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class Add_Exam_ScoreTestIT {

    static Add_Exam_Score insertNewExamScore;
    static Main main;
    @BeforeAll
    public static void init()
    {
        main = new Main();
       LinkedList<Exam_Score> scores = main.load_Data("data/scores.csv");
        insertNewExamScore= new Add_Exam_Score(scores);
    }
    @Test
    public void insertAndWriteTestIT()
    { Exam_Score examScore = new Exam_Score(1005,"5.8","7.8","6");
      insertNewExamScore.insertAndWrite(examScore);
    }

}