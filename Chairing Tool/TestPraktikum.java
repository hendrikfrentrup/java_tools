/*
 * DATEI: Praktikum.java
 */
import java.util.ArrayList;

 class Praktikum {

    String name;

    ArrayList<Student> studenten; // ArrayList nur fuer Studenten

    Praktikum(String aName) {
        this.name = aName;
        this.studenten = new ArrayList<Student>();
    }

    void addStudent(Student aStudent) {
        studenten.add(aStudent);
    }

    //TODO: removeStudent - 
    // durch die studenten gehen und nach z.B. dem Namen suchen,
    // etc.... ;) 

    double getAverageGrade() {
        double average = 0; // initialisieren des Durchschnitts
        int numberOfStudents = studenten.size();

        if (numberOfStudents > 0) { // vermeiden der Division duch 0
            for (int position = 0; position < numberOfStudents; position++) {
                Student current = studenten.get(position);
                average += current.grade;
            }
            average = average / numberOfStudents;
        }
        return average;
    }

    public String toString(){
        int numberOfStudents = this.studenten.size();
        String result= this.name+": \n";
        result +=      "Teilnehmer       : "+numberOfStudents +"\n";
        result +=      "Durchschnittsnote: "+this.getAverageGrade()+"\n";
        
        for (int position = 0; position < numberOfStudents; position++) {
            Student current = studenten.get(position);
            result += "   "+position+".: "+current.name+" ("+current.grade+") \n";
        }
        
        return result;
    }
    
}


/*
 * DATEI: Student.java
 */

public class Student {
    
    double grade;
    String name;
    
    Student(String aName,double aGrade){
        this.grade=aGrade;
        this.name=aName;
    }
    
}


/*
 * DATEI: TestPraktikum.java
 */
public class TestPraktikum {

    public static void main(String[] args) {

          Praktikum unixPraktikum = new Praktikum("UNIX-Praktikum");
          
          Student florian = new Student("Florian",1.0);
          Student maximilian = new Student("Maximilian",2.8);

          unixPraktikum.addStudent(florian);
          unixPraktikum.addStudent(maximilian);
          
          System.out.println(unixPraktikum);
          
    }

}
