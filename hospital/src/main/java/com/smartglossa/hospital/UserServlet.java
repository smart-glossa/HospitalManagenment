package com.smartglossa.hospital;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String operation = req.getParameter("operation");
		UserClass userObject = new UserClass();
		if(operation.equals("1")){
			String fullName = req.getParameter("fullName");
			String userName = req.getParameter("userName");
			String pass = req.getParameter("pass");
			String gender = req.getParameter("gender");
			String mobileNumber = req.getParameter("mobileNumber");
			String place = req.getParameter("place");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String country = req.getParameter("country");
			String pincode = req.getParameter("pincode");
			
			JSONObject result;
			try {
				result = userObject.addUser(fullName, userName, pass, gender, mobileNumber, place, city, state, country, pincode);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(operation.equals("2")){
			String fullName = req.getParameter("fullName");
			String userName = req.getParameter("userName");
			String pass = req.getParameter("pass");
			String gender = req.getParameter("gender");
			String mobileNumber = req.getParameter("mobileNumber");
			String place = req.getParameter("place");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String country = req.getParameter("country");
			String pincode = req.getParameter("pincode");
			
			JSONObject result;
			try {
				result = userObject.updateUser(fullName, userName, pass, gender, mobileNumber, place, city, state, country, pincode);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(operation.equals("3")){
			String userName =req.getParameter("userName");
			
			JSONObject result;
			try {
				result = userObject.deleteUser(userName);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(operation.equals("4")){
			String userName = req.getParameter("userName");
			
			JSONObject result;
			try {
				result = userObject.getUserdetail(userName);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(operation.equals("5")){
			JSONArray result;
			try {
				result = userObject.getAllUsers();
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					
		}else if(operation.equals("6")){
			String fullName = req.getParameter("fullName");
			String userName = req.getParameter("userName");
			String pass = req.getParameter("pass");
			String gender = req.getParameter("gender");
			String specialist = req.getParameter("specialist");
			String mobileNumber = req.getParameter("mobileNumber");
			String place = req.getParameter("place");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String country = req.getParameter("country");
			String pincode = req.getParameter("pincode");
			
			JSONObject result;
			try {
				result = userObject.addDoctor(fullName, userName, pass, gender, specialist, mobileNumber, place, city, state, country, pincode);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(operation.equals("7")){
			String fullName = req.getParameter("fullName");
			String userName = req.getParameter("userName");
			String pass = req.getParameter("pass");
			String gender = req.getParameter("gender");
			String specialist = req.getParameter("specialist");
			String mobileNumber = req.getParameter("mobileNumber");
			String place = req.getParameter("place");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String country = req.getParameter("country");
			String pincode = req.getParameter("pincode");
			
			JSONObject result;
			try {
				result = userObject.updateDoctor(fullName, userName, pass, gender, specialist, mobileNumber, place, city, state, country, pincode);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(operation.equals("8")){
			String userName =req.getParameter("userName");
			
			JSONObject result;
			try {
				result = userObject.deleteDoctor(userName);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(operation.equals("9")){
			String userName = req.getParameter("userName");
			
			JSONObject result;
			try {
				result = userObject.getDoctordetail(userName);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(operation.equals("10")){
			JSONArray result;
			try {
				result = userObject.getAllDoctors();
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					
		
		}else if(operation.equals("11")){
			String fullName = req.getParameter("fullName");
		    String gender = req.getParameter("gender");
		    String mobileNumber = req.getParameter("mobileNumber");
			String place = req.getParameter("place");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String country = req.getParameter("country");
			String pincode = req.getParameter("pincode");
			
			JSONObject result;
			try {
				result = userObject.addPatient(fullName, gender, mobileNumber, place, city, state, country, pincode);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(operation.equals("12")){
			int id = Integer.parseInt(req.getParameter("id"));
			String fullName = req.getParameter("fullName");
			String gender = req.getParameter("gender");
			String mobileNumber = req.getParameter("mobileNumber");
			String place = req.getParameter("place");
			String city = req.getParameter("city");
			String state = req.getParameter("state");
			String country = req.getParameter("country");
			String pincode = req.getParameter("pincode");
			
			JSONObject result;
			try {
				result = userObject.updatePatient(id, fullName, gender, mobileNumber, place, city, state, country, pincode);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(operation.equals("13")){
			int id = Integer.parseInt(req.getParameter("id"));
			
			JSONObject result;
			try {
				result = userObject.deletePatient(id);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(operation.equals("14")){
			int id = Integer.parseInt(req.getParameter("id"));
			
			JSONObject result;
			try {
				result = userObject.getPatientdetail(id);
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(operation.equals("15")){
			JSONArray result;
			try {
				result = userObject.getAllPatients();
				res.getWriter().print(result);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
					
		
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
