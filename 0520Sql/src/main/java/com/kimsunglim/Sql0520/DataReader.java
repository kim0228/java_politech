package com.kimsunglim.Sql0520;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.sqlite.SQLiteConfig;

public class DataReader {
	private Connection connection;
	private String dbFileName;
	private String dbTableName;
	static {
	try {
		Class.forName("org.sqlite.JDBC");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	public DataReader(String databaseFileName, String dbTableName) {
		this.dbFileName = databaseFileName;	// DB이름(파일이름)
		this.dbTableName = dbTableName;		// 테이블이름
	}
	
	public boolean open() {
		try {
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection("jdbc:sqlite:/" + this.dbFileName, config.toProperties());
		} catch (SQLException e) {
			e.printStackTrace();
		return false;
	}
		return true;
	}
	
	public boolean close() {
			if (this.connection == null) {
				return true;
			}
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
		
	public int createTable() throws Exception {
			if (this.connection == null) {
				throw new Exception("DB is not open");
			}
			String query = "CREATE TABLE " + this.dbTableName + "(idx INT PRIMARY KEY, name TEXT, score REAL);";// 정수형과 글자타입이 들어간다.
			Statement statement = this.connection.createStatement();
			int result = statement.executeUpdate(query); // query실행
			statement.close(); // statement를 이용해서 쿼리 실행
			return result;
			}
		
	public int insertData() throws SQLException {
			String query = "INSERT INTO " + this.dbTableName + "(name, score) VALUES('김성림',22);";
			Statement statement = this.connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			return result;
			}
	
	public boolean selectData() throws SQLException {
			boolean result = false;
			String query = "SELECT * FROM " + this.dbTableName + " WHERE ?;";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) { // 다음다음꺼로 가면서 첫번째 데이터 등 순서대로 접근하면서 원하는 필드값을 가져온다. 실제로는 결과값을 받아서 화면에 표시해줘야 한다.
				System.out.println(resultSet.getString("name"));
				result = true;
			}
			resultSet.close();
			preparedStatement.close();
			return result;
				}
		}