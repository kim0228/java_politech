package com.kopo.thecute;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DBCommon<T> {
	private Connection connection;

	public DBCommon() {
	}
	
	private void open() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.110.112:1521:orcl",
					"kopo","kopo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void close() {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		this.connection = null;
	}
	
	public void insertData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			String fieldString = "";
			String valueString = "";
			for (Field field : dataClassFields) {
				if (!fieldString.isEmpty()) {
					fieldString = fieldString + ",";
				}
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (fieldName.matches("idx")) {
					continue;
				}
				fieldString = fieldString + fieldName;
				if (!valueString.isEmpty()) {
					valueString = valueString + ",";
				}
				if (fieldType.matches(".*String")) {
					if (field.get(t) != null) {
						valueString = valueString +"'" + field.get(t) + "'";
					} else {
						valueString = valueString + "null";
					}
				} else {
					valueString = valueString + field.get(t);
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "INSERT INTO THECUTE (idx," + fieldString + ") VALUES(SEQ_IDX.NEXTVAL," + valueString + ")";
			System.out.println(query);
			Statement statement = this.connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	public void insertUserData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			// Class.forName("com.politech.student.Student")

			Field[] dataClassFields = dataClass.getDeclaredFields();
			// student.getClass().getSimpleName()
			String fieldString = "";
			String valueString = "";
			for (Field field : dataClassFields) {
				if (!fieldString.isEmpty()) {
					fieldString = fieldString + ",";
				}
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (fieldName.matches("idx")) {
					continue;
				}
				fieldString = fieldString + fieldName;
				if (!valueString.isEmpty()) {
					valueString = valueString + ",";
				}
				if (fieldType.matches(".*String")) {
					valueString = valueString + "'" + field.get(t) + "'";
				} else {
					valueString = valueString + field.get(t);
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "INSERT INTO THECUTE_USER (idx," + fieldString + ") VALUES(USER_IDX.NEXTVAL," + valueString + ")";
			System.out.println(query);
			Statement statement = this.connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	public HashMap<String, String> detailsData(T t,String jobgroup, String q010000, String q07grade) {
		HashMap<String, String> details = new HashMap<String, String>();
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();

			if (this.connection == null) {
				this.open();
			}
			
			String queryString = "";
			for (Field field : dataClassFields) {
				if (!queryString.isEmpty()) {
					queryString = queryString + ", ";
				}
				
				String fieldName = field.getName();	
				queryString = queryString + "count(" + fieldName + ") as " + fieldName;

//				System.out.println(queryString);
			}
			
			String query = "select jobgroup, q010000, q07grade, " + queryString + " from ( select * from thecute where 1=1 and q10grade >= 70) " + 
					"where 1=1 and jobgroup = " + jobgroup + " and q010000 = " + q010000 + " and q07grade = " + q07grade + 
					" group by jobgroup, q010000, q07grade order by jobgroup";
			System.out.println(query);

			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				details.put("jobgroup", resultSet.getString("jobgroup"));
				details.put("q010000", resultSet.getString("q010000"));
				details.put("q07grade", resultSet.getString("q07grade"));
				
				for (Field field : dataClassFields) {
					String fieldName = field.getName();				
					details.put(fieldName, resultSet.getString(fieldName));
				}
			}
			
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return details;
	}
	
	public int signIn(String id, String password) {
		int userIdx = 0;
		try {
			if (this.connection == null) {
				this.open();
			}
			String query = "SELECT * FROM THECUTE_USER WHERE id='" + id + "' AND password='" + password
					+ "'";
			System.out.println(query);
			
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				userIdx = resultSet.getInt("idx");
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		return userIdx;
	}
	
	
	public void updateData(T t, int whereId) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			String queryString = "";
			for (Field field : dataClassFields) {
				if (!queryString.isEmpty()) {
					queryString = queryString + ",";
				}
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (fieldName.matches("id")) {
					continue;
				}
				if (fieldType.matches(".*String")) {
					queryString = queryString + fieldName + "=" + "'" + field.get(t) + "'";
				} else {
					queryString = queryString + fieldName + "=" + field.get(t);
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "UPDATE THECUTE SET " + queryString + " WHERE id=" + whereId + ";";
			Statement statement = this.connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	
	
}
