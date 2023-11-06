import java.util.Scanner;

class Person {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Student extends Person {
    private int[] grades;

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

class Profesor extends Person {
    private String[] courses;

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduceți datele pentru o persoană
        System.out.print("Numele persoanei: ");
        String name = scanner.nextLine();

        System.out.print("Email-ul persoanei: ");
        String email = scanner.nextLine();

        Person person = new Person();
        person.setName(name);
        person.setEmail(email);

        // Introduceți notele pentru un student
        System.out.print("Numărul de note pentru student: ");
        int numGrades = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline

        int[] grades = new int[numGrades];
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setGrades(grades);

        // Introduceți cursurile pentru un profesor
        System.out.print("Numărul de cursuri pentru profesor: ");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consumăm newline

        String[] courses = new String[numCourses];
        for (int i = 0; i < numCourses; i++) {
            System.out.print("Cursul " + (i + 1) + ": ");
            courses[i] = scanner.nextLine();
        }

        Profesor profesor = new Profesor();
        profesor.setName(name);
        profesor.setEmail(email);
        profesor.setCourses(courses);

        // Afișăm informațiile pentru toate obiectele
        System.out.println("\nInformații despre persoană:");
        System.out.println("Nume: " + person.getName());
        System.out.println("Email: " + person.getEmail());

        System.out.println("\nInformații despre student:");
        System.out.println("Nume: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        int[] studentGrades = student.getGrades();
        System.out.print("Note: ");
        for (int grade : studentGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        System.out.println("\nInformații despre profesor:");
        System.out.println("Nume: " + profesor.getName());
        System.out.println("Email: " + profesor.getEmail());
        String[] professorCourses = profesor.getCourses();
        System.out.print("Cursuri: ");
        for (String course : professorCourses) {
            System.out.print(course + " ");
        }

        scanner.close();
    }
}
