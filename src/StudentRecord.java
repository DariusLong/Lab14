import java.util.ArrayList;

public class StudentRecord {

        private ArrayList<Student> studentArrayList = new ArrayList<>();

        // Constructor
        //default constructor : public Pokedex(){} -- DO NOT NEED TO PLACE THIS

        // Methods

        // Using the Built-in .add() method from arrayList to
        // add the pokemon into the arrayList
        public void addStudent(Student student) {
        studentArrayList.add(student);
    }

        // Using the Built-in .remove() method from arrayList to
        // remove the pokemon out of the arrayList
        public void removeStudent(Student student) {
        studentArrayList.remove(student);
    }

        // Returning the ArrayList of pokemons
        public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

        // Searches the pokemonArrayList for the Pokemon object
        // which matches the name and returns it.
        // if no match pokemon is found it returns null.
        // This method is for getting the specific pokemon details from the Pokedex.
     /*   public Student getStudent(String name) {
        Student foundStudent = null;
        for (Student student : studentArrayList) {
            if (student.getName().equals(name)) {
                foundStudent = student;
                break;
            }
        }
        return foundStudent;
    }

      */

}
