package main.java.com.scaler.accessModifiers;

import main.java.com.scaler.accessModifiers.Student;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        Student s1 = new Student(1, "Tarun", "Male", "C1");
        st.age = 25;
        st.gender = "Male";
        st.name = "Tarun";
        System.out.println(st.age);
        System.out.println(s1.name);
    }
}
