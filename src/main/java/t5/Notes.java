package t5;

import java.util.ArrayList;
import java.util.List;


public class Notes {
    private String title;
    private String description;
    private static List<Notes> NotesList=new ArrayList<>();

    public Notes(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
        
    public static void addNote(Notes note) {
    	NotesList.add(note);
    }
    
    public static List<Notes> getLiist() {
    	System.out.println(NotesList);
    	return NotesList;
    }
}
