package com.studentexamscore;
import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main extends Option{
    Scanner sc = new Scanner(System.in);
    public LinkedList <Exam_Score> scorelist = new LinkedList<>();
    public Main()
    {
    scorelist = load_Data("data/scores.csv");


       // display_MainMenu();
    }
    public LinkedList<Exam_Score> load_Data(String filename)
    {    File file= new File(filename);
        if(!file.exists())
        {
            System.out.println("file not found. Try correct file path.");

        }
        else {
            try {
                CSVReader cr = new CSVReader(new FileReader(file));
                String[] data = cr.readNext();
                while ((data = cr.readNext()) != null) {
                    scorelist.add(new Exam_Score(Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5],
                            data[6], data[7], data[8], data[9], data[10]));
                }
                cr.close();
                System.out.println("Read Data Successfully");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return scorelist;
    }
    private void mainmenu()
    {
        System.out.println("-----------------------------------------");
        System.out.println("           Student Exam Scores             ");
        System.out.println("-----------------------------------------");
        System.out.println("1. Add new exam scores");
        System.out.println("2. Delete Record");
        System.out.println("3. Update Exam Score");
        System.out.println("4. Report for number of students which are pass and which are fail along with percentage");
        System.out.println("5. Report for number of student for Natural Science and Social Science with total pass or fail with percentage");
        System.out.println("6. Report for number of student for each Foreign Language with total pass or fail with percentage");
        System.out.println("7. Report for exam transcript for each specific student");
        System.out.println("8. Exit");
        System.out.println("-----------------------------------------");
        System.out.print("Enter menu from 1 to 8:");
    }

    public void display_MainMenu()
    {
        mainmenu();

        String input = sc.nextLine();

        List<String> menuno = Arrays.asList("1", "2", "3", "4", "5","6","7","8");

        while (!menuno.contains(input))
        {
            System.out.println("Enter only number between 1 to 6. ");
            System.out.print("Enter Menu from 1 to 6: ");
            input = sc.nextLine();
        }

        if (input.contentEquals("1"))
        {
            add();
        }
        else if (input.contentEquals("2"))
        {
            delete();
        }
        else if (input.contentEquals("3"))
        {
            update();
        }
        else if (input.contentEquals("4"))
        {
            Total_Pass_and_Fail_Report();
        }
        else if (input.contentEquals("5"))
        {
            TwoSubjects_Pass_And_Fail_Report();
        }
        else if (input.contentEquals("6"))
        {
            Foreign_Language_Pass_And_Fail_Report();
        }
        else if (input.contentEquals("7"))
        {
            Exam_transcript_Report();
        }

        else if (input.contentEquals("8"))
        {
            System.out.println("Exit");
            System.exit(0);
        }
        else {
            System.exit(0);
        }

        display_MainMenu();
    }

    public static void main(String[] args) {
        System.out.println("*** Welcome from Student Exam Score Data Manipulation Program ***");
        Main m=new Main();
        m.display_MainMenu();
        String filename="data/scores.csv";
        m.load_Data(filename);
    }


    @Override
    void add() {
        System.out.println("---------------------");
        System.out.println("Add New Exam Score");
        System.out.println("---------------------");
        Add_Exam_Score score = new Add_Exam_Score(scorelist);
        Exam_Score escore = score.insert();
        score.insertAndWrite(escore);
    }

    @Override
    void update() {
        System.out.println("---------------------");
        System.out.println("  Update Exam Score  ");
        System.out.println("---------------------");
        Update_Exam_Score score = new Update_Exam_Score(scorelist);
        Exam_Score examScore = score.update();
        score.updateAndWrite(examScore);
    }

    @Override
    void delete() {
        System.out.println("---------------------");
        System.out.println("  Delete Record  ");
        System.out.println("---------------------");
        Delete_Exam_Score score = new Delete_Exam_Score(scorelist);
        score.delete();
        score.deleteAndWrite();
    }




    @Override
    public void Total_Pass_and_Fail_Report() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Report for number of students which are pass and which are fail along with percentage");
        System.out.println("------------------------------------------------------------------");
        new Report_Percentage_Of_Total_Pass_And_Fail(scorelist);
    }

    @Override
    public void TwoSubjects_Pass_And_Fail_Report() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Report for passed and failed percentage of Social Science and Natural Science");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        new Report_Percentage_Of_NaturalScience_And_SocialScience(scorelist);
    }

    @Override
    public void Foreign_Language_Pass_And_Fail_Report() {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Report for Foreign Language Percentage");
        System.out.println("-------------------------------------------------------------------------------------------------");
        new Report_Percentage_Of_Foreign_Language(scorelist);
    }

    @Override
    public void Exam_transcript_Report() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Report for exam transcript for each specific student");
        System.out.println("-----------------------------------------------------------------------");
        new Report_Student_Transcript(scorelist);
    }
}
