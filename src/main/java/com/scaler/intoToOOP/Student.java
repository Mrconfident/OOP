package main.java.com.scaler.intoToOOP;

public class Student {
    private int id;
    String name;
    protected String gender;
    String batch;
    public int age;

    public void changeBatch (String newBatch) {
        batch = newBatch;
    }
    private void pauseCourse (int duration) {
        batch = null;
        System.out.println("Course Paused till `duration`");
    }
}
