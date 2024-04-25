public class Main {
    public static void main(String[] args) {


    Student student = new Student("Darius", "Long", 1234, "Computer Science", "Freshman", 3.5);

    //student.addCourse();

    System.out.println("Student  Info: ");
    System.out.println(student);

    student.addCourse("Math 181");
    student.addCourse("English 104");
    student.addCourse("CS 121");
    System.out.println("Unsorted Course List:\n" + student.getAllCourses());

    student.sortCourseList();
    System.out.println("Sorted Course List:\n" + student.getAllCourses());

    student.removeCourse("English 104");
    System.out.println("Removed Class: " + student.getAllCourses());









    }
}
