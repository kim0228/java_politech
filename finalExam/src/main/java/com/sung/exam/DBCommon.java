package com.sung.exam;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.sqlite.SQLiteConfig;

public class DBCommon<T> {
	private String dbFileName;
	private String tableName;
	private Connection connection;
	private ArrayList<T> dataList;

	public DBCommon(String dbFileName, String tableName) {
		this.dbFileName = dbFileName;
		this.tableName = tableName;
	}

	private void open() {
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection("jdbc:sqlite:/" + this.dbFileName, config.toProperties());
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

	public void createTable(T t) {
		try {
			Class<?> dataClass = t.getClass();
			// Class.forName("com.politech.student.Student")

			Field[] dataClassFields = dataClass.getDeclaredFields();
			// student.getClass().getSimpleName()
			String query = "";
			for (Field field : dataClassFields) {
				if (!query.isEmpty()) {
					query = query + ",";
				}
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (fieldName.matches("idx") && fieldType.matches("int")) {
					query = query + fieldName + " INTEGER PRIMARY KEY AUTOINCREMENT";
				} else if (fieldType.matches("int")) {
					query = query + fieldName + " INTEGER";
				} else if (fieldType.matches("(double|float)")) {
					query = query + fieldName + " REAL";
				} else if (fieldType.matches(".*String")) {
					query = query + fieldName + " TEXT";
				} 
			}
			if (this.connection == null) {
				this.open();
			}
			query = "CREATE TABLE " + this.tableName + "(" + query + ");";
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

	public void insertData(T t) {
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
			String query = "INSERT INTO " + this.tableName + "(" + fieldString + ") VALUES(" + valueString + ");";
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


	public void updateData(T t, int whereIdx) {
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
				if (fieldName.matches("idx")) {
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
			String query = "UPDATE " + this.tableName + " SET " + queryString + " WHERE idx=" + whereIdx + ";";
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

	public void deleteData(T t, int idx) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			for (Field field : dataClassFields) {
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (fieldName.matches("idx")) {
					idx = (Integer) field.get(t);
					continue;
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "DELETE FROM " + this.tableName + " WHERE idx=" + idx + ";";
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

	public void selectData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			this.dataList = new ArrayList<T>();

			if (this.connection == null) {
				this.open();
			}
			String query = "SELECT * FROM " + this.tableName + " WHERE ?;";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				T fieldData = (T) dataClass.getDeclaredConstructor().newInstance(); // 매번 객체를 생성
				for (Field field : dataClassFields) {
					String fieldType = field.getType().toString();
					String fieldName = field.getName();
					if (fieldType.matches("int")) {
						field.setInt(fieldData, resultSet.getInt(fieldName));
					} else {
						field.set(fieldData, resultSet.getString(fieldName));
					}
				}
				this.dataList.add(fieldData);
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	public ArrayList<T> selectArrayList(T t) { // 보조해주는 역할을 한다.
		this.selectData(t);
		return this.dataList;
	}
	
	public String selectDataTableTag(T t) { // 태그를 리턴해서 스트링으로 바꿔주는 역할
		this.selectData(t);
		Class<?> dataClass = t.getClass();
		String returnString = "";
		for (int i = 0; i < this.dataList.size(); i++) {
			try {
				Method toTableTagStringMethod = dataClass.getDeclaredMethod("toTableTagString"); // toTableTagString이라는 메소드를 실행하게 했다.
				returnString = returnString + (String) toTableTagStringMethod.invoke(this.dataList.get(i)); // 이 줄은 메소드를 실행시키는 역할을 한다.
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return returnString;
	}
	
	public T detailsData(T t, int idx) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			this.dataList = new ArrayList<T>();

			if (this.connection == null) {
				this.open();
			}
			String query = "SELECT * FROM " + this.tableName + " WHERE idx=?;";
			
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				T fieldData = (T) dataClass.getDeclaredConstructor().newInstance();
				for (Field field : dataClassFields) {
					String fieldType = field.getType().toString();
					String fieldName = field.getName();
					if (fieldType.matches("int")) {
						field.setInt(fieldData, resultSet.getInt(fieldName));
					} else {
						field.set(fieldData, resultSet.getString(fieldName));
					}
				}
				this.dataList.add(fieldData);
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
		if (this.dataList.size() > 0) {
			return this.dataList.get(0);
		}
		return null;
	}
	
	public void searchData(T t, String searchFieldName, String searchValue) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			this.dataList = new ArrayList<T>();

			if (this.connection == null) {
				this.open();
			}
			String query = "SELECT * FROM " + this.tableName + " WHERE " + searchFieldName + " LIKE '%" + searchValue + "%';";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				T fieldData = (T) dataClass.getDeclaredConstructor().newInstance();
				for (Field field : dataClassFields) {
					String fieldType = field.getType().toString();
					String fieldName = field.getName();
					if (fieldType.matches("int")) {
						field.setInt(fieldData, resultSet.getInt(fieldName));
					} else {
						field.set(fieldData, resultSet.getString(fieldName));
					}
				}
				this.dataList.add(fieldData);
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}

}
