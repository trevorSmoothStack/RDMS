package com.ss.rdbms.as1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {

	public static void main(String[] args) {
		DatabaseConnect dc = new DatabaseConnect();
		String sql = "SELECT * FROM `stackoverflow`";
		try {
		    PreparedStatement statement = dc.connect().prepareStatement(sql);
		} catch (SQLException e) {
		    e.printStackTrace();
		} finally {
		    dc.disconnect();
		}

	}

}

// TEST