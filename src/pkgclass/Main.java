/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
public class Main {

    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "Ali";
        student1.age = 20;
        student1.displayInfo();
}
}