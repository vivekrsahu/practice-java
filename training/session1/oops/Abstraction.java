package session1.oops;

import java.util.List;

public interface Abstraction {

    void enrollForJava(Employee employee, Course course);

    List<String> getEnrolledCourses(String employeeId);

}
