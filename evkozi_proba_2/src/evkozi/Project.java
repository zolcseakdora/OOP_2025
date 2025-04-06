package evkozi;

public class Project {
    private final String projectTitle;
    private final String studentName;
    private final int grade;

    public Project(String projectTitle, String studentName, int grade) {
        this.projectTitle = projectTitle;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return  studentName + ':' + projectTitle + ' ' + "("+ grade +")";
    }
}
