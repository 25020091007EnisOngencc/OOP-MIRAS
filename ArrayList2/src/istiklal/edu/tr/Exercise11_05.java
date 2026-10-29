package istiklal.edu.tr;

import java.util.ArrayList;

class Course {
 private String courseName;
 private ArrayList<String> students;

 public Course(String courseName) {
     this.courseName = courseName;
     this.students = new ArrayList<String>();
 }

 public void addStudent(String student) {
     students.add(student);
 }

 public String[] getStudents() {
     return students.toArray(new String[0]);
 }

 public int getNumberOfStudents() {
     return students.size();
 }

 public String getCourseName() {
     return courseName;
 }

 public void dropStudent(String student) {
     students.remove(student);
 }

 public void clear() {
     students.clear();
 }
}

public class Exercise11_05 {
 public static void main(String[] args) {
     Course course1 = new Course("Veri Yapıları");
     Course course2 = new Course("Nesne Yönelimli Programlama");

     course1.addStudent("Enis");
     course1.addStudent("Ahmet");
     course1.addStudent("Mehmet");

     course2.addStudent("Enis");
     course2.addStudent("Ayşe");

     System.out.println("--- " + course1.getCourseName() + " Dersindeki Öğrenci Sayısı: " + course1.getNumberOfStudents());
     String[] students1 = course1.getStudents();
     for (int i = 0; i < course1.getNumberOfStudents(); i++) {
         System.out.print(students1[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : ""));
     }
     System.out.println();

     course1.dropStudent("Ahmet");

     System.out.println("\n'Ahmet' silindikten sonraki öğrenci sayısı: " + course1.getNumberOfStudents());
     students1 = course1.getStudents();
     for (int i = 0; i < course1.getNumberOfStudents(); i++) {
         System.out.print(students1[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : ""));
     }
     System.out.println();
 }
}