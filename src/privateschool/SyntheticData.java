
package privateschool;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Georgia_Papavgeri
 */
public class SyntheticData {
    
        // Create students
        Student st1 = new Student("Alex", "Brown", LocalDate.parse("1985-01-02"), 800);
        Student st2 = new Student("George", "Williams", LocalDate.parse("1983-07-05"), 700);
        Student st3 = new Student("John", "Johnson", LocalDate.parse("1987-09-15"), 650);
        Student st4 = new Student("Nick", "Jones", LocalDate.parse("1981-11-24"), 450.5);
        Student st5 = new Student("Sam", "Smith", LocalDate.parse("1989-05-03"), 250.6);
        Student st6 = new Student("Anna", "Moore", LocalDate.parse("1984-04-17"), 740.3);
        Student st7 = new Student("Georgia", "Cruise", LocalDate.parse("1988-10-28"), 900);
        Student st8 = new Student("Helen", "Miller", LocalDate.parse("1986-03-08"), 250);
        Student st9 = new Student("Kate", "Wilson", LocalDate.parse("1982-12-16"), 650);
        Student st10 = new Student("Maria", "Cooper", LocalDate.parse("1983-05-30"), 320);
        Student st11 = new Student("Jason", "Davis", LocalDate.parse("1990-02-15"), 1000);
        Student st12 = new Student("Chrys", "Adams", LocalDate.parse("1991-03-16"), 950);
        Student st13 = new Student("Martha", "Richardson", LocalDate.parse("1992-04-17"), 1200);
        Student st14 = new Student("Jenny", "Morgan", LocalDate.parse("1993-05-18"), 880);
        Student st15 = new Student("Tom", "Taylor", LocalDate.parse("1995-08-23"), 1150);
        
        // Create Trainers
        Trainer tr1 = new Trainer ("David", "Parker", "Hydraulic");
        Trainer tr2 = new Trainer ("Mike", "Rogers", "Transportation");
        Trainer tr3 = new Trainer ("Sophia", "Anderson", "Geotechnical");
        Trainer tr4 = new Trainer ("Olivia", "Lewis", "Structural");
        
        // Create Courses
        Course course1 = new Course("Foundations", "Geotechnical", "Full time", LocalDate.parse("2019-01-05"), LocalDate.parse("2019-05-20"));
        Course course2 = new Course("Reinforced Concrete", "Structural", "Part time", LocalDate.parse("2019-03-20"), LocalDate.parse("2019-08-10"));
        Course course3 = new Course("Hydrology", "Hydraulic", "Full time", LocalDate.parse("2019-01-06"), LocalDate.parse("2019-05-18"));
        Course course4 = new Course("Road Construction", "Transportation", "Part time", LocalDate.parse("2019-03-30"), LocalDate.parse("2019-08-12"));
        
        // Create Assignments
        Assignment assignment1 = new Assignment("Soil Mechanics", " Plane-strain and axis-symmetric loading", LocalDateTime.parse("2019-01-17T15:00:00"), 7.5, 2.5);
        Assignment assignment2 = new Assignment("Earthquake Engineering", "Fundamental principles of earthquake engineering and seismic design", LocalDateTime.parse("2019-02-20T15:00:00"), 3.5, 9.5);
        Assignment assignment3 = new Assignment("Computational Geotechnics", "Simple numerical methods", LocalDateTime.parse("2019-03-10T15:00:00"), 5, 10);
        Assignment assignment4 = new Assignment("Laboratory on Materials", "Calculating and statistical analysis", LocalDateTime.parse("2019-04-06T15:00:00"), 2.5, 8);
        Assignment assignment5 = new Assignment("Strength Of Materials", "Pure Bending, Eccentric Axial Loading", LocalDateTime.parse("2019-05-22T15:00:00"), 8.0, 10.0);
        Assignment assignment6 = new Assignment("Limit states", "Ultimate and serviceability limit states", LocalDateTime.parse("2019-06-13T15:00:00"), 9.0, 10.0);
        Assignment assignment7 = new Assignment("Hydrometry", "Analysis and processing of hydrometric data", LocalDateTime.parse("2019-07-03T15:00:00"), 7.5, 8.5);
        Assignment assignment8 = new Assignment("Hydrostatics", "Hydrostatics equation", LocalDateTime.parse("2019-08-24T15:00:00"), 4.5, 9.0);
        Assignment assignment9 = new Assignment("External and Internal Harbour Works", "Design of projects with slopes", LocalDateTime.parse("2019-09-12T15:00:00"), 5.0, 7.0);
        Assignment assignment10 = new Assignment("Probability and Statistics", "Random sample and sampling distributions", LocalDateTime.parse("2019-10-01T15:00:00"), 3.5, 9.0);
        Assignment assignment11 = new Assignment("Railway Engineering", "Static and dynamic loads and relevant calculations", LocalDateTime.parse("2019-11-29T15:00:00"), 4.0, 6.0);
        Assignment assignment12 = new Assignment("Traffic Flow", "Statistical analysis distributions and sampling regarding traffic counts", LocalDateTime.parse("2019-12-07T15:00:00"), 7.0, 3.0);
    
