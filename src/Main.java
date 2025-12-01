public class Main {
    public static void main(String[] args) {

        System.out.println("=== STUDENT GRADE MANAGEMENT SYSTEM ===\n");

        // Create Students
        Student s1 = new Student(); // default
        Student s2 = new Student("Ela", "Informatika", 2021);
        Student s3 = new Student("Budi", "Sistem Informasi", 2019);

        s1.setName("Rahmat");
        s1.setMajor("Teknik Informatika");
        s1.setEnrollmentYear(2020);

        s2.updateGPA(3.6);
        s3.updateGPA(2.9);

        // Create Courses
        Course c1 = new Course("CS101", "Pemrograman Dasar", 3, "Dr. Hadi");
        Course c2 = new Course("CS102", "PBO Java", 4, "Dr. Lina");
        Course c3 = new Course("MTK201", "Kalkulus", 2, "Dr. Rina");
        Course c4 = new Course("DB301", "Basis Data", 3, "Dr. Arif");

        //Create Grades
        Grade g1 = new Grade(s1, c1, 88);
        Grade g2 = new Grade(s1, c2, 74);
        Grade g3 = new Grade(s2, c3, 92);
        Grade g4 = new Grade(s2, c4, 67);
        Grade g5 = new Grade(s3, c1, 58);
        Grade g6 = new Grade(s3, c4, 45);

        //Demonstrate encapsulation
        System.out.println("Student s1 Major : " + s1.getMajor());
        s1.setMajor("Teknik Elektro");
        System.out.println("Updated Major: " + s1.getMajor());

        //5. Static counters
        System.out.println("\nTotal Students: " + Student.getTotalStudents());
        System.out.println("Total Courses : " + Course.getTotalCourses());

        //6. Invalid test
        System.out.println("\n--- Testing invalid inputs ---");
        s1.setEnrollmentYear(2030); // invalid
        c1.setCredits(10); // invalid
        Grade gInvalid = new Grade(s1, c1, 150); // invalid score

        //Full Reports
        System.out.println("\n===== LIST OF STUDENTS =====");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println("\n===== LIST OF COURSES =====");
        c1.displayCourseInfo();
        c2.displayCourseInfo();
        c3.displayCourseInfo();
        c4.displayCourseInfo();

        System.out.println("\n===== LIST OF GRADES =====");
        g1.displayGrade();
        g2.displayGrade();
        g3.displayGrade();
        g4.displayGrade();
        g5.displayGrade();
        g6.displayGrade();

        // HighestGPA
        Student top = s1;
        if (s2.getGpa() > top.getGpa()) top = s2;
        if (s3.getGpa() > top.getGpa()) top = s3;

        System.out.println("Mahasiswa dengan GPA tertinggi: " + top.getName() +
                " (" + top.getGpa() + ")");
    }
}
