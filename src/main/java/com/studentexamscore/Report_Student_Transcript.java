package com.studentexamscore;
import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import java.util.LinkedList;
import java.util.Scanner;

public class Report_Student_Transcript {
    Scanner sc = new Scanner(System.in);
    String studentID = " ";
    String mathematics = " ";
    String literature = " ";
    String foreignLanguage = " ";
    String physics = " ";
    String chemistry = " ";
    String biology = " ";
    String history = " ";
    String geography = " ";
    String civicEducation = " ";
    String foreignLanguageCode = " ";
    double average = 0.0;
    double grade;
    String americanLetter = " ";
    double GPA;
    String Description = " ";

    private LinkedList<Exam_Score> scorelist;

    public Report_Student_Transcript(LinkedList<Exam_Score> scorelist) {
        this.scorelist = scorelist;
        examTranscript();
    }

    public int find_StudentID(String studentID) {
        int index = -1;
        int i = 0;

        for (Exam_Score s : scorelist) {
            if (s.getStudentID() == Integer.parseInt(studentID)) {
                index = i;
                break;
            }
            i++;
        }
        return index;
    }

    public double parseDoubleOrDefault(String input, double defaultValue) {
        if (input == null || input.trim().isEmpty()) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
    private void output() {
        System.out.println("=============================================== ");
        System.out.println("        Student's Exam Transcript Report        ");
        System.out.println("=============================================== ");
        System.out.println("Student ID             : " + studentID);
        System.out.println("Mathematics Score      : " + mathematics);
        System.out.println("Literature Score       : " + literature);
        System.out.println("Foreign Language Score : " + foreignLanguage);
        System.out.println("Physics Score          : " + physics);
        System.out.println("Chemistry Score        : " + chemistry);
        System.out.println("Biology Score          : " + biology);
        System.out.println("History Score          : " + history);
        System.out.println("Geography Score        : " + geography);
        System.out.println("CivicEducation Score   : " + civicEducation);
        System.out.println("Foreign Language Code  : " + foreignLanguageCode);
    }

    private void calculateGrading() {

        if (average >= 5.0)
        {
            if (average >= 9.0 && average < 10.0)
            {
                grade = average;
                americanLetter = "A+";
                GPA = 4.0;
                Description = "Outstanding";
            }

            else if (average >= 8.0 && average < 9.0)
            {
                grade = average;
                americanLetter = "A";
                GPA = 3.5;
                Description = "Excellent/Very Good";
            }

            else if (average >= 7.0 && average < 8.0)
            {
                grade = average;
                americanLetter = "B+";
                GPA = 3.0;
                Description = "Good";
            }

            else if (average >= 6.0 && average < 7.0)
            {
                grade = average;
                americanLetter = "B";
                GPA = 2.5;
                Description = "Average";

            }

            else if (average >= 5.0 && average < 6.0)
            {
                grade = average;
                americanLetter = "C";
                GPA = 2.0;
                Description = "Marginal";
            }

        }

        else
        {
            grade = average;
            americanLetter = "D/F";
            GPA = (average/4.9);
            Description = "Fail";
        }
    }
    private void examTranscript() {
        System.out.println("Which StudentID's Exam Transcript do you want to See? ");
        System.out.println("======================================================");
        System.out.print("Enter Student ID : ");
        studentID = sc.nextLine();

        while (!((studentID.matches("[0-9]{8}")) || (studentID.matches("[0-9]{7}"))))
        {
            System.out.println("Enter studentID is only in 7 to 8 digits.");
            System.out.print("Enter Again studentID : ");
            studentID = sc.nextLine();
        }
        int index = find_StudentID(studentID);

        while (index == -1) {
            System.out.println("Student ID not Found.");
            System.out.print("Enter Again StudentID : ");
            studentID = sc.nextLine();

            while (!((studentID.matches("[0-9]{8}")) || (studentID.matches("[0-9]{7}"))))
            {
                System.out.println("Enter studentID is only in 7 to 8 digits.");
                System.out.print("Enter studentID : ");
                studentID = sc.nextLine();
            }

            index = find_StudentID(studentID);

        }
        System.out.println("Student ID Found. ");

        LinkedList<Exam_Score> templist = new LinkedList<>();
        for (Exam_Score s : scorelist) {
            if (s.getStudentID() == Integer.parseInt(studentID)) {
                templist.add(s);
            }
        }
        for (Exam_Score score : templist) {
            if ((score.getMathematics() != null && !score.getMathematics().isEmpty()) &&
               (score.getLiterature() != null && !score.getLiterature().isEmpty()) &&
               (score.getForeignLanguage() != null && !score.getForeignLanguage().isEmpty()) &&
               (score.getPhysics() != null && !score.getPhysics().isEmpty()) &&
               (score.getChemistry() != null && !score.getChemistry().isEmpty()) &&
               (score.getBiology() != null && !score.getBiology().isEmpty()) &&
               (score.getForeignLanguageCode() != null && !score.getForeignLanguageCode().isEmpty()))
            {
                mathematics = score.getMathematics();
                literature = score.getLiterature();
                foreignLanguage = score.getForeignLanguage();
                physics = score.getPhysics();
                chemistry = score.getChemistry();
                biology = score.getBiology();
                foreignLanguageCode = score.getForeignLanguageCode();

                average = (Double.parseDouble(mathematics) + Double.parseDouble(literature) +
                        Double.parseDouble(foreignLanguage) +
                        Double.parseDouble(physics) + Double.parseDouble(chemistry) + Double.parseDouble(biology)) / 6.0;

                if (parseDoubleOrDefault(mathematics, 0.0) >= 1.0 && Double.parseDouble(literature) >= 1.0 &&
                        Double.parseDouble(foreignLanguage) >= 1.0 && Double.parseDouble(physics) >= 1.0 &&
                        Double.parseDouble(chemistry) >= 1.0 && Double.parseDouble(biology) >= 1.0 &&
                        (foreignLanguageCode.matches("[N][1-7]{1}")))
                {
                    calculateGrading();
                }
                else
                {
                    grade = average;
                    americanLetter = "D/F";
                    GPA = (average/4.9);
                    Description = "Fail";
                }
                output();
            }

            else if ((score.getMathematics() != null && !score.getMathematics().isEmpty()) &&
                    (score.getLiterature() != null && !score.getLiterature().isEmpty()) &&
                    (score.getForeignLanguage() != null && !score.getForeignLanguage().isEmpty()) &&
                    (score.getHistory() != null && !score.getHistory().isEmpty()) &&
                    (score.getGeography() != null && !score.getGeography().isEmpty()) &&
                    (score.getCivicEducation() != null && !score.getCivicEducation().isEmpty()) &&
                    (score.getForeignLanguageCode() != null && !score.getForeignLanguageCode().isEmpty()))
            {
                mathematics = score.getMathematics();
                literature = score.getLiterature();
                foreignLanguage = score.getForeignLanguage();
                history = score.getHistory();
                geography = score.getGeography();
                civicEducation = score.getCivicEducation();
                foreignLanguageCode = score.getForeignLanguageCode();

                average = (Double.parseDouble(mathematics) + Double.parseDouble(literature) +
                        Double.parseDouble(foreignLanguage) +
                        Double.parseDouble(history) + Double.parseDouble(geography) +
                        Double.parseDouble(civicEducation)) / 6.0;

                if ((!mathematics.isBlank() && Double.parseDouble(mathematics) >= 1.0) && Double.parseDouble(literature) >= 1.0 &&
                        Double.parseDouble(foreignLanguage) >= 1.0 && Double.parseDouble(geography) >= 1.0 &&
                        Double.parseDouble(history) >= 1.0 && Double.parseDouble(civicEducation) >= 1.0 &&
                        (foreignLanguageCode.matches("[N][1-7]{1}")))
                {
                    calculateGrading();
                }
                else
                {
                    grade = average;
                    americanLetter = "D/F";
                    GPA = (average/4.9);
                    Description = "Fail";
                }
                output();
            }
            else if(((score.getMathematics() != null && !score.getMathematics().isEmpty()) ||
                    (score.getLiterature() != null && !score.getLiterature().isEmpty()) ||
                    (score.getForeignLanguage() != null && !score.getForeignLanguage().isEmpty())) ||
                    ((score.getPhysics() != null && !score.getPhysics().isEmpty()) ||
                    (score.getChemistry() != null && !score.getChemistry().isEmpty()) ||
                    (score.getBiology() != null && !score.getBiology().isEmpty()) ||
                    (score.getHistory() != null && !score.getHistory().isEmpty()) ||
                    (score.getGeography() != null && !score.getGeography().isEmpty()) ||
                    (score.getCivicEducation() != null && !score.getCivicEducation().isEmpty()) ||
                    (score.getForeignLanguageCode() != null && !score.getForeignLanguageCode().isEmpty())))
            {
                mathematics = score.getMathematics();
                literature = score.getLiterature();
                foreignLanguage = score.getForeignLanguage();
                physics = score.getPhysics();
                chemistry = score.getChemistry();
                biology = score.getBiology();
                history = score.getHistory();
                geography = score.getGeography();
                civicEducation = score.getCivicEducation();
                foreignLanguageCode = score.getForeignLanguageCode();

                average = ((parseDoubleOrDefault(mathematics,0.0) + parseDoubleOrDefault(literature,0.0)+parseDoubleOrDefault(foreignLanguage,0.0))+
                        (parseDoubleOrDefault(physics,0.0) + parseDoubleOrDefault(chemistry,0.0)+parseDoubleOrDefault(biology,0.0)+
                                parseDoubleOrDefault(history,0.0) + parseDoubleOrDefault(geography,0.0)+parseDoubleOrDefault(civicEducation,0.0))) / 6.0;

                if (((parseDoubleOrDefault(mathematics,0.0) >= 1.0) && parseDoubleOrDefault(literature,0.0) >= 1.0 &&
                        parseDoubleOrDefault(foreignLanguage,0.0) >= 1.0) && (parseDoubleOrDefault(physics,0.0) >= 1.0 &&
                        parseDoubleOrDefault(chemistry,0.0) >= 1.0 && parseDoubleOrDefault(biology,0.0) >= 1.0 &&
                        parseDoubleOrDefault(history,0.0) >= 1.0 && parseDoubleOrDefault(geography,0.0) >= 1.0 &&
                        parseDoubleOrDefault(civicEducation,0.0) >= 1.0 && (foreignLanguageCode.matches("[N][1-7]{1}"))))
                {
                    calculateGrading();
                }
                else
                {
                    grade = average;
                    americanLetter = "D/F";
                    GPA = (average/4.9);
                    Description = "Fail";
                }
                output();
            }
            else
            {
                mathematics = "";
                literature = "";
                foreignLanguage = "";
                physics = "";
                chemistry = "";
                biology = "";
                history = "";
                geography = "";
                civicEducation = "";
                foreignLanguageCode = "";
                grade = average;
                americanLetter = "D/F";
                GPA = (average / 4.9);
                Description = "Fail";
                output();
            }
            AsciiTable at = new AsciiTable();
            at.addRule();
            at.addRow(new String[]{"Grading System", "American Letter Grade", "American GPA", "Description"});
            at.addRule();
            at.addRow(new Object[]{grade, americanLetter, GPA, Description});
            at.addRule();
            at.setTextAlignment(TextAlignment.CENTER);
            System.out.println(at.render());
        }
    }
}
