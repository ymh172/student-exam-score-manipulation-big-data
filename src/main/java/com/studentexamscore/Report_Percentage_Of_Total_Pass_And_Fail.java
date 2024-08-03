package com.studentexamscore;
import java.util.LinkedList;

public class Report_Percentage_Of_Total_Pass_And_Fail {

    double mathematiscs;
    double literature;
    double foreignLanguage;
    double physics;
    double chemistry;
    double biology;
    double history;
    double geography;
    double civicEducation;
    private LinkedList<Exam_Score> scorelist;

    public Report_Percentage_Of_Total_Pass_And_Fail(LinkedList<Exam_Score> scorelist) {
        this.scorelist = scorelist;
        total();
        totalPassAndFail();
    }

    private void total()
    {
        System.out.println("\nTotal Number of Students      : " + scorelist.size()+"\n");
    }
    private void totalPassAndFail() {
        int passCount = 0;
        int failCount = 0;
        double pass_percent;
        double fail_percent;

        for (Exam_Score score : scorelist) {
            if(!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() &&
                    !score.getForeignLanguage().isEmpty() && !score.getPhysics().isEmpty() &&
                    !score.getChemistry().isEmpty() && !score.getBiology().isEmpty() )
            {
                mathematiscs  = Double.parseDouble(score.getMathematics());
                literature = Double.parseDouble(score.getLiterature());
                foreignLanguage = Double.parseDouble(score.getForeignLanguage());
                physics = Double.parseDouble(score.getPhysics());
                chemistry = Double.parseDouble(score.getChemistry());
                biology = Double.parseDouble(score.getBiology());
                if (mathematiscs >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 && physics >= 1.0 && chemistry >= 1.0 && biology >= 1.0)
                {
                    double average = (mathematiscs + literature + foreignLanguage + physics + chemistry + biology) / 6.0;
                    if (average >= 5.0)
                    {
                        passCount++;
                    } else
                    {
                        failCount++;
                    }
                }
                else
                {
                    failCount++;
                }
            }
            else if(!score.getMathematics().isEmpty() && !score.getLiterature().isEmpty() &&
                    !score.getForeignLanguage().isEmpty() && !score.getHistory().isEmpty() &&
                    !score.getGeography().isEmpty() && !score.getCivicEducation().isEmpty())
            {
                mathematiscs  = Double.parseDouble(score.getMathematics());
                literature = Double.parseDouble(score.getLiterature());
                foreignLanguage = Double.parseDouble(score.getForeignLanguage());
                history = Double.parseDouble(score.getHistory());
                geography = Double.parseDouble(score.getGeography());
                civicEducation = Double.parseDouble (score.getCivicEducation());

                if (mathematiscs >= 1.0 && literature >= 1.0 && foreignLanguage >= 1.0 && geography >= 1.0 && history >= 1.0 && civicEducation >= 1.0)
                {
                    double average = (mathematiscs + literature + foreignLanguage + history + geography + civicEducation) / 6.0;
                    if (average >= 5.0)
                    {
                        passCount++;
                    }
                    else
                    {
                        failCount++;

                    }
                }
                else
                {
                    failCount++;
                }

            }
            else
            {
                failCount++;
            }
        }
        double size=Double.parseDouble(String.valueOf(scorelist.size()));
        pass_percent=((Double.parseDouble(String.valueOf(passCount))/size)*100);
        fail_percent=((Double.parseDouble(String.valueOf(failCount))/size)*100);

        System.out.println("Total number of Pass Students : " + passCount);
        System.out.println("Pass Students Percentage      : " +pass_percent+" %\n");
        System.out.println("Total number of Fail Students : " + failCount);
        System.out.println("Fail Student Percentage       : " +fail_percent +" %\n ");
    }
}


