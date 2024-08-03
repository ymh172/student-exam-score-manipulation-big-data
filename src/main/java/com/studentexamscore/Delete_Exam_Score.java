package com.studentexamscore;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Delete_Exam_Score {
    private LinkedList<Exam_Score> scorelist;

    public Delete_Exam_Score(LinkedList<Exam_Score> scorelist)
    {
        this.scorelist = scorelist;
        //delete();
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

    public void delete()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter StudentID to delete : ");
        String deletestudentID = sc.nextLine();

        while (!((deletestudentID.matches("[0-9]{7}"))||(deletestudentID.matches("[0-9]{8}"))))
        {
            System.out.println("Enter studentID is only in 8 digits.");
            System.out.print("Enter studentID to delete : ");
            deletestudentID = sc.nextLine();
        }

        int index = find_StudentID(deletestudentID);

        while (index == -1)
        {
            System.out.println("Student ID not Found to Delete.");
            System.out.print("Enter Again StudentID to delete : ");
            deletestudentID = sc.nextLine();

            while (!((deletestudentID.matches("[0-9]{7}"))||(deletestudentID.matches("[0-9]{8}"))))
            {
                System.out.println("Enter studentID is only in 7 or 8 digits.");
                System.out.print("Enter studentID to delete : ");
                deletestudentID = sc.nextLine();
            }

            index = find_StudentID(deletestudentID);
        }

        System.out.println("Student ID Found to Delete. ");
        System.out.print("Are you Sure to Delete? (Y or N) : ");
        String answer = sc.nextLine();
        while (!answer.matches("[Y|N]"))
        {
            System.out.println("Enter only in Y or N.");
            System.out.print("Enter Answer : ");
            answer = sc.nextLine();
        }
        if (answer.contentEquals("Y"))
        {
            scorelist.remove(index);
            LinkedList<Exam_Score> templist = new LinkedList<>();
            for (Exam_Score s : scorelist)
            {
                if (s.getStudentID() == Integer.parseInt(deletestudentID))
                {
                    templist.add(s);
                }
            }

            scorelist.removeAll(templist);
            deleteAndWrite();
        }
        else if (answer.contentEquals("N"))
        {
            delete();
        }
    }
    public void deleteAndWrite(){
        if(scorelist == null){
            System.out.println("There is no data to delete.");
            return;
        }
        else{
            try {
                CSVWriter cw = new CSVWriter(new FileWriter("data/scores.csv", false));
                cw.writeNext(new String[]{"studentID", "Mathematics", "Literature", "foreignLanguage",
                        "Physics", "Chemistry", "Biology",
                        "History", "Geography", "civicEducation", "foreignLanguageCode"});
                for (Exam_Score s : scorelist)
                {
                    cw.writeNext(new String[]{String.valueOf(s.getStudentID()), s.getMathematics(),
                            s.getLiterature(), s.getForeignLanguage(), s.getPhysics(), s.getChemistry(), s.getBiology(),
                            s.getHistory(), s.getGeography(), s.getCivicEducation(), s.getForeignLanguageCode()});
                }
                cw.close();
                System.out.println("**** Exam Scores are Successfully Deleted ****");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
