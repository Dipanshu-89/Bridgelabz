package Bridgelabz.Generic_problems;
import java.util.List;
abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;
    Course(T type) { this.type = type; }
}
class CourseUtil {
    public static void display(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println(c.getClass().getSimpleName());
    }
}

