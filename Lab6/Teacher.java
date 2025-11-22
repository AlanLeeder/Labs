import java.util.Arrays;

public class Teacher extends Person
{
    private int numCourses;
    private String[] courses;
    public static final int maxcourses = 10;

    public Teacher(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[maxcourses];
    }

    public boolean addCourse(String course)
    {
        for(int i  = 0; i < numCourses; i ++)
        {
            if(courses[i].equals(course))
            {
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course)
    {
        int courseIndex = numCourses;
        for(int i = 0; i < numCourses; i ++)
        {
            if(courses[i].equals(course))
            {
                courseIndex = i;
                break;
            }
        }
        if(courseIndex == numCourses)
        {
            return false;
        }

        else
        {
            for(int i = courseIndex; i <numCourses; i ++)
            {
                courses[i] = courses[i + 1];
                return true;
            }
            numCourses--;
            return true;
        }
    }

    @Override
    public String toString()
    {
        return "Teacher's numCourses" + numCourses + ", courses " + Arrays.toString(courses);
    }
}
