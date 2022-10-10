package kodlamaioWithNLayeredApp;

import kodlamaioWithNLayeredApp.business.CategoryManager;
import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.business.InstructorManager;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaioWithNLayeredApp.dataAccess.jdbc.JdbcCourseDao;
import kodlamaioWithNLayeredApp.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaioWithNLayeredApp.entities.Category;
import kodlamaioWithNLayeredApp.entities.Course;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------------------KURSLAR BÖLÜMÜ------------------------");
		Course course1 = new Course(1, "(2022) Yazýlým Geliþtirici Yetiþtirme Kampý - JAVA", "java.png", 100);
		Course course2 = new Course(2, "Senior Yazýlým Geliþtirici Yetiþtirme Kampý (.NET)", "net.png", 100);
		Course course3 = new Course(3, "Yazýlým Geliþtirici Yetiþtirme Kampý (JavaScript)", "javaScript.png", 100);
		Course course4 = new Course(4, "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + REACT)", "react.png", 100);
		Course course5 = new Course(5, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "angular.png", 100);
		Course course6 = new Course(6, "Programlamaya Giriþ için Temel Kurs", "programlama.png", 100);
		Course course7 = new Course(7, "Programlamaya Giriþ için Temel Kurs", "programlama.png", 100);
		Course course8 = new Course(7, "Programlamaya Giriþ için Temel Kurs-2", "programlama.png", -100);

		CourseManager courseManager = new CourseManager(new JdbcCourseDao());

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		courseManager.add(course5);
		courseManager.add(course6);
		courseManager.add(course7);
		courseManager.add(course8);
		System.out.println("------------------------------------------------------");
		courseManager.getAll();
		System.out.println("--------------------KATEGORÝLER BÖLÜMÜ------------------------");
		Category category = new Category(1, "Programlama");
		Category category2 = new Category(2, "yazýlým");
		Category category3 = new Category(3, "yazýlým");

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());

		categoryManager.add(category);
		categoryManager.add(category2);
		categoryManager.add(category3);
		System.out.println("------------------------------------------------------");
		categoryManager.getAll();
		System.out.println("--------------------EÐÝTMENLER BÖLÜMÜ------------------------");
		Instructor instructor = new Instructor(1, "Engin", "Demiroð");

		Logger[] loggers = { new FileLogger(), new MailLogger() };

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);

		instructorManager.add(instructor);
	}
}
