public class Course {
        private String courseName;
        private int courseSection;
        private String courseType;

    public Course(String mathCourse, String englishCourse, String historyCourse){
        this.courseName = mathCourse;
        this.courseSection = courseSection;
        this.courseType = courseType;
    }

        public String getCourseName(){
        return courseName;
    }

        public int getCourseSection() {
        return courseSection;
    }
        public String getcourseType() {
        return courseType;
    }

        @Override
        public String toString() {
        /*return String.format("Move: %s\n" +
                "Power: %d\n"+
                "Speed: %d\n", moveName,movePower,moveSpeed);*/

        return String.format("Course Name: %s\nCourse Section: %d\nCourse Type: %d\n", courseName, courseSection, courseType);
    }

    }

