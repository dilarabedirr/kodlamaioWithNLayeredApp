package kodlamaioWithNLayeredApp.dataAccess.jdbc;

import kodlamaioWithNLayeredApp.dataAccess.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("E�itmen bilgileri jdbc ile veritaban�na eklendi.");
	}

}
