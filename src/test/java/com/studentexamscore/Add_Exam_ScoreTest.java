package com.studentexamscore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
class Add_Exam_ScoreTest {
    static Add_Exam_Score insertNewExamScore;
    static LinkedList<Exam_Score> scoreLinkedList = new LinkedList<>();
    @BeforeAll
    public static void init()
    {
        insertNewExamScore = new Add_Exam_Score(scoreLinkedList);
    }
    @Test
    public void invaildStudentNumberTest()
    {
        scoreLinkedList.add(new Exam_Score(10005, "9.5", "8.5", "5.0"));
        scoreLinkedList.add(new Exam_Score(10006, "5.5", "6.5", "8.5"));
        scoreLinkedList.add(new Exam_Score(10007, "8.0", "9.5", "1.0"));
        scoreLinkedList.add(new Exam_Score(10008, "7.0", "5.0", "4.0"));

        insertNewExamScore.check_Duplicate_Student_ID("A15");
    }
    @Test
    public void insertAndWriteTestNull()
    {
        insertNewExamScore.insertAndWrite(null);
    }

}