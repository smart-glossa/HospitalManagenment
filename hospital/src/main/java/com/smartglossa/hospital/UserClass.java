package com.smartglossa.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserClass {
          public JSONObject addUser(String fullName, String userName, String pass, String gender, String mobileNumber, String place, String city, String state, String country, String pincode) throws JSONException{
        	JSONObject result = new JSONObject(); 
        	try{
        	Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	        Statement statement = connection.createStatement();
	        String query = "Insert into user(fullName,userName,pass,gender,mobileNumber,place,city,state,country,pincode) values('"+ fullName +"','"+ userName +"','"+ pass +"','"+ gender +"','"+ mobileNumber +"','"+ place +"','"+ city +"','"+ country +"','"+ pincode +"')";
	        statement.execute(query);
	        result.put("Status","1");
        	}catch(Exception e){
        		JSONObject error = new JSONObject();
        		error.put("Status","0");
        		error.put("Message","Internal Error");
        		return error;
        	}
        	return result;
          }
          public JSONObject updateUser(String fullName, String userName, String pass, String gender, String mobileNumber, String place, String city, String state, String country, String pincode) throws JSONException{
        	  JSONObject result = new JSONObject();
        	  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	  	        Statement statement = connection.createStatement();
	  	        String query = "update user set fullName='"+ fullName +"',pass='"+ pass +"',gender='"+ gender +"',mobileNumber='"+ mobileNumber +"',place='"+ place +"',city='"+ city +"',country='"+ country +"',pincode='"+ pincode +"' where userName='"+userName;
	  	        statement.execute(query);
	  	        result.put("Status", "1");
			} catch (Exception e) {
				JSONObject error = new JSONObject();
        		error.put("Status","0");
        		error.put("Message","Internal Error");
        		return error;
				
			}
        	  return result;
  			
          }
          public JSONObject deleteUser(String userName)throws JSONException{
        	  JSONObject result = new JSONObject();
        	    try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
		  	        Statement statement = connection.createStatement();
		  	        String query = "delete from user where userName='"+ userName;
		  	        statement.execute(query);
		  	        result.put("Status", "1");
				} catch (Exception e) {
					
					JSONObject error = new JSONObject();
	        		error.put("Status","0");
	        		error.put("Message","Internal Error");
	        		return error;
				}
				
	  	        
        	  return result;
          }
          public JSONObject getUserdetail(String userName)throws JSONException{
        	  JSONObject result = new JSONObject();
        	  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	  	        Statement statement = connection.createStatement();
	  	        String query = "select *from user where userName='"+userName;
	  	        ResultSet rs = statement.executeQuery(query);
	  	        if(rs.next()){
	  	        	result.put("fullName",rs.getString("fullName"));
	  	        	result.put("userName", rs.getString("userName"));
	  	        	result.put("gender", rs.getString("gender"));
	  	        	result.put("mobileNumber", rs.getString("mobileNumber"));
	  	        	result.put("place", rs.getString("place"));
	  	        	result.put("city", rs.getString("city"));
	  	        	result.put("state", rs.getString("state"));
	  	        	result.put("country", rs.getString("country"));
	  	        	result.put("pincode", rs.getString("pincode"));
	  	        }
			} catch (Exception e) {
				JSONObject error = new JSONObject();
        		error.put("Status","0");
        		error.put("Message","Internal Error");
        		return error;
			}
				
        	  return result;
          }
          public JSONArray getAllUsers()throws JSONException{
        	  JSONArray result = new JSONArray();
        	  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	  	        Statement statement = connection.createStatement();
	  	        String query = "select *from user";
	  	        ResultSet rs = statement.executeQuery(query);
	  	        if(rs.next()){
	  	        	JSONObject user = new JSONObject(); 
	  	        	user.put("fullName",rs.getString("fullName"));
	  	        	user.put("userName", rs.getString("userName"));
	  	        	user.put("gender", rs.getString("gender"));
	  	        	user.put("mobileNumber", rs.getString("mobileNumber"));
	  	        	user.put("place", rs.getString("place"));
	  	        	user.put("city", rs.getString("city"));
	  	        	user.put("state", rs.getString("state"));
	  	        	user.put("country", rs.getString("country"));
	  	        	user.put("pincode", rs.getString("pincode"));
	  	        	result.put(user);
	  	        }
			} catch (Exception e) {
				JSONArray error = new JSONArray();
        		error.put("Internal Error");
        	  	return error;
			}
				
        	  return result;
          }
          public JSONObject addDoctor(String fullName, String userName, String pass, String gender, String specialist, String mobileNumber, String place, String city, String state, String country, String pincode) throws JSONException{
        	JSONObject result = new JSONObject(); 
        	try{
        	Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	        Statement statement = connection.createStatement();
	        String query = "Insert into doctor(fullName,userName,pass,gender,specialist,mobileNumber,place,city,state,country,pincode) values('"+ fullName +"','"+ userName +"','"+ pass +"','"+ gender +"','"+ specialist +"','"+ mobileNumber +"','"+ place +"','"+ city +"','"+ country +"','"+ pincode +"')";
	        statement.execute(query);
	        result.put("Status","1");
        	}catch(Exception e){
        		JSONObject error = new JSONObject();
        		error.put("Status","0");
        		error.put("Message","Internal Error");
        		return error;
        	}
        	return result;
          }
          public JSONObject updateDoctor(String fullName, String userName, String pass, String gender, String specialist, String mobileNumber, String place, String city, String state, String country, String pincode) throws JSONException{
        	  JSONObject result = new JSONObject();
        	  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	  	        Statement statement = connection.createStatement();
	  	        String query = "update doctor set fullName='"+ fullName +"',pass='"+ pass +"',gender='"+ gender +"',specialist='"+ specialist +"',mobileNumber='"+ mobileNumber +"',place='"+ place +"',city='"+ city +"',country='"+ country +"',pincode='"+ pincode +"' where userName='"+userName;
	  	        statement.execute(query);
	  	        result.put("Status", "1");
			} catch (Exception e) {
				JSONObject error = new JSONObject();
        		error.put("Status","0");
        		error.put("Message","Internal Error");
        		return error;
				
			}
        	  return result;
  			
          }
          public JSONObject deleteDoctor(String userName)throws JSONException{
        	  JSONObject result = new JSONObject();
        	    try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
		  	        Statement statement = connection.createStatement();
		  	        String query = "delete from doctor where userName='"+ userName;
		  	        statement.execute(query);
		  	        result.put("Status", "1");
				} catch (Exception e) {
					
					JSONObject error = new JSONObject();
	        		error.put("Status","0");
	        		error.put("Message","Internal Error");
	        		return error;
				}
				
	  	        
        	  return result;
          }
          public JSONObject getDoctordetail(String userName)throws JSONException{
        	  JSONObject result = new JSONObject();
        	  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	  	        Statement statement = connection.createStatement();
	  	        String query = "select *from doctor where userName='"+userName;
	  	        ResultSet rs = statement.executeQuery(query);
	  	        if(rs.next()){
	  	        	result.put("fullName",rs.getString("fullName"));
	  	        	result.put("userName", rs.getString("userName"));
	  	        	result.put("gender", rs.getString("gender"));
	  	        	result.put("specialist", rs.getString("specialist"));
	  	        	result.put("mobileNumber", rs.getString("mobileNumber"));
	  	        	result.put("place", rs.getString("place"));
	  	        	result.put("city", rs.getString("city"));
	  	        	result.put("state", rs.getString("state"));
	  	        	result.put("country", rs.getString("country"));
	  	        	result.put("pincode", rs.getString("pincode"));
	  	        }
			} catch (Exception e) {
				JSONObject error = new JSONObject();
        		error.put("Status","0");
        		error.put("Message","Internal Error");
        		return error;
			}
				
        	  return result;
          }
          public JSONArray getAllDoctors()throws JSONException{
        	  JSONArray result = new JSONArray();
        	  try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
	  	        Statement statement = connection.createStatement();
	  	        String query = "select *from doctor";
	  	        ResultSet rs = statement.executeQuery(query);
	  	        if(rs.next()){
	  	        	JSONObject user = new JSONObject(); 
	  	        	user.put("fullName",rs.getString("fullName"));
	  	        	user.put("userName", rs.getString("userName"));
	  	        	user.put("gender", rs.getString("gender"));
	  	        	user.put("specialist", rs.getString("specialist"));
	  	        	user.put("mobileNumber", rs.getString("mobileNumber"));
	  	        	user.put("place", rs.getString("place"));
	  	        	user.put("city", rs.getString("city"));
	  	        	user.put("state", rs.getString("state"));
	  	        	user.put("country", rs.getString("country"));
	  	        	user.put("pincode", rs.getString("pincode"));
	  	        	result.put(user);
	  	        }
			} catch (Exception e) {
				JSONArray error = new JSONArray();
        		error.put("Internal Error");
        	  	return error;
			}
				
        	  return result;
          }
          public JSONObject addPatient(String fullName, String gender, String mobileNumber, String place, String city, String state, String country, String pincode) throws JSONException{
          	JSONObject result = new JSONObject(); 
          	try{
          	Class.forName("com.mysql.jdbc.Driver");
  			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
  	        Statement statement = connection.createStatement();
  	        String query = "Insert into patient(fullName,gender,mobileNumber,place,city,state,country,pincode) values('"+ fullName +"','"+ gender +"','"+ mobileNumber +"','"+ place +"','"+ city +"','"+ country +"','"+ pincode +"')";
  	        statement.execute(query);
  	        result.put("Status","1");
          	}catch(Exception e){
          		JSONObject error = new JSONObject();
          		error.put("Status","0");
          		error.put("Message","Internal Error");
          		return error;
          	}
          	return result;
            }
            public JSONObject updatePatient(int id,String fullName, String gender, String mobileNumber, String place, String city, String state, String country, String pincode) throws JSONException{
          	  JSONObject result = new JSONObject();
          	  try {
  				Class.forName("com.mysql.jdbc.Driver");
  				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
  	  	        Statement statement = connection.createStatement();
  	  	        String query = "update patient set fullName='"+ fullName +"',gender='"+ gender +"',mobileNumber='"+ mobileNumber +"',place='"+ place +"',city='"+ city +"',country='"+ country +"',pincode='"+ pincode +"' where id='"+id;
  	  	        statement.execute(query);
  	  	        result.put("Status", "1");
  			} catch (Exception e) {
  				JSONObject error = new JSONObject();
          		error.put("Status","0");
          		error.put("Message","Internal Error");
          		return error;
  				
  			}
          	  return result;
    			
            }
            public JSONObject deletePatient(int id)throws JSONException{
          	  JSONObject result = new JSONObject();
          	    try {
  					Class.forName("com.mysql.jdbc.Driver");
  					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
  		  	        Statement statement = connection.createStatement();
  		  	        String query = "delete from patient where id='"+ id;
  		  	        statement.execute(query);
  		  	        result.put("Status", "1");
  				} catch (Exception e) {
  					
  					JSONObject error = new JSONObject();
  	        		error.put("Status","0");
  	        		error.put("Message","Internal Error");
  	        		return error;
  				}
  				
  	  	        
          	  return result;
            }
            public JSONObject getPatientdetail(int id)throws JSONException{
          	  JSONObject result = new JSONObject();
          	  try {
  				Class.forName("com.mysql.jdbc.Driver");
  				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
  	  	        Statement statement = connection.createStatement();
  	  	        String query = "select *from patient where id='"+id;
  	  	        ResultSet rs = statement.executeQuery(query);
  	  	        if(rs.next()){
  	  	            result.put("id", rs.getInt("id"));
  	  	        	result.put("fullName",rs.getString("fullName"));
  	  	         	result.put("gender", rs.getString("gender"));
  	  	        	result.put("mobileNumber", rs.getString("mobileNumber"));
  	  	        	result.put("place", rs.getString("place"));
  	  	        	result.put("city", rs.getString("city"));
  	  	        	result.put("state", rs.getString("state"));
  	  	        	result.put("country", rs.getString("country"));
  	  	        	result.put("pincode", rs.getString("pincode"));
  	  	        }
  			} catch (Exception e) {
  				JSONObject error = new JSONObject();
          		error.put("Status","0");
          		error.put("Message","Internal Error");
          		return error;
  			}
  				
          	  return result;
            }
            public JSONArray getAllPatients()throws JSONException{
          	  JSONArray result = new JSONArray();
          	  try {
  				Class.forName("com.mysql.jdbc.Driver");
  				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "root");
  	  	        Statement statement = connection.createStatement();
  	  	        String query = "select *from patient";
  	  	        ResultSet rs = statement.executeQuery(query);
  	  	        if(rs.next()){
  	  	        	JSONObject patient = new JSONObject(); 
  	  	            patient.put("id", rs.getInt("id"));
  	  	        	patient.put("fullName",rs.getString("fullName"));
  	  	        	patient.put("gender", rs.getString("gender"));
  	  	        	patient.put("mobileNumber", rs.getString("mobileNumber"));
  	  	        	patient.put("place", rs.getString("place"));
  	  	        	patient.put("city", rs.getString("city"));
  	  	        	patient.put("state", rs.getString("state"));
  	  	        	patient.put("country", rs.getString("country"));
  	  	        	patient.put("pincode", rs.getString("pincode"));
  	  	        	result.put(patient);
  	  	        }
  			} catch (Exception e) {
  				JSONArray error = new JSONArray();
          		error.put("Internal Error");
          	  	return error;
  			}
  				
          	  return result;
            }
}
