import java.util.ArrayList;
import java.util.LinkedList;
public class Student {

        private String firstName;
        private String lastName;
        private int id;
        private String major;
        private String classStanding;
        private double gpa;
        private LinkedList<String> courseList = new LinkedList<>();

    public Student(String firstName, String lastName, int id, String major, String classStanding, double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;

    }
/*
        public String getName () {
        return firstName;
    }*/

        /*public double getGPA () {
        return gpa;
    }*/
       /* public LinkedList<Course> getCourseArrayList () {
        return courseList;
    }*/

    public void addCourse (String course){
        courseList.add(course);
    }
    public void removeCourse (String course){
        courseList.add(course);
    }
    public String toString () {
        return String.format("First Name: %s\nLast Name: %s\nID: %d\nMajor: %s\nClass Standing: %s\nGPA: %.2f\n", firstName, lastName, id, major, classStanding, gpa);
    }
    public StringBuilder getAllCourses(){
        StringBuilder courseStringBuilder = new StringBuilder();
        for(String course: courseList){
            courseStringBuilder.append(course + "\n");
        }
        return courseStringBuilder;
    }



    public void sortCourseList(){
        String temp;
        for (int i = 1; i < courseList.size(); i++) {
            for (int j = i; j > 0; j--) {
            if (courseList.get(j).compareTo(courseList.get(j - 1)) < 0){
                temp = courseList.get(j);
                courseList.set(j, courseList.get(j - 1));
                courseList.set(j - 1, temp);
            }
            }
        }
    }

        //one form of polymorphis


}


