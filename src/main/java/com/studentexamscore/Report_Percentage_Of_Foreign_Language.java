package com.studentexamscore;

import java.util.LinkedList;
public class Report_Percentage_Of_Foreign_Language {
    double mathematics;
    double literature;
    double foreignLanguage;
    double physics;
    double chemistry;
    double biology;
    double history;
    double geography;
    double civicEducation;
    String foreignLanguageCode;
    private LinkedList<Exam_Score> scorelist;

    public Report_Percentage_Of_Foreign_Language(LinkedList<Exam_Score> scorelist) {
        this.scorelist = scorelist;
        foreignLanguagePassAndFail();
    }

    int n1PassCount = 0;
    int n1FailCount = 0;
    int n2PassCount = 0;
    int n2FailCount = 0;
    int n3PassCount = 0;
    int n3FailCount = 0;
    int n4PassCount = 0;
    int n4FailCount = 0;
    int n5PassCount = 0;
    int n5FailCount = 0;
    int n6PassCount = 0;
    int n6FailCount = 0;
    int n7PassCount = 0;
    int n7FailCount = 0;

    int failcount = 0;

    double n1_pass_percent;
    double n1_fail_percent;
    double n2_pass_percent;
    double n2_fail_percent;
    double n3_pass_percent;
    double n3_fail_percent;
    double n4_pass_percent;
    double n4_fail_percent;
    double n5_pass_percent;
    double n5_fail_percent;
    double n6_pass_percent;
    double n6_fail_percent;
    double n7_pass_percent;
    double n7_fail_percent;

    private void foreignLanguagePassAndFail() {
        for (Exam_Score score : scorelist)
        {   //Calculate Pass and Fail for Natural Sciences according to N1 to N7
            if (!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() &&
                    !score.getForeignLanguage().isEmpty() && !score.getPhysics().isEmpty() &&
                    !score.getChemistry().isEmpty() && !score.getBiology().isEmpty())
            {
                mathematics = Double.parseDouble(score.getMathematics());
                literature = Double.parseDouble(score.getLiterature());
                foreignLanguage = Double.parseDouble(score.getForeignLanguage());
                physics = Double.parseDouble(score.getPhysics());
                chemistry = Double.parseDouble(score.getChemistry());
                biology = Double.parseDouble(score.getBiology());
                foreignLanguageCode = score.getForeignLanguageCode();

                if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N1"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n1PassCount++;
                    }
                    else {
                        n1FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N2"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n2PassCount++;
                    }
                    else {
                        n2FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N3"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n3PassCount++;
                    }
                    else {
                        n3FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N4"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n4PassCount++;
                    }
                    else {
                        n4FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N5"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n5PassCount++;
                    }
                    else {
                        n5FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N6"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n6PassCount++;
                    }
                    else {
                        n6FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0 && foreignLanguageCode.matches("N7"))
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        n7PassCount++;
                    }
                    else {
                        n7FailCount++;
                    }
                }