    // Add students to the list of students
    public void createStudents() {
        PrivateSchool.students.add(st1);
        PrivateSchool.students.add(st2);
        PrivateSchool.students.add(st3);
        PrivateSchool.students.add(st4);
        PrivateSchool.students.add(st5);
        PrivateSchool.students.add(st6);
        PrivateSchool.students.add(st7);
        PrivateSchool.students.add(st8);
        PrivateSchool.students.add(st9);
        PrivateSchool.students.add(st10);
        PrivateSchool.students.add(st11);
        PrivateSchool.students.add(st12);
        PrivateSchool.students.add(st13);
        PrivateSchool.students.add(st14);
        PrivateSchool.students.add(st15);  
    }
    
    // Add trainers to the list of Trainers
    public void createTrainers() {
        PrivateSchool.trainers.add(tr1);
        PrivateSchool.trainers.add(tr2);
        PrivateSchool.trainers.add(tr3);
        PrivateSchool.trainers.add(tr4);
    }
    
    // Add courses to the list of Courses
    public void createCourses() {
        PrivateSchool.courses.add(course1);
        PrivateSchool.courses.add(course2);
        PrivateSchool.courses.add(course3);
        PrivateSchool.courses.add(course4);
    }
    
    // Add assignments to the list of Assignments
    public void createAssignments() {
        PrivateSchool.assignments.add(assignment1);
        PrivateSchool.assignments.add(assignment2);
        PrivateSchool.assignments.add(assignment3);
        PrivateSchool.assignments.add(assignment4);
        PrivateSchool.assignments.add(assignment5);
        PrivateSchool.assignments.add(assignment6);
        PrivateSchool.assignments.add(assignment7);
        PrivateSchool.assignments.add(assignment8);
        PrivateSchool.assignments.add(assignment9);
        PrivateSchool.assignments.add(assignment10);
        PrivateSchool.assignments.add(assignment11);
        PrivateSchool.assignments.add(assignment12);
    }
    
    // Add students to each course list
    public void createStudentsPerCourse () {
        PrivateSchool.studentsFoundations.add(st1);
        PrivateSchool.studentsFoundations.add(st2);
        PrivateSchool.studentsFoundations.add(st3);
        PrivateSchool.studentsFoundations.add(st4);
        PrivateSchool.studentsFoundations.add(st14);
        PrivateSchool.studentsConcrete.add(st5);
        PrivateSchool.studentsConcrete.add(st6);
        PrivateSchool.studentsConcrete.add(st7);
        PrivateSchool.studentsConcrete.add(st8);
        PrivateSchool.studentsConcrete.add(st1);
        PrivateSchool.studentsHydrology.add(st9);
        PrivateSchool.studentsHydrology.add(st10);
        PrivateSchool.studentsHydrology.add(st11);
        PrivateSchool.studentsHydrology.add(st12);
        PrivateSchool.studentsHydrology.add(st7);
        PrivateSchool.studentsRoad.add(st13);
        PrivateSchool.studentsRoad.add(st14);
        PrivateSchool.studentsRoad.add(st15);
        PrivateSchool.studentsRoad.add(st9);
    }
    
    // Add trainers to each course list
    public void createTrainersPerCourse () {
        PrivateSchool.trainersFoundations.add(tr3);
        PrivateSchool.trainersConcrete.add(tr4);
        PrivateSchool.trainersHydrology.add(tr1);
        PrivateSchool.trainersRoad.add(tr2);
    }
    
    // Add assignments to each course list
    public void createAssignmentsPerCourse () {
        PrivateSchool.assignmentsFoundations.add(assignment1);
        PrivateSchool.assignmentsFoundations.add(assignment2);
        PrivateSchool.assignmentsFoundations.add(assignment3);
        PrivateSchool.assignmentsConcrete.add(assignment4);
        PrivateSchool.assignmentsConcrete.add(assignment5);
        PrivateSchool.assignmentsConcrete.add(assignment6);
        PrivateSchool.assignmentsHydrology.add(assignment7);
        PrivateSchool.assignmentsHydrology.add(assignment8);
        PrivateSchool.assignmentsHydrology.add(assignment9);
        PrivateSchool.assignmentsRoad.add(assignment10);
        PrivateSchool.assignmentsRoad.add(assignment11);
        PrivateSchool.assignmentsRoad.add(assignment12);
    }


}
