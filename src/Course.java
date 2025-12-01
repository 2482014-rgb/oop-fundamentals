public class Course {

    private String courseCode;
    private String courseName;
    private int credits;
    private String lecturer;

    private static int totalCourses = 0;

    public Course(String courseCode, String courseName, int credits, String lecturer) {
        setCourseCode(courseCode);
        setCourseName(courseName);
        setCredits(credits);
        this.lecturer = lecturer;

        totalCourses++;
    }

    public void displayCourseInfo() {
        System.out.println("=== REGISTRASI MATA KULIAH ===");
        System.out.println("Code    : " + courseCode);
        System.out.println("Name    : " + courseName);
        System.out.println("Credits : " + credits);
        System.out.println("Lecturer: " + lecturer + "\n");
    }

    public boolean isHeavyCourse() {
        return credits >= 3;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    // ===== GETTERS & SETTERS =====
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            System.out.println(" courseCode tidak boleh kosong");
            return;
        }
        this.courseCode = courseCode.toUpperCase();
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            System.out.println(" courseName tidak boleh kosong");
            return;
        }
        this.courseName = courseName;
    }

    public int getCredits() { return credits; }
    public void setCredits(int credits) {
        if (credits < 1 || credits > 4) {
            System.out.println(" credits harus 1-4");
            return;
        }
        this.credits = credits;
    }

    public String getLecturer() { return lecturer; }
    public void setLecturer(String lecturer) { this.lecturer = lecturer; }
}
