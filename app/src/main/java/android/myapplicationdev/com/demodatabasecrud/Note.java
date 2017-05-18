package android.myapplicationdev.com.demodatabasecrud;

import java.io.Serializable;

/**
 * Created by ivanlipotan on 5/18/17.
 */

public class Note implements Serializable{
    private int id;
    private String noteContent;

    public Note(int id,String noteContent){
      this.id = id;
        this.noteContent = noteContent;
    }
    public String toString(){
        return "ID:"+id+", "+noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }
    public void setNoteContent(String noteContent){
        this.noteContent = noteContent;
    }
}
