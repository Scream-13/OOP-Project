package t5;

import t5.evaluative.Evaluative;

import java.util.ArrayList;

public class Course {
    public String courseName;
    public ArrayList<Evaluative> tests = new ArrayList<>();
    public int credits;

    public ArrayList<Evaluative> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Evaluative> tests) {
        this.tests = tests;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private float maxMarks;
    private float minMarks;
    private float medianMarks;

    public Course(String courseName, ArrayList<Evaluative> tests, int credits, float maxMarks, float minMarks, float medianMarks) {
        this.courseName = courseName;
        this.tests = tests;
        this.credits = credits;
        this.maxMarks = maxMarks;
        this.minMarks = minMarks;
        this.medianMarks = medianMarks;
    }

    public float getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(float maxMarks) {
        this.maxMarks = maxMarks;
    }

    public float getMinMarks() {
        return minMarks;
    }

    public void setMinMarks(float minMarks) {
        this.minMarks = minMarks;
    }

    public float getMedianMarks() {
        return medianMarks;
    }

    public void setMedianMarks(float medianMarks) {
        this.medianMarks = medianMarks;
    }
}
