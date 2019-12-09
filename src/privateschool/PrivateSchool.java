package privateschool;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Georgia_Papavgeri
 */

public class PrivateSchool {

    public static List<Student> students = new ArrayList<>();
    public static List<Course> courses = new ArrayList<>();
    public static List<Trainer> trainers = new ArrayList<>();
    public static List<Assignment> assignments = new ArrayList<>();
    public static List<Student> studentsFoundations = new ArrayList<>();
    public static List<Student> studentsConcrete = new ArrayList<>();
    public static List<Student> studentsHydrology = new ArrayList<>();
    public static List<Student> studentsRoad = new ArrayList<>();
    public static List<Trainer> trainersFoundations = new ArrayList<>();
    public static List<Trainer> trainersConcrete = new ArrayList<>();
    public static List<Trainer> trainersHydrology = new ArrayList<>();
    public static List<Trainer> trainersRoad = new ArrayList<>();
    public static List<Assignment> assignmentsFoundations = new ArrayList<>();
    public static List<Assignment> assignmentsConcrete = new ArrayList<>();
    public static List<Assignment> assignmentsHydrology = new ArrayList<>();
    public static List<Assignment> assignmentsRoad = new ArrayList<>();

    public static void main(String[] args) {
        PrivateSchool school = new PrivateSchool();
        SyntheticData sd = new SyntheticData();
        System.out.println("Welcome to our Private School of Civil Engineers!\n"
                + "Please press:\n"
                + "(1) to input data or \n"
                + "(2) to use Synthetic Data.\n"
                + "Enter the number here:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number == 1) {
            System.out.println(INPUT_MESSAGE);
            Scanner input1 = new Scanner(System.in);
            int inputValue1 = input1.nextInt();

            switch (inputValue1) {
                case 1: // INPUT Student
                    school.processStudentData();
                    break;
                case 2: // INPUT Trainer
                    school.processTrainerData();
                    break;
                case 3: // INPUT Course
                    school.processCourseData();
                    break;
                case 4: // INPUT Assignment
                    school.processAssignmentData();
                    break;
                case 5: // PRINT students list   
                    if (students.isEmpty()) {
                        System.out.println("There are no students enrolled in the school! Press (1) to add students.");
                    } else {
                        System.out.println("List of Students:\n" + students);
                    }
                    break;
                case 6: // PRINT trainers list 
                    if (trainers.isEmpty()) {
                        System.out.println("There are no trainers in the school! Press (2) to add trainers.");
                    } else {
                        System.out.println("List of Trainers:\n" + trainers);
                    }
                    break;
                case 7: // PRINT courses list 
                    if (courses.isEmpty()) {
                        System.out.println("There are no courses available! Press (3) to add courses!");
                    } else {
                        System.out.println("List of Courses:\n" + courses);
                    }
                    break;
                case 8: // PRINT assignments list 
                    if (assignments.isEmpty()) {
                        System.out.println("There are no assignments available! Press (4) to add assignments!");
                    } else {
                        System.out.println("List of Assignments:\n" + assignments);
                    }
                    break;
                case 9: // PRINT Students per Course 
                    if (students.isEmpty()) {
                        System.out.println("The list of students is empty! Press (1) to add students.");
                    }
                    if (courses.isEmpty()) {
                        System.out.println("The list of courses is empty! Press (3) to add courses.");
                    } else {
                        school.studentsPerCourse();
                    }
                    break;
                case 10: // PRINT Trainers per Course 
                    if (trainers.isEmpty()) {
                        System.out.println("The list of trainers is empty! Press (2) to add trainers.");
                    }
                    if (courses.isEmpty()) {
                        System.out.println("The list of courses is empty! Press (3) to add courses.");
                    } else {
                        school.trainersPerCourse();
                    }
                    break;
                case 11: // PRINT Assignments per Course
                    if (assignments.isEmpty()) {
                        System.out.println("The list of assignments is empty! Press (4) to add assignments.");
                    }
                    if (courses.isEmpty()) {
                        System.out.println("The list of courses is empty! Press (3) to add courses.");
                    } else {
                        school.assignmentsPerCourse();
                    }
                    break;
                case 12: // PRINT Assignments per Student
                    if (students.isEmpty()) {
                        System.out.println("The list of students is empty! Press (1) to add students.");
                    }
                    if (assignments.isEmpty()) {
                        System.out.println("The list of assignments is empty! Press (4) to add assignments.");
                    }
                    if (courses.isEmpty()) {
                        System.out.println("The list of courses related to assignments is emtpy! Press (3) to add courses.");
                    } else {
                        school.assignmentsPerStudent();
                    }
                    break;
                case 13: // PRINT students that belong to more than one courses                     
                    school.coursesPerStudent();
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }

        while (number == 2) {
            System.out.println(SYNTHETIC_DATA_MESSAGE);
            Scanner input2 = new Scanner(System.in);
            int inputValue2 = input2.nextInt();

            switch (inputValue2) {
                case 1: // PRINT students list 
                    if (!(students.isEmpty())) {
                        students.clear();
                    }
                    sd.createStudents();
                    System.out.println("List of Students:\n" + students);
                    break;
                case 2: // PRINT trainers list 
                    if (!(trainers.isEmpty())) {
                        trainers.clear();
                    }
                    sd.createTrainers();
                    System.out.println("List of Trainers:\n" + trainers);
                    break;
                case 3: // PRINT courses list 
                    if (!(courses.isEmpty())) {
                        courses.clear();
                    }
                    sd.createCourses();
                    System.out.println("List of Courses:\n" + courses);
                    break;
                case 4: // PRINT assignments list 
                    if (!(assignments.isEmpty())) {
                        assignments.clear();
                    }
                    sd.createAssignments();
                    System.out.println("List of Assignments:\n" + assignments);
                    break;
                case 5: // PRINT Students per Course 
                    if (!(studentsFoundations.isEmpty())) {
                        studentsFoundations.clear();
                    }
                    if (!(studentsConcrete.isEmpty())) {
                        studentsConcrete.clear();
                    }
                    if (!(studentsHydrology.isEmpty())) {
                        studentsHydrology.clear();
                    }
                    if (!(studentsRoad.isEmpty())) {
                        studentsRoad.clear();
                    }
                    sd.createStudentsPerCourse();
                    System.out.println("Students for Course 'Foundations' are:\n" + studentsFoundations
                            + "\nStudents for Course 'Reinforced Concrete' are:\n" + studentsConcrete
                            + "\nStudents for Course 'Hydrology' are:\n" + studentsHydrology
                            + "\nStudents for Course 'Road Construction' are:\n" + studentsRoad);
                    break;
                case 6: // PRINT Trainers per Course 
                    if (!(trainersFoundations.isEmpty())) {
                        trainersFoundations.clear();
                    }
                    if (!(trainersConcrete.isEmpty())) {
                        trainersConcrete.clear();
                    }
                    if (!(trainersHydrology.isEmpty())) {
                        trainersHydrology.clear();
                    }
                    if (!(trainersRoad.isEmpty())) {
                        trainersRoad.clear();
                    }
                    sd.createTrainersPerCourse();
                    System.out.println("Trainers for Course 'Foundations' are:\n" + trainersFoundations
                            + "\nTrainers for Course 'Reinforced Concrete' are:\n" + trainersConcrete
                            + "\nTrainers for Course 'Hydrology' are:\n" + trainersHydrology
                            + "\nTrainers for Course 'Road Construction' are:\n" + trainersRoad);
                    break;
                case 7: // PRINT Assignments per Course
                    if (!(assignmentsFoundations.isEmpty())) {
                        assignmentsFoundations.clear();
                    }
                    if (!(assignmentsConcrete.isEmpty())) {
                        assignmentsConcrete.clear();
                    }
                    if (!(assignmentsHydrology.isEmpty())) {
                        assignmentsHydrology.clear();
                    }
                    if (!(assignmentsRoad.isEmpty())) {
                        assignmentsRoad.clear();
                    }
                    sd.createAssignmentsPerCourse();
                    System.out.println("Assignments for Course 'Foundations' are:\n" + assignmentsFoundations
                            + "\nAssignments for Course 'Reinforced Concrete' are:\n" + assignmentsConcrete
                            + "\nAssignments for Course 'Hydrology' are:\n" + assignmentsHydrology
                            + "\nAssignments for Course 'Road Construction' are:\n" + assignmentsRoad);
                    break;
                case 8: // PRINT Assignments per Student
                    school.assignmentsPerStudentSd();
                    break;
                case 9: // PRINT students that belong to more than one courses 
                    school.coursesPerStudentSd();
                    break;
                case 10: // PRINT students who need to submit one or more assignments on the same calendar week as the given date 
                    school.processDate();
                    break;
                default:
                    System.out.println("Invalid entry");
                    break;
            }
        }
        if (number != 1 || number != 2) {
            System.out.println("Invalid Entry!");
        }
    }

    private static final String INPUT_MESSAGE = new StringBuilder("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
            .append("\nPlease press one of the following numbers to continue:\n")
            .append("(1) to INPUT Student,\n")
            .append("(2) to INPUT Trainer,\n")
            .append("(3) to INPUT Course, \n")
            .append("(4) to INPUT Assignment, \n")
            .append("(5) to PRINT a list of Students, \n")
            .append("(6) to PRINT a list of Trainers, \n")
            .append("(7) to PRINT a list of Courses, \n")
            .append("(8) to PRINT a list of Assignments, \n")
            .append("(9) to PRINT all the Students per Course , \n")
            .append("(10) to PRINT all the Trainers per Course , \n")
            .append("(11) to PRINT all the Assignments per Course , \n")
            .append("(12) to PRINT all the Assignments per Student , \n")
            .append("(13) to PRINT a list of students that belong to more than one courses , \n")
            .append("Enter the number here: ")
            .toString();

    private static final String SYNTHETIC_DATA_MESSAGE = new StringBuilder("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
            .append("\nPlease press one of the following numbers to continue:\n")
            .append("(1) to PRINT a list of Students, \n")
            .append("(2) to PRINT a list of Trainers, \n")
            .append("(3) to PRINT a list of Courses, \n")
            .append("(4) to PRINT a list of Assignments, \n")
            .append("(5) to PRINT all the Students per Course , \n")
            .append("(6) to PRINT all the Trainers per Course , \n")
            .append("(7) to PRINT all the Assignments per Course , \n")
            .append("(8) to PRINT all the Assignments per Student , \n")
            .append("(9) to PRINT a list of students that belong to more than one courses , \n")
            .append("(10) to ENTER a date and PRINT the students who need to submit assignments on the same calendar week. \n")
            .append("Enter the number here: ")
            .toString();

    // Method to read input data
    private static String readInputData(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message);
        return input.nextLine();
    }

    // Method to create students from user's input and add them to the students list
    private void processStudentData() {
        // Read data from user's input
        String studentFirstName = readInputData("Insert Student's First Name: ");
        String studentLastName = readInputData("Insert Student's Last Name: ");
        LocalDate studentDateOfBirth = LocalDate.parse(readInputData("Insert Student's Date of Birth (YYYY-MM-DD): "));
        double studentTuitionFees = Double.valueOf(readInputData("Insert Student's Tuition Fees (€): "));
        // Create Student
        Student student = new Student(studentFirstName, studentLastName, studentDateOfBirth, studentTuitionFees);
        // Add student to the students list
        students.add(student);
    }

    // Method to create trainers from user's input and add them to the trainers list
    private void processTrainerData() {
        // Read data from user's input
        String trainerFirstName = readInputData("Insert Trainer's First Name: ");
        String trainerLastName = readInputData("Insert Trainer's Last Name: ");
        String trainerSubject = readInputData("Insert Trainer's Subject: ");
        // Create Trainer
        Trainer trainer = new Trainer(trainerFirstName, trainerLastName, trainerSubject);
        // Add Trainer to the trainers list
        trainers.add(trainer);
    }

    // Method to create courses from user's input and add them to the courses list    
    private void processCourseData() {
        // Read data from user's input
        String courseTitle = readInputData("Insert Course's Title: ");
        String courseStream = readInputData("Insert Course's Stream: ");
        String courseType = readInputData("Insert Course's Type: ");
        LocalDate courseStartDate = LocalDate.parse(readInputData("Insert Course's Start Date (YYYY-MM-DD): "));
        LocalDate courseEndDate = LocalDate.parse(readInputData("Insert Course's End Date (YYYY-MM-DD): "));
        // Create Course
        Course course = new Course(courseTitle, courseStream, courseType, courseStartDate, courseEndDate);
        // Add Course to the courses list
        courses.add(course);
    }

    // Method to create assignments from user's input and add them to the assignments list
    private void processAssignmentData() {
        // Read data from user's input
        String assignmentTitle = readInputData("Insert Assignment's Title: ");
        String assignmentDescription = readInputData("Insert Assignment's Description: ");
        LocalDateTime assignmentSubDateTime = LocalDateTime.parse(readInputData("Insert Assignment's Submission Date and Time(YYYY-MM-DDTHH:MM:SS): "));
        double assignmentOralMark = Double.valueOf(readInputData("Insert Assignment's Oral Mark: "));
        double assignmentTotalMark = Double.valueOf(readInputData("Insert Assignment's Total Mark: "));
        // Create Assignment
        Assignment assignment = new Assignment(assignmentTitle, assignmentDescription, assignmentSubDateTime, assignmentOralMark, assignmentTotalMark);
        // Add Assignment to the assignments list
        assignments.add(assignment);
    }

    // Method to assign students to each course from user's input
    public void studentsPerCourse() {
        for (Course course : courses) {
            if (course.getStudents() != null) {
                course.getStudents().clear();
            }
            course.setStudents(Helper.getRandomStudents());
            System.out.println("Students assigned to course " + course.getTitle() + " are :\n" + course.getStudents());
        }
    }

    // Method to assign trainers to each course from user's input
    public void trainersPerCourse() {
        for (Course course : courses) {
            if (course.getTrainers() != null) {
                course.getTrainers().clear();
            }
            course.setTrainers(Helper.getRandomTrainers());
            System.out.println("Trainers assigned to course " + course.getTitle() + " are:\n" + course.getTrainers());
        }
    }

    // Method to assign assignments to each course from user's input
    public void assignmentsPerCourse() {
        for (Course course : courses) {
            if (course.getAssignments() != null) {
                course.getAssignments().clear();
            }
            course.setAssignments(Helper.getRandomAssignments());
            System.out.println("Assignments assigned to course " + course.getTitle() + " are: \n" + course.getAssignments());
        }
    }

    // Method to assign assignments to each student from user's input
    public void assignmentsPerStudent() {
        for (Student student : students) {
            if (student.getCourses() != null) {
                student.getCourses().clear();
            }
            student.setCourses(Helper.getRandomCourses());
            System.out.println("\nAssignments for Student " + student.getStFirstName() + " " + student.getStLastName() + " are:");
            for (Course course : student.getCourses()) {
                if (course.getAssignments() != null) {
                    course.getAssignments().clear();
                }
                course.setAssignments(Helper.getRandomAssignments());
                System.out.println(course.getAssignments());
            }
        }
    }

    // Method to assign assignments to each student from sunthetic data
    public void assignmentsPerStudentSd() {
        SyntheticData sd = new SyntheticData();
        if (!(students.isEmpty())) {
            students.clear();
        }
        sd.createStudents();
        if (!(studentsFoundations.isEmpty())) {
            studentsFoundations.clear();
        }
        if (!(studentsConcrete.isEmpty())) {
            studentsConcrete.clear();
        }
        if (!(studentsHydrology.isEmpty())) {
            studentsHydrology.clear();
        }
        if (!(studentsRoad.isEmpty())) {
            studentsRoad.clear();
        }
        sd.createStudentsPerCourse();
        if (!(assignmentsFoundations.isEmpty())) {
            assignmentsFoundations.clear();
        }
        if (!(assignmentsConcrete.isEmpty())) {
            assignmentsConcrete.clear();
        }
        if (!(assignmentsHydrology.isEmpty())) {
            assignmentsHydrology.clear();
        }
        if (!(assignmentsRoad.isEmpty())) {
            assignmentsRoad.clear();
        }
        sd.createAssignmentsPerCourse(); // print synthetic data in absence of input data
        for (Student student : students) {
            System.out.println("\nAssignments for student (" + student.getStFirstName() + " " + student.getStLastName() + ") are:");
            if (studentsFoundations.contains(student)) {
                System.out.println(assignmentsFoundations);
            }
            if (studentsConcrete.contains(student)) {
                System.out.println(assignmentsConcrete);
            }
            if (studentsHydrology.contains(student)) {
                System.out.println(assignmentsHydrology);
            }
            if (studentsRoad.contains(student)) {
                System.out.println(assignmentsRoad);
            }
        }
    }

    // Method to find students that belong to more than one courses from user's input
    public void coursesPerStudent() {
        List<Student> studentsWithMoreThanOneCourses = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourses() != null) {
                student.getCourses().clear();
            }
            student.setCourses(Helper.getRandomCourses());
            if (student.getCourses().size() > 1) {
                studentsWithMoreThanOneCourses.add(student);
            }
        }
        if (studentsWithMoreThanOneCourses.isEmpty()) {
            System.out.println("There are no students that belong to more than one courses.");
        } else {
            System.out.println("Students with more than one courses are:\n" + studentsWithMoreThanOneCourses);
        }
    }

