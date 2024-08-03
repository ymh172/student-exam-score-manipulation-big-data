package com.studentexamscore;

public class Exam_Score {
    private int studentID;
    private String mathematics;
    private String literature;
    private String foreignLanguage;
    private String physics;
    private String chemistry;
    private String biology;
    private String history;
    private String geography;
    private String civicEducation;
    private String foreignLanguageCode;

    public Exam_Score(int studentID, String mathematics, String literature, String foreignLanguage, String physics, String chemistry, String biology, String history, String geography, String civicEducation, String foreignLanguageCode) {
        this.studentID = studentID;
        this.mathematics = mathematics;
        this.literature = literature;
        this.foreignLanguage = foreignLanguage;
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
        this.history = history;
        this.geography = geography;
        this.civicEducation = civicEducation;
        this.foreignLanguageCode = foreignLanguageCode;
    }

    public Exam_Score(int studentID, String mathematics, String literature, String foreignLanguage) {
        this.studentID = studentID;
        this.mathematics = mathematics;
        this.literature = literature;
        this.foreignLanguage = foreignLanguage;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getMathematics() {
        return mathematics;
    }

    public void setMathematics(String mathematics) {
        this.mathematics = mathematics;
    }

    public String getLiterature() {
        return literature;
    }

    public void setLiterature(String literature) {
        this.literature = literature;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public String getPhysics() {
        return physics;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getBiology() {
        return biology;
    }

    public void setBiology(String biology) {
        this.biology = biology;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getGeography() {
        return geography;
    }

    public void setGeography(String geography) {
        this.geography = geography;
    }

    public String getCivicEducation() {
        return civicEducation;
    }

    public void setCivicEducation(String civicEducation) {
        this.civicEducation = civicEducation;
    }

    public String getForeignLanguageCode() {
        return foreignLanguageCode;
    }

    public void setForeignLanguageCode(String foreignLanguageCode) {
        this.foreignLanguageCode = foreignLanguageCode;
    }
}