                else
                {
                    failcount++;
                }
            }
            //Calculate Pass and Fail for Social Sciences according to N1 to N7
            else if (!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() && !score.getForeignLanguage().isEmpty() &&
                    !score.getHistory().isEmpty() && !score.getGeography().isEmpty() && !score.getCivicEducation().isEmpty())
            {
                mathematics = Double.parseDouble(score.getMathematics());
                literature = Double.parseDouble(score.getLiterature());
                foreignLanguage = Double.parseDouble(score.getForeignLanguage());
                history = Double.parseDouble(score.getHistory());
                geography = Double.parseDouble(score.getGeography());
                civicEducation = Double.parseDouble(score.getCivicEducation());
                foreignLanguageCode = score.getForeignLanguageCode();

                if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N1"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n1PassCount++;
                    }
                    else {
                        n1FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N2"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n2PassCount++;
                    }
                    else {
                        n2FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N3"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n3PassCount++;
                    }
                    else {
                        n3FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N4"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n4PassCount++;
                    }
                    else {
                        n4FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N5"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n5PassCount++;
                    }
                    else {
                        n5FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N6"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n6PassCount++;
                    }
                    else {
                        n6FailCount++;
                    }
                }

                else if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 &&
                        geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0 && foreignLanguageCode.matches("N7"))
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        n7PassCount++;
                    }
                    else {
                        n7FailCount++;
                    }
                }

                else
                {
                    failcount++;
                }
            }

            else
            {
                failcount++;
            }
        }

        int n1Size = (n1PassCount + n1FailCount);
        n1_pass_percent = ((Double.parseDouble(String.valueOf(n1PassCount)) / n1Size) * 100);
        n1_fail_percent = ((Double.parseDouble(String.valueOf(n1FailCount)) / n1Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N1 (English)                              ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N1 (English) : " + n1Size);
        System.out.println("Total number of Pass students for N1 (English)   : " + n1PassCount);
        System.out.println("Pass Student Percentage for N1 (English)         : " + n1_pass_percent + "%");
        System.out.println("Total number of Fail students for N1 (English)   : " + n1FailCount);
        System.out.println("Fail Student Percentage for N1 (English)         : " + n1_fail_percent + "%\n");

        int n2Size = (n2PassCount + n2FailCount);
        n2_pass_percent = ((Double.parseDouble(String.valueOf(n2PassCount)) / n2Size) * 100);
        n2_fail_percent = ((Double.parseDouble(String.valueOf(n2FailCount)) / n2Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N2 (Russian)                              ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N2 (Russian) : " + n2Size);
        System.out.println("Total number of Pass students for N2 (Russian)   : " + n2PassCount);
        System.out.println("Pass Student Percentage for N2 (Russian)         : " + n2_pass_percent + "%");
        System.out.println("Total number of Fail students for N2 (Russian)   : " + n2FailCount);
        System.out.println("Fail Student Percentage for N2 (Russian)         : " + n2_fail_percent + "%\n");

        int n3Size = (n3PassCount + n3FailCount);
        n3_pass_percent = ((Double.parseDouble(String.valueOf(n3PassCount)) / n3Size) * 100);
        n3_fail_percent = ((Double.parseDouble(String.valueOf(n3FailCount)) / n3Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N3 (French)                               ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N3 (French)  : " + n3Size);
        System.out.println("Total number of Pass students for N3 (French)    : " + n3PassCount);
        System.out.println("Pass Student Percentage for N3 (French)          : " + n3_pass_percent + "%");
        System.out.println("Total number of Fail students for N3 (French)    : " + n3FailCount);
        System.out.println("Fail Student Percentage for N3 (French)          : " + n3_fail_percent + "%\n");

        int n4Size = (n4PassCount + n4FailCount);
        n4_pass_percent = ((Double.parseDouble(String.valueOf(n4PassCount)) / n4Size) * 100);
        n4_fail_percent = ((Double.parseDouble(String.valueOf(n4FailCount)) / n4Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N4 (Chinese)                              ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N4 (Chinese) : " + n4Size);
        System.out.println("Total number of Pass students for N4 (Chinese)   : " + n4PassCount);
        System.out.println("Pass Student Percentage for N4 (Chinese)         : " + n4_pass_percent + "%");
        System.out.println("Total number of Fail students for N4 (Chinese)   : " + n4FailCount);
        System.out.println("Fail Student Percentage for N4 (Chinese)         : " + n4_fail_percent + "%\n");

        int n5Size = (n5PassCount + n5FailCount);
        n5_pass_percent = ((Double.parseDouble(String.valueOf(n5PassCount)) / n5Size) * 100);
        n5_fail_percent = ((Double.parseDouble(String.valueOf(n5FailCount)) / n5Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N5 (German)                               ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N5 (German) : " + n5Size);
        System.out.println("Total number of Pass students for N5 (German)   : "  + n5PassCount);
        System.out.println("Pass Student Percentage for N5 (German)         : "  + n5_pass_percent + "%");
        System.out.println("Total number of Fail students for N5 (German)   : "  + n5FailCount);
        System.out.println("Fail Student Percentage for N5 (German)         : "  + n5_fail_percent + "%\n");

        int n6Size = (n6PassCount + n6FailCount);
        n6_pass_percent = ((Double.parseDouble(String.valueOf(n6PassCount)) / n6Size) * 100);
        n6_fail_percent = ((Double.parseDouble(String.valueOf(n6FailCount)) / n6Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N6 (Japanese)                              ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N6 (Japanese) : " + n6Size);
        System.out.println("Total number of Pass students for N6 (Japanese)   : " + n6PassCount);
        System.out.println("Pass Student Percentage for N6 (Japanese)         : " + n6_pass_percent + "%");
        System.out.println("Total number of Fail students for N6 (Japanese)   : " + n6FailCount);
        System.out.println("Fail Student Percentage for N6 (Japanese)         : " + n6_fail_percent + "%\n");

        int n7Size = (n7PassCount + n7FailCount);
        n7_pass_percent = ((Double.parseDouble(String.valueOf(n7PassCount)) / n7Size) * 100);
        n7_fail_percent = ((Double.parseDouble(String.valueOf(n7FailCount)) / n7Size) * 100);
        System.out.println("======================================================================");
        System.out.println("                            N7 (Korean)                              ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students who choose N7 (Korean) : " + n7Size);
        System.out.println("Total number of Pass students for N7 (Korean)   : " + n7PassCount);
        System.out.println("Pass Student Percentage for N7 (Korean)         : " + n7_pass_percent + "%");
        System.out.println("Total number of Fail students for N7 (Korean)   : " + n7FailCount);
        System.out.println("Fail Student Percentage for N7 (Korean)         : " + n7_fail_percent + "%\n");

        System.out.println("======================================================================================");
        System.out.println("                                Other Failed Students                                 ");
        System.out.println("======================================================================================");
        System.out.println("Other failed students who do not taken any of Foreign Languages : " + failcount + "\n");
    }
}

