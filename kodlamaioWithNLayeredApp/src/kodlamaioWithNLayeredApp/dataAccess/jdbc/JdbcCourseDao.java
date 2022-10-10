package kodlamaioWithNLayeredApp.dataAccess.jdbc;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	List<Course> courses;
	
	public JdbcCourseDao() {
		courses = new ArrayList<Course>();
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs bilgileri jdbc ile veritabanýna eklendi.");
		courses.add(course);
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

}
