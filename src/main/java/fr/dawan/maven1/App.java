package fr.dawan.maven1;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {

	private static Logger myLogger = LogManager.getLogger(App.class.getName());

	private static Logger myLoggerError = LogManager.getLogger("myLogger2");

	public static void main(String[] args) {
		System.out.println("Hello World!");

		myLogger.info("My first log");
		myLogger.warn("My first warning");

		System.out.println("Révision objet");

		Calcul c1 = new Calcul();

		try {
			//Calcul.sommeEntier(5,7);
			System.out.println(Calcul.sommeEntier(17, 25));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			myLoggerError.error(e.getMessage(), e);
		}
		//System.out.println(c1.getNumero());
		myLoggerError.error(Level.ERROR, new NullPointerException("Null pointer example"));
		myLoggerError.error("Null example");
	}
}
