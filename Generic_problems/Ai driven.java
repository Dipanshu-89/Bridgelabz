package Bridgelabz.Generic_problems;
import java.util.*;
abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}
class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
}
class ScreeningSystem {
    public static void process(List<? extends JobRole> resumes) {
        for (JobRole j : resumes)
            System.out.println("Processing: " + j.getClass().getSimpleName());
    }
}

