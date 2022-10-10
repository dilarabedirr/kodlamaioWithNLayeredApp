package kodlamaioWithNLayeredApp.dataAccess.jdbc;

import kodlamaioWithNLayeredApp.dataAccess.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eðitmen bilgileri jdbc ile veritabanýna eklendi.");
	}

}
