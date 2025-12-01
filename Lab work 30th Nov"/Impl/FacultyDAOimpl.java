package com.knmodicolledgecolledgemanagement.collegemanagement.dao.impl;

package com.jdbcconnectivity.learningmanagementsystem.dao.impl;
import com.jdbcconnectivity.learningmanagementsystem.dao.FacultyDAO;
import com.jdbcconnectivity.learningmanagementsystem.model.Course;
import com.jdbcconnectivity.learningmanagementsystem.model.Faculty;
import com.jdbcconnectivity.learningmanagementsystem.util.DatabaseUtil;
import java.sql.*;
import java.util.ArrayList;

public class FacultyDAOImpl implements FacultyDAO{

	
	@Override
	public int save(Faculty facultyData) {
		int insertedRows = 0;
		try(Connection con = DatabaseUtil.establishConnection();)
		{
			
			/*--- creating reference of Prepared Statement interface ---*/
			PreparedStatement stmt = con.prepareStatement("insert into faculty values(?,?,?,?)");
			/*--- setting values into the query parameters */
			stmt.setString(1, facultyData.getFacultyId());
			stmt.setString(2, facultyData.getFacultyName());
			stmt.setString(3, facultyData.getQualification());
			stmt.setString(4, facultyData.getStatus());
			/*-------------------------------------------------*/
			//executing the query
			insertedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return insertedRows;
	}

	@Override
	public ArrayList<Faculty> findAll() {
		//defining an arraylist
				ArrayList<Faculty> facultyList = new ArrayList<>();
				try(Connection con = DatabaseUtil.establishConnection())
				{
					//create statement
					Statement stmt = con.createStatement();
					//query to slect data from table
					String sqlQuery = "Select facultyid,"
							+"facultyname,qualification,"
							+"status from faculty";
					//to execute the select query
					ResultSet result = stmt.executeQuery(sqlQuery);
					//Creating object of faculty
					Faculty faculty;
					//fetching data
					while(result.next())
					{
						faculty = new Faculty();
						//setting faculty data
						faculty.setFacultyId(result.getString(1));
						faculty.setFacultyName(result.getString(2));
						faculty.setQualification(result.getString(3));
						faculty.setStatus(result.getString(4));
						//inserting faculty into arraylist
						facultyList.add(faculty);
					}				
				}
				catch(SQLException sqe)
				{
					System.out.println(sqe);
				}
				
				return facultyList;

	}

	@Override
	public Course findByFacultyId(String facultyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateFacultyStatusByFacultyId(String facultyId, String status) {
		int updatedRows = 0;
		try(Connection con = DatabaseUtil.establishConnection();)
		{
			
			/*--- creating reference of Prepared Statement interface ---*/
			PreparedStatement stmt = con.prepareStatement("update faculty set status = ? where facultyid = ?");
			/*--- setting values into the query parameters */
			stmt.setString(1, status);
			stmt.setString(2, facultyId);
			/*-------------------------------------------------*/
			//executing the query
			updatedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		return updatedRows;
	}
	
	@Override
	public int delete(String facultyId) {

		int deletedRows = 0;
		try(Connection con =DatabaseUtil.establishConnection())
		{
			//to create reference of preparedStatement interface
			PreparedStatement stmt = con.prepareStatement("delete from faculty where facultyid = ? ");
			//setting query parameters
			stmt.setString(1, facultyId);
			
			//to exceute the query
			deletedRows = stmt.executeUpdate();
		}
		catch(SQLException sqe)
		{
			System.out.println(sqe);
		}
		// TODO Auto-generated method stub
		return deletedRows;
	}

}
