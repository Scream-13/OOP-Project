package t5;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Score {
    private SimpleStringProperty courseName;
    private SimpleFloatProperty q1Marks;
    private SimpleFloatProperty  q2Marks;
    private SimpleFloatProperty  ass1Marks;
    private SimpleFloatProperty  midsemMarks;
    private SimpleFloatProperty  compreMarks;

    public Score(String courseName, float q1Marks, float q2Marks, float ass1Marks, float midsemMarks, float compreMarks) {
        this.courseName = new SimpleStringProperty(courseName);
        this.q1Marks = new SimpleFloatProperty(q1Marks);
        this.q2Marks = new SimpleFloatProperty(q2Marks);
        this.ass1Marks = new SimpleFloatProperty(ass1Marks);
        this.midsemMarks = new SimpleFloatProperty(midsemMarks);
        this.compreMarks = new SimpleFloatProperty(compreMarks);
    }

    public String getCourseName() {
        return courseName.get();
    }

    public float getQ1Marks() {
        return q1Marks.get();
    }

    public float getQ2Marks() {
        return q2Marks.get();
    }

    public float getAss1Marks() {
        return ass1Marks.get();
    }

    public float getMidsemMarks() {
        return midsemMarks.get();
    }

    public float getCompreMarks() {
        return compreMarks.get();
    }

}
