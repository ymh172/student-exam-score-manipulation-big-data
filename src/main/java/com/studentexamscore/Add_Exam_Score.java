package com.studentexamscore;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Add_Exam_Score {
    Scanner sc = new Scanner (System.in);
    String studentID;
    String mathematics;
    String literature;
    String foreignLanguage;
    String physics;
    String chemistry;
    String biology;
    String history;
    String geography;
    String civicEducation;
    String foreignLanguageCode;
    private LinkedList <Exam_Score> scorelist;
    public Add_Exam_Score(LinkedList<Exam_Score>scorelist)
    {
        this.scorelist = scorelist;
        //insert();
    }
    public boolean check_Duplicate_Student_ID (String studentID)
    {
        int sid = 0;
        try{
        sid = Integer.parseInt(studentID);
    }
        catch (NumberFormatException e)
        {
            System.out.println(e);
            System.out.println("Please enter valid digit number");
        }
        for (Exam_Score s : scorelist)
        {
            if(s.getStudentID() == sid)
            {
                return true;
            }
        }
        return false;
    }
    public Add_Exam_Score(){};
    public void chooseSubjectMenu()
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("      Choose One of Two subject Combinations:               ");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Natural Sciences (Physics, Chemistry, Biology) ");
        System.out.println("2. Social Sciences (History, Geography and Civic Education) ");
        System.out.println("------------------------------------------------------------");
        System.out.print  ("Enter Options 1 or 2: ");
    }
    public void chooseSubject()
    {
        chooseSubjectMenu();
        String option = sc.nextLine();
        List <String> subjectMenu = Arrays.asList("1","2");
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

            System.out.print("Enter Scores for Physics : ");
            physics = sc.nextLine();
            while (!(physics.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Scores for Physics must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Physics : ");
                physics = sc.nextLine();
            }

            System.out.print("Enter Scores for Chemistry : ");
            chemistry = sc.nextLine();
            while (!(chemistry.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Scores for Chemistry must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Chemistry : ");
                chemistry = sc.nextLine();
            }

            System.out.print("Enter Scores for Biology : ");
            biology = sc.nextLine();
            while (!(biology.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Scores for Biology must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Biology : ");
                biology = sc.nextLine();
            }
            history = "";
            geography = "";
            civicEducation = "";

        }

        else if (option.contentEquals("2"))
        {
            physics = "";
            chemistry = "";
            biology = "";

            System.out.println("--------------------------");
            System.out.println(" Score of Social Sciences ");
            System.out.println("--------------------------");

            System.out.print("Enter Scores for History : ");
            history = sc.nextLine();
            while (!(history.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
                System.out.println("Enter Scores for History must be between 0.0 to 10.0");
                System.out.print("Enter Scores for History : ");
                history = sc.nextLine();
            }

            System.out.print("Enter Scores for Geography : ");
            geography = sc.nextLine();
            while (!(geography.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
                System.out.println("Enter Scores for Geography must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Geography : ");
                geography = sc.nextLine();
            }

            System.out.print("Enter Scores for Civic Education : ");
            civicEducation = sc.nextLine();
            while (!(civicEducation.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$")))
            {
                System.out.println("Enter Scores for Civic Education must be between 0.0 to 10.0");
                System.out.print("Enter Scores for Civic Education : ");
                civicEducation = sc.nextLine();
            }
        }
    }
    public Exam_Score insert() {
        System.out.print("Enter Student ID : ");
        studentID = sc.nextLine();
        while (!studentID.matches("[0-9]{8}")) {
            System.out.println("Enter studentID is only in 8 digits.");
            System.out.print("Enter studentID : ");
            studentID = sc.nextLine();
        }

        while (check_Duplicate_Student_ID(String.valueOf(studentID))) {
            System.out.println("Student ID is already existed.");
            System.out.print("Enter Again Student ID : ");
            studentID = sc.nextLine();
            while (!studentID.matches("[0-9]{8}")) {
                System.out.println("Enter studentID is only in 8 digits.");
                System.out.print("Enter studentID : ");
                studentID = sc.nextLine();
            }
        }

        System.out.print("Enter Scores for Mathematics : ");
        mathematics = sc.nextLine();
        while (!(mathematics.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
            System.out.println("Enter Scores for Mathematics must be between 0.0 to 10.0");
            System.out.print("Enter Scores for Mathematics : ");
            mathematics = sc.nextLine();
        }

        System.out.print("Enter Scores for Literature : ");
        literature = sc.nextLine();
        while (!(literature.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
            System.out.println("Enter Scores for Literatures must be between 0.0 to 10.0");
            System.out.print("Enter Scores for Literatures : ");
            literature = sc.nextLine();
        }

        System.out.print("Enter Scores for Foreign Language : ");
        foreignLanguage = sc.nextLine();
        while (!(foreignLanguage.matches("^(10(\\.0+)?|[0-9](\\.[0-9]+)?)$|^$"))) {
            System.out.println("Enter Scores for Foreign Language must be between 0.0 to 10.0");
            System.out.print("Enter Scores for Foreign Language : ");
            foreignLanguage = sc.nextLine();
        }

        chooseSubject();

        if (foreignLanguage == "") {
            foreignLanguageCode = "";
        } else {
            System.out.print("Enter Scores for Foreign Language Code: ");
            foreignLanguageCode = sc.nextLine();
            while (!(foreignLanguageCode.matches("([N][1-7])?"))) {
                System.out.println("Enter Scores for Foreign Language Code must be between N1 to N7");
                System.out.print("Enter Scores for Foreign Language Code : ");
                foreignLanguageCode = sc.nextLine();
            }
        }
        return new Exam_Score(Integer.parseInt(studentID), mathematics,
                literature, foreignLanguage, physics,
                chemistry, biology, history,
                geography, civicEducation, foreignLanguageCode);
    }
        public  void insertAndWrite(Exam_Score escore){
        if (escore==null)
        {
            System.out.println("escore is null");
            return;
        }
       else {
            scorelist.add(escore);
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
                System.out.println("**** New Exam Scores are Successfully Inserted ****");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
