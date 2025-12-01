public class Student {


    private String studentId;
    private String name;
    private String major;
    private int enrollmentYear;
    private double gpa;

    private static int totalStudents = 0;

    public Student() {
        totalStudents++;
        this.studentId = String.format("STD%03d", totalStudents);
        this.name = "Unknown";
        this.major = "Unknown";
        this.enrollmentYear = 2020;
        this.gpa = 0.0;
    }

    //Constructors
    public Student(String name, String major, int enrollmentYear) {
        totalStudents++;
        this.studentId = String.format("STD%03d", totalStudents);

        setName(name);
        setMajor(major);
        setEnrollmentYear(enrollmentYear);
        this.gpa = 0.0;
    }

    // METHODS
    public void displayInfo() {
        System.out.println("=== REGISTRASI MAHASISWA ===");
        System.out.println("ID        : " + studentId);
        System.out.println("Name      : " + name);
        System.out.println("Major     : " + major);
        System.out.println("Enrolled  : " + enrollmentYear);
        System.out.println("GPA       : " + gpa);
        System.out.println("Status    : " + getStudentStatus());
        System.out.println("Duration  : " + getStudyDuration() + " years\n");
    }

    public void updateGPA(double newGPA) {
        if (newGPA < 0.0 || newGPA > 4.0) {
            System.out.println(" GPA harus 0.0 - 4.0");
            return;
        }
        this.gpa = newGPA;
    }

    public String getStudentStatus() {
        if (gpa >= 3.5) return "Cumlaude";
        else if (gpa >= 3.0) return "Sangat Memuaskan";
        else if (gpa >= 2.5) return "Memuaskan";
        else return "Perlu Peningkatan";
    }

    public int getStudyDuration() {
        int currentYear = 2025;
        return currentYear - enrollmentYear;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    //GETTERS dan SETTERS
    public String getStudentId() { return studentId; }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("  MAHASISWA");
            return;
        }
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        if (major == null || major.trim().isEmpty()) {
            System.out.println(" MATA KULIAH");
            return;
        }
        this.major = major;
    }

    public int getEnrollmentYear() {
        return enrollmentYear; }
    public void setEnrollmentYear(int enrollmentYear) {
        if (enrollmentYear < 2015 || enrollmentYear > 2025) {
            System.out.println("EnrollmentYear");
            return;
        }
        this.enrollmentYear = enrollmentYear;
    }

    public double getGpa() {
        return gpa;
    }
}




