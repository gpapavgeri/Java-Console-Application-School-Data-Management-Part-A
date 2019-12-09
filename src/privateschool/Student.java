
package privateschool;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Georgia_Papavgeri
 */
public class Student {

    private String stFirstName;
    private String stLastName;
    private LocalDate stDateOfBirth;
    private double stTuitionFees;
    private List<Course> courses;

    public Student(String stFirstName, String stLastName, LocalDate stDateOfBirth, double stTuitionFees) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stDateOfBirth = stDateOfBirth;
        this.stTuitionFees = stTuitionFees;
    }

    public String getStFirstName() {
        return stFirstName;
    }

    public void setStFirstName(String stFirstName) {
        this.stFirstName = stFirstName;
    }

    public String getStLastName() {
        return stLastName;
    }

    public void setStLastName(String stLastName) {
        this.stLastName = stLastName;
    }

    public LocalDate getStDateOfBirth() {
        return stDateOfBirth;
    }

    public void setStDateOfBirth(LocalDate stDateOfBirth) {
        this.stDateOfBirth = stDateOfBirth;
    }

    public double getStTuitionFees() {
        return stTuitionFees;
    }

    public void setStTuitionFees(double stTuitionFees) {
        this.stTuitionFees = stTuitionFees;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student's Name: " + stFirstName + " " + stLastName + " / Date of birth: " + stDateOfBirth + " / Tuition fees: " + stTuitionFees + "}\n";
    }

    
}
