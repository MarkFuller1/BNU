package BNU.data;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class database implements dbWrapper {
	private static final Logger LOGGER = Logger.getLogger(database.class.getName());

	static {

		try {
			LOGGER.addHandler(new FileHandler("database.log"));
			LOGGER.setLevel(Level.FINEST);
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Connection getRemoteConnection() {
		if (System.getenv("RDS_HOSTNAME") != null) {
			try {
				Class.forName("org.postgresql.Driver");
				String dbName = "postgres";
				String userName = "postgres";
				String password = "aspartame";
				String hostname = "postgres.c5lgn5tcwkdn.us-east-2.rds.amazonaws.com";
				String port = "5432";
				String jdbcUrl = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName
						+ "&password=" + password;
				LOGGER.fine("Establishing Connection");
				Connection con = DriverManager.getConnection(jdbcUrl);
				LOGGER.fine("Remote connection successful.");
				return con;
			} catch (ClassNotFoundException e) {
				LOGGER.warning(e.toString());
			} catch (SQLException e) {
				LOGGER.warning(e.toString());
			}
		}
		return null;
	}

	@Override
	public String[] getAllProfessors() {
		String[] prof = null;
		// establish connection
		try (Connection con = getRemoteConnection(); Statement stmt = con.createStatement()) {

			// Query
			String sql = "SELECT name FROM professors";
			ResultSet result = stmt.executeQuery(sql);

			// Parse Query into string array
			while (result.next()) {
				String entry = result.getString("name");
				prof = entry.split("\n");
				for (int i = 0; i < prof.length; i++) {
					System.out.println(prof[i]);
				}
			}

			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return prof;
	}

	@Override
	public String[] getAllClasses() {
		String[] courses = null;
		// establish connection
		try (Connection con = getRemoteConnection(); Statement stmt = con.createStatement()) {

			// Query
			String sql = "SELECT title FROM courses";
			ResultSet result = stmt.executeQuery(sql);

			// Parse Query into string array
			while (result.next()) {
				String entry = result.getString("title");
				courses = entry.split("\n");
				for (int i = 0; i < courses.length; i++) {
					System.out.println(courses[i]);
				}
			}

			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return courses;
	}

	@Override
	public String[] getAllProfessorsForClass(String className) {
		String[] professors = null;
		// establish connection
		try (Connection con = getRemoteConnection(); Statement stmt = con.createStatement()) {

			// Query
			String sql = "SELECT professor_course.idc FROM courses, professor_course WHERE course.idc = professor_course.idc AND course.name = "
					+ className; // the SQl here is logically correct but the names of tables and rows and
									// columns need to change
			ResultSet result = stmt.executeQuery(sql);

			// Parse Query into string array
			while (result.next()) {
				String entry = result.getString("name");
				professors = entry.split("\n");
				for (int i = 0; i < professors.length; i++) {
					System.out.println(professors[i]);
				}
			}

			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return professors;
	}

	@Override
	public Professor getProfessor(String Prof) {
		String professorData = null;
		// establish connection
		try (Connection con = getRemoteConnection(); Statement stmt = con.createStatement()) {

			// Query
			String sql = "SELECT * FROM professors WHERE professor.name = " + Prof; // the SQl here is logically correct
																					// but the names of tables and rows
																					// and columns need to change
			ResultSet result = stmt.executeQuery(sql);

			// Parse Query into string array
			String entry = result.getString("name");
			professorData = entry.split("\n")[0]; // this probably can be improved
			System.out.println(professorData);
			Professor retrieved = new Professor(result);

			stmt.close();
			con.close();
			
			return retrieved;
		} catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return null;
	}

	@Override
	public String[] getAllClassesForProfessor(String professorName) {
		String[] courses = null;
		// establish connection
		try (Connection con = getRemoteConnection(); Statement stmt = con.createStatement()) {

			// Query
			String sql = "SELECT professor_course.idc FROM professors, professor_course WHERE professors.idc = professor_course.idc AND professors.name = "
					+ professorName; // the SQl here is logically correct but the names of tables and rows and
										// columns need to change
			ResultSet result = stmt.executeQuery(sql);

			// Parse Query into string array
			while (result.next()) {
				String entry = result.getString("courses");
				courses = entry.split("\n");
				for (int i = 0; i < courses.length; i++) {
					System.out.println(courses[i]);
				}
			}

			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		return courses;
	}

	@Override
	public Course getCourse(String course) {
		// TODO Auto-generated method stub
		return null;
	}
}