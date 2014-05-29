package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;

import play.db.DB;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

	public static Result index() throws SQLException {
		java.sql.Connection conn = DB.getConnection();
		java.sql.Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT ID_prof, ProfName, Password FROM login";
		ResultSet rs = stmt.executeQuery(sql);

		// STEP 5: Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("ID_prof");
			String name = rs.getString("ProfName");
			String password = rs.getString("Password");

			// Display values
			System.out.print("ID: " + id);
			System.out.print(", ProfName: " + name);
			System.out.println(", Password: " + password);
		}
		// STEP 6: Clean-up environment
		rs.close();
		stmt.close();
		conn.close();
		return ok(views.html.index.render("Your new application is ready."));
	}

	public static Result profSignIn() {
		return ok(views.html.indexProfSignIn
				.render("Your new application is ready."));
	}

}
