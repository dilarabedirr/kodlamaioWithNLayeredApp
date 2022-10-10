package kodlamaioWithNLayeredApp.dataAccess.hibernate;

import kodlamaioWithNLayeredApp.dataAccess.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen bilgileri Hibernate ile veritabanına eklendi");
	}

}
