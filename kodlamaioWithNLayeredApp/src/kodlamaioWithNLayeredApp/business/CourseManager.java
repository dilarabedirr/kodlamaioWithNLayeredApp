package kodlamaioWithNLayeredApp.business;

import java.util.List;

import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;

	public CourseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void add(Course course) {
		var courses = courseDao.getAll();
		for (Course c : courses) {
			if (course.getName() == c.getName()) {
				System.out.println("Kurs ismi tekrar edemez : " + course.getName());
				return;
			}
		}
		if (course.getPrice() < 0) {
			System.out.println("Bir kursun fiyatý sýfýrdan küçük olamaz : " + course.getName());
			return;
		}
		System.out.println("Kurs Eklendi : " + course.getName());
		courseDao.add(course);
	}

	public List<Course> getAll() {
		System.out.println("Kurslar listelendi : ");
		var courses = courseDao.getAll();
		for (Course course : courses) {
			System.out.println(course.getName());
		}
		return courses;
	}

}
