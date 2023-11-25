package main.java.com.scaler.polymorphism;

public class Client {
    public static void main(String[] args) {
        User u = new Student();
        u.changePassword("newPass");
    }
}
