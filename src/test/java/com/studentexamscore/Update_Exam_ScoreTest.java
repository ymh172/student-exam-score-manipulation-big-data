package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Update_Exam_ScoreTest {
    static Update_Exam_Score updateExamScore;
    static LinkedList<Exam_Score> scoreLinkedList = new LinkedList<>();
    @BeforeAll
    public static void init()
    {
        updateExamScore = new Update_Exam_Score(scoreLinkedList);
        scoreLinkedList.add(new Exam_Score(10005, "9.5", "8.5", "5.0"));
        scoreLinkedList.add(new Exam_Score(10006, "5.5", "6.5", "8.5"));
        scoreLinkedList.add(new Exam_Score(10007, "8.0", "9.5", "1.0"));
        scoreLinkedList.add(new Exam_Score(10008, "7.0", "5.0", "4.0"));
    }
    @Test
    public void invalidStudentNumberTest() {

        updateExamScore.find_StudentID("100");
    }
    @Test
    void updateAndWrite() {
        updateExamScore.updateAndWrite(null);
    }
}