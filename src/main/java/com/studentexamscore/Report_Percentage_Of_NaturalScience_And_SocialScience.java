package com.studentexamscore;
import java.util.LinkedList;
public class Report_Percentage_Of_NaturalScience_And_SocialScience {
    double mathematics;
    double literature;
    double foreignLanguage;
    double physics;
    double chemistry;
    double biology;
    double history;
    double geography;
    double civicEducation;
    private LinkedList<Exam_Score> scorelist;

    public Report_Percentage_Of_NaturalScience_And_SocialScience(LinkedList<Exam_Score> scorelist) {
        this.scorelist = scorelist;
        naturalTotalPassAndFail();
        socialTotalPassAndFail();
        otherFailed();
    }
    int naturalPassCount = 0;
    int naturalFailCount = 0;
    int socialPassCount = 0;
    int socialFailCount = 0;
    int failcount = 0;
    double natural_pass_percent;
    double natural_fail_percent;
    double social_pass_percent;
    double social_fail_percent;

    private void naturalTotalPassAndFail() {
        for (Exam_Score score : scorelist)
        {
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

                if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 && physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0)
                {
                    double average = (mathematics + literature + foreignLanguage + physics + chemistry + biology) / 6.0;

                    if (average >= 5.0) {
                        naturalPassCount++;
                    }
                    else {
                        naturalFailCount++;
                    }
                }
                else {
                    naturalFailCount++;
                }
            }
        }
        int Naturalsize = (naturalPassCount + naturalFailCount);
        natural_pass_percent = ((Double.parseDouble(String.valueOf(naturalPassCount)) / Naturalsize) * 100);
        natural_fail_percent = ((Double.parseDouble(String.valueOf(naturalFailCount)) / Naturalsize) * 100);
        System.out.println("======================================================================");
        System.out.println("                             Natural Sciences                         ");
        System.out.println("======================================================================");
        System.out.println("Total Number of Students for Natural Sciences      : " + Naturalsize);
        System.out.println("Total number of Pass students for Natural Sciences : " + naturalPassCount);
        System.out.println("Pass Student Percentage for Natural Sciences       : " + natural_pass_percent + "%");
        System.out.println("Total number of Fail students for Natural Sciences : " + naturalFailCount);
        System.out.println("Fail Student Percentage for Natural Sciences       : " + natural_fail_percent + "%\n");
    }

    private void socialTotalPassAndFail() {
        for (Exam_Score score : scorelist)
        {
            if (!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() && !score.getForeignLanguage().isEmpty() &&
                    !score.getHistory().isEmpty() && !score.getGeography().isEmpty() && !score.getCivicEducation().isEmpty())
            {
                mathematics = Double.parseDouble(score.getMathematics());
                literature = Double.parseDouble(score.getLiterature());
                foreignLanguage = Double.parseDouble(score.getForeignLanguage());
                history = Double.parseDouble(score.getHistory());
                geography = Double.parseDouble(score.getGeography());
                civicEducation = Double.parseDouble(score.getCivicEducation());

                if (mathematics >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 && geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0)
                {
                    double average = (mathematics + literature + foreignLanguage + history + geography + civicEducation) / 6.0;

                    if (average >= 5.0) {
                        socialPassCount++;
                    }
                    else {
                        socialFailCount++;
                    }
                }
                else {
                    socialFailCount++;
                }
            }
        }

        int Socialsize = (socialPassCount + socialFailCount);
        social_pass_percent = ((Double.parseDouble(String.valueOf(socialPassCount)) / Socialsize) * 100);
        social_fail_percent = ((Double.parseDouble(String.valueOf(socialFailCount)) / Socialsize) * 100);
        System.out.println("========================================================================");
        System.out.println("                             Social Sciences                            ");
        System.out.println("========================================================================");
        System.out.println("Total Number of Students for Social Sciences      : " + Socialsize);
        System.out.println("Total number of Pass students for Social Sciences : " + socialPassCount);
        System.out.println("Pass Student Percentage for Social Sciences       :" + social_pass_percent + "%");
        System.out.println("Total number of Fail students for Social Sciences : " + socialFailCount);
        System.out.println("Fail Student Percentage for Social Sciences       :" + social_fail_percent + "%\n");
    }

    private void otherFailed() {
        for (Exam_Score score : scorelist)
        {
            if (!(!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() &&
                    !score.getForeignLanguage().isEmpty() && !score.getPhysics().isEmpty() &&
                    !score.getChemistry().isEmpty() && !score.getBiology().isEmpty())&&
                    (!(!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() &&
                            !score.getForeignLanguage().isEmpty() && !score.getHistory().isEmpty() &&
                            !score.getGeography().isEmpty() && !score.getCivicEducation().isEmpty())))
            {
                failcount++;
            }
        }
            System.out.println("=======================================================================================");
            System.out.println("                                Other Failed Students                                  ");
            System.out.println("=======================================================================================");
            System.out.println("Other Fail Students who choose neither Natural Sciences nor Social Sciences : " + failcount+"\n");
    }
}

