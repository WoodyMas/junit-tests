import java.util.ArrayList;

public class Student {
    //id should be a long number used to represent a "unique user" in our application.
    //name is a String that holds the name of the student.
    //grades is an ArrayList that contains a list of Integer numbers.

    private long id;
    private String name;
    private ArrayList<Long> grades;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(ArrayList<Long> grades) {
        this.grades = grades;
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(long grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Long> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for (int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return (double) total / grades.size();
    }

    public Student(){}

    public Student(String name, long id){

    }

    public Student(String name, long id, ArrayList<Long> grades){
        this.name = name;
        this.id = id;
        this.grades = grades;
    }
}
