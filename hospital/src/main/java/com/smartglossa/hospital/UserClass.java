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
}
