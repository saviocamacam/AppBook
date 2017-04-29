package cliente;

public class Compromise {
    private String date;
    private String hour;
    private String subject;
    private String description;
    private String notification;
    
    public Compromise(String date, String hour, String subject, String description, String notification) {
        this.date = date;
        this.hour = hour;
        this.subject = subject;
        this.description = description;
        this.notification = notification;
    }

    public String getHour() {
        return hour;
    }

    public String getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public String getNotification() {
        return notification;
    }
}
