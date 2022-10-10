package kodlamaioWithNLayeredApp.dataAccess;

import java.util.List;

import kodlamaioWithNLayeredApp.entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}
