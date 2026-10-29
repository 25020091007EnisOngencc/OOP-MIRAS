package istiklal.edu.tr;

public class TestExercise11_02 {
    public static void main(String[] args) {
        Person person = new Person("Ahmet Yılmaz", "İstanbul", "05551112233", "ahmet@mail.com");
        Student student = new Student("Ayşe Kaya", "Ankara", "05552223344", "ayse@mail.com", Student.FRESHMAN);
        Employee employee = new Employee("Mehmet Demir", "İzmir", "05553334455", "mehmet@mail.com", "A-101", 45000);
        Faculty faculty = new Faculty("Dr. Ali Öztürk", "Bursa", "05554445566", "ali@mail.com", "B-202", 65000, "09:00 - 12:00", "Prof. Dr.");
        Staff staff = new Staff("Zeynep Şahin", "Antalya", "05555556677", "zeynep@mail.com", "C-303", 38000, "Idari İşler Uzmanı");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}