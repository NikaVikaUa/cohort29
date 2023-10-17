package model;

public class Lesson {
    private Long id;
    private int number;
    private String subject;
    private String topic;

    public Lesson(int number, String subject, String topic) {
        this.number = number;
        this.subject = subject;
        this.topic = topic;
    }

    public Lesson(Long id, int number, String subject, String topic) {
        this.id = id;
        this.number = number;
        this.subject = subject;
        this.topic = topic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getSubject() {
        return subject;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", number=" + number +
                ", subject='" + subject + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }
}
