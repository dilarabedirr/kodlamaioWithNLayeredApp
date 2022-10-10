package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.InstructorDao;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi : " + instructor.getFullName());
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getFullName());
		}
	}

}
