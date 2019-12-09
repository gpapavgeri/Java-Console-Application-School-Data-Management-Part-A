
package privateschool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Georgia_Papavgeri
 */
public class Helper {
    
    // Method to create a list of random students
    public static List getRandomStudents(){
        Random rand = new Random();
        List<Student> randomStudentsList = new ArrayList<>();
        int randomIndex = rand.nextInt(PrivateSchool.students.size());
        randomStudentsList.add(PrivateSchool.students.get(randomIndex));
        if(PrivateSchool.students.size()>1) {
            int randomIndex2 = randomIndex+1;
            if(randomIndex2>=PrivateSchool.students.size())
                randomIndex2=0;
            randomStudentsList.add(PrivateSchool.students.get(randomIndex2));
        }
        return randomStudentsList;
    }
    
    // Method to create a list of random trainers
    public static List getRandomTrainers(){
        Random rand = new Random();
        List<Trainer> randomTrainersList = new ArrayList<>();
        int randomIndex = rand.nextInt(PrivateSchool.trainers.size());
        Trainer randTrainer = PrivateSchool.trainers.get(randomIndex);
        randomTrainersList.add(randTrainer);
        if(PrivateSchool.trainers.size()>1) {
            int randomIndex2 = randomIndex+1;
            if(randomIndex2>=PrivateSchool.trainers.size())
                randomIndex2=0;
            randomTrainersList.add(PrivateSchool.trainers.get(randomIndex2));
        }
        return randomTrainersList;
    }
    
    // Method to create a list of random courses
    public static List getRandomCourses(){
        Random rand = new Random();
        List<Course> randomCoursesList = new ArrayList<>();
        int randomIndex = rand.nextInt(PrivateSchool.courses.size());
        Course randCourse = PrivateSchool.courses.get(randomIndex);
        randomCoursesList.add(randCourse);
        if(PrivateSchool.courses.size()>1) {
            int randomIndex2 = randomIndex+1;
            if(randomIndex2>=PrivateSchool.courses.size())
                randomIndex2=0;
            randomCoursesList.add(PrivateSchool.courses.get(randomIndex2));
        }
        return randomCoursesList;
    }
    
    // Method to create a list of random assignments
    public static List getRandomAssignments(){
        Random rand = new Random();
        List<Assignment> randomAssignmentsList = new ArrayList<>();
        int randomIndex = rand.nextInt(PrivateSchool.assignments.size());
        Assignment randAssignment = PrivateSchool.assignments.get(randomIndex);
        randomAssignmentsList.add(randAssignment);
        if(PrivateSchool.assignments.size()>1) {
            int randomIndex2 = randomIndex+1;
            if(randomIndex2>=PrivateSchool.assignments.size())
                randomIndex2=0;
            randomAssignmentsList.add(PrivateSchool.assignments.get(randomIndex2));
        }
        return randomAssignmentsList;
    }   

}
