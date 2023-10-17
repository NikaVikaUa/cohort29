package services;

import model.Lesson;
import repositories.LessonRepository;
import repositories.LessonRepositoryFileImpl;

import java.util.List;

public class LessonServiceImpl implements LessonService{
    private final LessonRepository repository;

    // dependency injection
    public LessonServiceImpl(LessonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createLesson(int number, String subject, String topic) {
        if(subject==null || topic==null || subject.isEmpty() || topic.isEmpty()){
            return;
        }
        if(getLessonByNumberAndSubject(number,subject)!= null){
            System.out.println("duplicate number");
            return;
        }

        Lesson lesson = new Lesson(number,subject,topic);
        repository.save(lesson);
        System.out.println("create lesson - ok");
    }

    public Lesson getLessonByNumberAndSubject(int number, String subject){
        return repository.findAll().stream()
                .filter(lesson -> lesson.getNumber()==number && lesson.getSubject().equals(subject))
                .findFirst()
                .orElse(null);
    }
    public List<Lesson> getAllLessons(){
        return repository.findAll();
    }
}
