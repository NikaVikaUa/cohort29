package services;

import model.Lesson;

import java.util.List;

public interface LessonService {
    void createLesson(int number, String subject, String topic);
    public List<Lesson> getAllLessons();
    Lesson getLessonByNumberAndSubject(int number, String subject);
}
