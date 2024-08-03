package com.studentexamscore;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Update_Exam_Score {
    Scanner sc = new Scanner (System.in);
    String update_studentID;
    String update_mathematics;
    String update_literature;
    String update_foreignLanguage;
    String update_physics;
    String update_chemistry;
    String update_biology;
    String update_history;
    String update_geography;
    String update_civicEducation;
    String update_foreignLanguageCode;
    int index = 0;
    public LinkedList<Exam_Score> scorelist;

    public Update_Exam_Score(LinkedList<Exam_Score> scorelist)
    {
        this.scorelist = scorelist;
    }
    public int find_StudentID(String studentID)
    {
        int index = -1;
        int i = 0;
        try{
            int sid = Integer.parseInt(studentID);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("Please enter valid digit number");
        }
        for (Exam_Score s : scorelist)
        {
            if (s.getStudentID() == Integer.parseInt(studentID))
            {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }
    public Update_Exam_Score()
    {

    }
    private void chooseSubjectMenu()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("      Choose One of Two subject Combinations:               ");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Natural Sciences (Physics, Chemistry, Biology) ");
        System.out.println("2. Social Sciences (History, Geography and Civic Education) ");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("Enter Options 1 or 2: ");
    }
    private void chooseSubject()
    {
        chooseSubjectMenu();
        String option = sc.nextLine();
        List<String> subjectMenu = Arrays.asList("1","2");
        while (!subjectMenu.contains(option))
        {
            System.out.println("Choose Option only 1 or 2 ");
            System.out.print  ("Enter Options 1 or 2: ");
            option = sc.nextLine();
        }

        if (option.contentEquals("1"))
        {
            System.out.println("---------------------------");
            System.out.println(" Score of Natural Sciences ");
            System.out.println("---------------------------");

            System.out.print("Enter Scores for Physics to update : ");
            update_physics = sc.nextLine();
            while (!(update_physics.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Update Scores for Physics must be between 0.0 to 10.0");
                System.out.print("Enter Update Scores for Physics to update : ");
                update_physics = sc.nextLine();
            }

            System.out.print("Enter Scores for Chemistry to update : ");
            update_chemistry = sc.nextLine();
            while (!(update_chemistry.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Update Scores for Chemistry must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Chemistry to Update : ");
                update_chemistry = sc.nextLine();
            }

            System.out.print("Enter Scores for Biology to Update : ");
            update_biology = sc.nextLine();
            while (!(update_biology.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Update Scores for Biology must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Biology to update : ");
                update_biology = sc.nextLine();
            }
            update_history = "";
            update_geography = "";
            update_civicEducation = "";
        }

        else if (option.contentEquals("2"))
        {
            update_physics = "";
            update_chemistry = "";
            update_biology = "";

            System.out.println("--------------------------");
            System.out.println(" Score of Social Sciences ");
            System.out.println("--------------------------");

            System.out.print("Enter Scores for History to update : ");
            update_history = sc.nextLine();
            while (!(update_history.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
                System.out.println("Enter Update Scores for History must be between 0.0 to 10.0");
                System.out.print("Enter Scores for History to update : ");
                update_history = sc.nextLine();
            }

            System.out.print("Enter Scores for Geography to update : ");
            update_geography = sc.nextLine();
            while (!(update_geography.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
                System.out.println("Enter Update Scores for Geography must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Geography to update : ");
                update_geography = sc.nextLine();
            }

            System.out.print("Enter Scores for Civic Education to update : ");
            update_civicEducation = sc.nextLine();
            while (!(update_civicEducation.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Update Scores for Civic Education must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Civic Education to update : ");
                update_civicEducation = sc.nextLine();
            }
        }
    }
    public Exam_Score update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter StudentID to Update : ");
        update_studentID = sc.nextLine();

        while (!update_studentID.matches("[0-9]{8}")) {
            System.out.println("Enter studentID is only in 8 digits.");
            System.out.print("Enter studentID to Update : ");
            update_studentID = sc.nextLine();
        }

        index = find_StudentID(update_studentID);

        while (index == -1) {
            System.out.println("Student ID not Found to Update.");
            System.out.print("Enter Again StudentID to Update : ");
            update_studentID = sc.nextLine();

            while (!update_studentID.matches("[0-9]{8}")) {
                System.out.println("Enter studentID is only in 8 digits.");
                System.out.print("Enter studentID to update : ");
                update_studentID = sc.nextLine();
            }

            index = find_StudentID(update_studentID);
        }
        System.out.println("Student ID Found to Update. ");

        System.out.print("Enter Scores for Mathematics to update : ");
        update_mathematics = sc.nextLine();
        while (!(update_mathematics.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
            System.out.println("Enter Update Scores for Update_Mathematics must be between 0.0 to 10.0");
            System.out.print("Enter Scores for Update_Mathematics to update : ");
            update_mathematics = sc.nextLine();
        }

        System.out.print("Enter Scores for Literature to update : ");
        update_literature = sc.nextLine();
        while (!(update_literature.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
            System.out.println("Enter Update Scores for Literatures must be between 0.0 to 10.0");
            System.out.print("Enter Scores for Literatures to update : ");
            update_literature = sc.nextLine();
        }

        System.out.print("Enter Scores for Foreign Language to update : ");
        update_foreignLanguage = sc.nextLine();
        while (!(update_foreignLanguage.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
            System.out.println("Enter Update Scores for Foreign Language must be between 0.0 to 10.0");
            System.out.print("Enter Scores for Foreign Language to update : ");
            update_foreignLanguage = sc.nextLine();
        }

        chooseSubject();

        if (update_foreignLanguage == "") {
            update_foreignLanguageCode = "";
        } else {
            System.out.print("Enter Scores for Foreign Language Code to update : ");
            update_foreignLanguageCode = sc.nextLine();
            while (!(update_foreignLanguageCode.matches("([N][1-7])?"))) {
                System.out.println("Enter Update Scores for Foreign Language Code must be between N1 to N7");
                System.out.print("Enter Scores for Foreign Language Code to update : ");
                update_foreignLanguageCode = sc.nextLine();
            }
        }

        return new Exam_Score(Integer.parseInt(update_studentID), update_mathematics, update_literature, update_foreignLanguage,
                update_physics, update_chemistry, update_biology, update_history, update_geography, update_civicEducation,
                update_foreignLanguageCode);
    }
        public void updateAndWrite(Exam_Score escore) {
            if (escore==null)
            {
                System.out.println("escore is null");
                return;
            }
            else {
                scorelist.set(index, escore);
                try {
                    CSVWriter cw = new CSVWriter(new FileWriter("data/scores.csv", false));
                    cw.writeNext(new String[]{"studentID", "Mathematics", "Literature", "foreignLanguage",
                            "Physics", "Chemistry", "Biology",
                            "History", "Geography", "civicEducation", "foreignLanguageCode"});
                    for (Exam_Score s : scorelist) {
                        cw.writeNext(new String[]{String.valueOf(s.getStudentID()), s.getMathematics(),
                                s.getLiterature(), s.getForeignLanguage(), s.getPhysics(), s.getChemistry(), s.getBiology(),
                                s.getHistory(), s.getGeography(), s.getCivicEducation(), s.getForeignLanguageCode()});
                    }
                    cw.close();
                    System.out.println("**** Exam Scores are Successfully Updated ****");
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
}
