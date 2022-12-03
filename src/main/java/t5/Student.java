package t5;

import t5.evaluative.Evaluative;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Student {
    private float expectedSgpa;
    private float cgpa;
    private float expectedCgpa;

    private LinkedHashMap<Course, LinkedHashMap<Evaluative, Float>> marksObtained = new LinkedHashMap<>();
    private ArrayList<Course> coursesEnrolled = new ArrayList<>();
    private int creditsTaken;
    private int creditsThisSem = 0;

    public Student() {
    }

    public Student(float cgpa, LinkedHashMap<Course, LinkedHashMap<Evaluative, Float>> marksObtained, int creditsTaken) {
        this.cgpa = cgpa;
        this.marksObtained = marksObtained;
        this.creditsTaken = creditsTaken;
    }


    public LinkedHashMap<Course, LinkedHashMap<Evaluative, Float>> getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(LinkedHashMap<Course, LinkedHashMap<Evaluative, Float>> marksObtained) {
        this.marksObtained = marksObtained;
    }

    public float getExpectedSgpa() {
        return expectedSgpa;
    }

    public void setExpectedSgpa(float expectedSgpa) {
        this.expectedSgpa = expectedSgpa;
    }

    public float getExpectedCgpa() {
        return expectedCgpa;
    }

    public void setExpectedCgpa(float expectedCgpa) {
        this.expectedCgpa = expectedCgpa;
    }

    public int getCreditsThisSem() {
        return creditsThisSem;
    }

    public void setCreditsThisSem(int creditsThisSem) {
        this.creditsThisSem = creditsThisSem;
    }

    public float getCgpa() {
        return cgpa;
    }

    public ArrayList<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public int getCreditsTaken() {
        return creditsTaken;
    }

    public void setCreditsTaken(int creditsTaken) {
        this.creditsTaken = creditsTaken;
    }

    public void setCoursesEnrolled(ArrayList<Course> coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public void calcExpCgpa(){
        float expCgpa =(cgpa*creditsTaken + expectedSgpa*creditsThisSem)/(creditsTaken+creditsThisSem);
        this.setExpectedCgpa(expCgpa);
    }
    public void calcExpSgpa(){
        float expSgpa = 0;
        Set<Map.Entry<Course, LinkedHashMap<Evaluative, Float>>> marksObtained_forreal = marksObtained.entrySet();
        for(Map.Entry<Course, LinkedHashMap<Evaluative, Float>> me : marksObtained_forreal){
            Course c = me.getKey();
            float totalMarks = 0;
            LinkedHashMap<Evaluative, Float> lhm = me.getValue();
            ArrayList<Float> al = new ArrayList<>(lhm.values());
            for(float fl : al){
                totalMarks += fl;
            }
            int courseGrade;
            float e10 = c.getMaxMarks();
            float e6 = c.getMedianMarks();
            float d1 = (e10-e6)/4;
            float e9 = e10 -d1;
            float e8 = e10 - 2*d1;
            float e7 = e10 - 3*d1;
            float e1 = c.getMinMarks();
            float d2 = (e6-e1)/5;
            float e2 = e1+d2;
            float e3 = e1+2*d2;
            float e4 = e1+3*d2;
            float e5 = e1+4*d2;
            if (totalMarks <= e10 && totalMarks >= e9)
            {
                courseGrade = 10;
            }
            else if (totalMarks <= e9 && totalMarks >= e8)
            {
                courseGrade = 9;
            }
            else if (totalMarks <= e8 && totalMarks >= e7)
            {
                courseGrade = 8;
            }
            else if (totalMarks <= e7 && totalMarks >= e6)
            {
                courseGrade = 7;
            }
            else if (totalMarks <= e6 && totalMarks >= e5)
            {
                courseGrade = 6;
            }
            else if (totalMarks <= e5 && totalMarks >= e4)
            {
                courseGrade = 5;
            }
            else if (totalMarks <= e4 && totalMarks >= e3)
            {
                courseGrade = 4;
            }
            else if (totalMarks <= e2 && totalMarks >= e1)
            {
                courseGrade = 3;
            }
            else
            {
                courseGrade = 2;
            }
            expSgpa += c.credits*courseGrade;
        }
        expSgpa /= creditsThisSem;
        this.setExpectedSgpa(expSgpa);
    }

}
