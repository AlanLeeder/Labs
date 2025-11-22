import java.util.Arrays;

public class Student extends Person
{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static int maxcourses = 5;

    public Student(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[maxcourses];
        grades = new int[maxcourses];
    }

    public void addCourseGrade(String course, int grade)
    {
        courses[numCourses]= course;
        grades[numCourses]= grade;
        numCourses ++;
    }

    public void printGrades(String course, int grade)
    {
        for(int i = 0; i < courses.length -1 ; i ++)
        {
            System.out.println("Courses " + courses[i]);
            System.out.println("Grades " + grades[i]);
        }
    }

    public double getAverageGrade()
    {
        int average = 0;
        for(int grade: grades)
        {
            average = average + grade;
        }
        return average/numCourses;
    }

    public String toString()
    {
        return "Student number of courses: " + numCourses + " " + Arrays.toString(courses) + " grades " + Arrays.toString(grades); 
    }




}
