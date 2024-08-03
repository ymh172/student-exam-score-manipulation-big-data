package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Delete_Exam_ScoreTest {

    static Delete_Exam_Score deleteExamScore;
    static LinkedList<Exam_Score> scoreLinkedList = new LinkedList<>();
    @BeforeAll
    public static void init()
    {
        deleteExamScore = new Delete_Exam_Score(scoreLinkedList);
    }
    @Test
    public void invalidStudentNumberTest() {

        deleteExamScore.find_StudentID("100");
    }
    @Test
    void deleteAndWrite() {

        deleteExamScore.deleteAndWrite();
    }
}