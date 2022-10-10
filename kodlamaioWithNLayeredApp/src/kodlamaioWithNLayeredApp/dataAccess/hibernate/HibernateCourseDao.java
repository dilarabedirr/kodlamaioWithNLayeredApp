package kodlamaioWithNLayeredApp.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{
	
	List<Course> courses;
	
	public HibernateCourseDao() {
		courses = new ArrayList<Course>();
	}

	@Override
	public void add(Course course) {
		System.out.println("Kurs bilgileri Hibernate ile veritabanýna eklendi");
		courses.add(course);
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

}
