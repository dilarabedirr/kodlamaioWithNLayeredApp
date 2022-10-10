package kodlamaioWithNLayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Maile Loglandý : " + message);
	}
}
