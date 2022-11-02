import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

public class StudentTest {




    public static void main(String[] args) {
        Student newStudent = new Student("Mac", 15);
        newStudent.addGrade(90);
        newStudent.addGrade(85);
        newStudent.addGrade(88);

        System.out.println(newStudent.getGradeAverage());
    }
}
