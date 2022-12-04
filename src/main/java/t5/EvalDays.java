package t5;

import javafx.beans.property.SimpleStringProperty;

public class EvalDays {
    private final SimpleStringProperty sunday;
    private final SimpleStringProperty monday;
    private final SimpleStringProperty tuesday;
    private final SimpleStringProperty wednesday;
    private final SimpleStringProperty thursday;
    private final SimpleStringProperty friday;
    private final SimpleStringProperty saturday;

    public EvalDays(String monday,String tuesday,String wednesday,String thursday,String friday,String saturday,String sunday) {
        super();

        this.monday = new SimpleStringProperty(monday);
        this.tuesday = new SimpleStringProperty(tuesday);
        this.wednesday = new SimpleStringProperty(wednesday);
        this.thursday = new SimpleStringProperty(thursday);
        this.friday = new SimpleStringProperty(friday);
        this.saturday =new SimpleStringProperty(saturday);
        this.sunday = new SimpleStringProperty(sunday);
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
    public String getSunday() {return sunday.get();}
}
