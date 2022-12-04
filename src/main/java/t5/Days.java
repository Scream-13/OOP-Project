package t5;

import javafx.beans.property.SimpleIntegerProperty;
import  javafx.beans.property.SimpleStringProperty;

public class Days {
    private final SimpleStringProperty timeSlot;
    private final SimpleStringProperty monday;
    private final SimpleStringProperty tuesday;
    private final SimpleStringProperty wednesday;
    private final SimpleStringProperty thursday;
    private final SimpleStringProperty friday;
    private final SimpleStringProperty saturday;

    public Days(String timeSlot,String monday,String tuesday,String wednesday,String thursday,String friday,String saturday) {
        super();
        this.timeSlot = new SimpleStringProperty(timeSlot);
        this.monday = new SimpleStringProperty(monday);
        this.tuesday = new SimpleStringProperty(tuesday);
        this.wednesday = new SimpleStringProperty(wednesday);
        this.thursday = new SimpleStringProperty(thursday);
        this.friday = new SimpleStringProperty(friday);
        this.saturday =new SimpleStringProperty(saturday);
    }

    public String getTimeSlot() {
        return timeSlot.get();
    }

    public String getMonday() {
        return monday.get();
    }

    public String getTuesday() {
        return tuesday.get();
    }

    public String getWednesday() {
        return wednesday.get();
    }

    public String getThursday() {
        return thursday.get();
    }

    public String getFriday() {
        return friday.get();
    }

    public String getSaturday() {
        return saturday.get();
    }
}
