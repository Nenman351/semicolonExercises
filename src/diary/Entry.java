package diary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
     private String title;
    private String body;
    private LocalDateTime timeOfEntry;
    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        timeOfEntry = LocalDateTime.now();
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
                return String.format("""
                =========================
                Entry %s
                Written on %s
                Title: %s
                Body: %s
                =========================
                """, id, time, title, body);
//        return "Entry{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", body='" + body + '\'' +
//                ", timeOfEntry=" + timeOfEntry +
//                '}';
    }
}
