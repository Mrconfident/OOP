package main.java.com.scaler.accessModifiers;

class Student {
    private int id;
    String name;
    protected String gender;
    String batch;

    Student () {
        System.out.println("Default");
    }

    Student (int id, String name, String gender, String batch) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.batch = batch;
    }

    public int age;

    public void changeBatch (String newBatch) {
        batch = newBatch;
    }
    private void pauseCourse (int duration) {
        batch = null;
        System.out.println("Course Paused till `duration`");
    }
}