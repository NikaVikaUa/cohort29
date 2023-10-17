package repositories;

import model.Lesson;
import model.User;

import java.io.*;
import java.util.List;

public class LessonRepositoryFileImpl implements LessonRepository{
    private String fileName;
    private Long currentId=1L;


    public LessonRepositoryFileImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(Lesson lesson) {
        lesson.setId(currentId++);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true));) {
            String line = lesson.getId() +"," + lesson.getNumber() + "," + lesson.getSubject()+"," + lesson.getTopic();
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении пользователей в файл.");
            e.printStackTrace();
        }

    }

    @Override
    public List<Lesson> findAll() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            return reader.lines() //1,2,Java,Collection
                    .map(l->l.split(","))  //["1","2","Java","Collection"]
                    .map(lessonArr -> new Lesson(Long.parseLong(lessonArr[0]), Integer.parseInt(lessonArr[1]), lessonArr[2],lessonArr[3]))
                    .toList();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Lesson findById(Long id) {
        return null;
    }

    @Override
    public void update(Lesson element) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