    // Method to find students that belong to more than one courses from synthetic data
    public void coursesPerStudentSd() {
        SyntheticData sd = new SyntheticData();
        if (!(students.isEmpty())) {
            students.clear();
        }
        sd.createStudents();
        if (!(studentsFoundations.isEmpty())) {
            studentsFoundations.clear();
        }
        if (!(studentsConcrete.isEmpty())) {
            studentsConcrete.clear();
        }
        if (!(studentsHydrology.isEmpty())) {
            studentsHydrology.clear();
        }
        if (!(studentsRoad.isEmpty())) {
            studentsRoad.clear();
        }
        sd.createStudentsPerCourse();
        List<Student> studentMoreCourses = new ArrayList<>();

        for (Student student : students) {
            int studentCount = 0;
            if (studentsFoundations.contains(student)) {
                studentCount++;
            }
            if (studentsConcrete.contains(student)) {
                studentCount++;
            }
            if (studentsHydrology.contains(student)) {
                studentCount++;
            }
            if (studentsRoad.contains(student)) {
                studentCount++;
            }
            if (studentCount > 1) {
                studentMoreCourses.add(student);
            }
        }
        System.out.println("Students that belong to more than one courses are:\n" + studentMoreCourses);
    }

    // Method to find students from Synthetic Data who need to submit one or more assignments on the same calendar week as the given date    
    private void processDate() {
        SyntheticData sd = new SyntheticData();
        LocalDateTime inputDateTime = LocalDateTime.parse(readInputData("Insert Date and Time (YYYY-MM-DDTHH:MM:SS): \n"));
        LocalDateTime firstOfWeek = inputDateTime.with(ChronoField.DAY_OF_WEEK, 1);
        LocalDateTime lastOfWeek = firstOfWeek.plus(6, ChronoUnit.DAYS);
        List<Student> sameWeekStudent = new ArrayList<>();
        if (!(students.isEmpty())) {
            students.clear();
        }
        sd.createStudents();
        if (!(studentsFoundations.isEmpty())) {
            studentsFoundations.clear();
        }
        if (!(studentsConcrete.isEmpty())) {
            studentsConcrete.clear();
        }
        if (!(studentsHydrology.isEmpty())) {
            studentsHydrology.clear();
        }
        if (!(studentsRoad.isEmpty())) {
            studentsRoad.clear();
        }
        sd.createStudentsPerCourse();
        if (!(assignmentsFoundations.isEmpty())) {
            assignmentsFoundations.clear();
        }
        if (!(assignmentsConcrete.isEmpty())) {
            assignmentsConcrete.clear();
        }
        if (!(assignmentsHydrology.isEmpty())) {
            assignmentsHydrology.clear();
        }
        if (!(assignmentsRoad.isEmpty())) {
            assignmentsRoad.clear();
        }
        sd.createAssignmentsPerCourse();
        for (Student student : students) {
            if (studentsFoundations.contains(student)) {
                for (Assignment assignment : assignmentsFoundations) {
                    if (!((assignment.getSubDateTime().isBefore(firstOfWeek)) || (assignment.getSubDateTime().isAfter(lastOfWeek)))) {
                        sameWeekStudent.add(student);
                    }
                }
            }
            if (studentsConcrete.contains(student)) {
                for (Assignment assignment : assignmentsConcrete) {
                    if (!((assignment.getSubDateTime().isBefore(firstOfWeek)) || (assignment.getSubDateTime().isAfter(lastOfWeek)))) {
                        sameWeekStudent.add(student);
                    }
                }
            }
            if (studentsHydrology.contains(student)) {
                for (Assignment assignment : assignmentsHydrology) {
                    if (!((assignment.getSubDateTime().isBefore(firstOfWeek)) || (assignment.getSubDateTime().isAfter(lastOfWeek)))) {
                        sameWeekStudent.add(student);
                    }
                }
            }
            if (studentsRoad.contains(student)) {
                for (Assignment assignment : assignmentsRoad) {
                    if (!((assignment.getSubDateTime().isBefore(firstOfWeek)) || (assignment.getSubDateTime().isAfter(lastOfWeek)))) {
                        sameWeekStudent.add(student);
                    }
                }
            }
        }

        if (sameWeekStudent.isEmpty()) {
            System.out.println("There is no assignment to be submitted on the same calendar week as the given date.");
        } else {
            System.out.println("\nStudents who need to submit one or more assignments on the same calendar week as the given date are:\n" + sameWeekStudent);
        }

    }

}
