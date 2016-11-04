
create database hospitalmanagement;
 

   userRegister
   
        create table user(userId int UNIQUE AUTO_INCREMENT,
        fullName varchar(255),
        userName varchar(255) PRIMARY KEY,
        pass varchar(255),
        gender varchar(255),
        mobileNumber varchar(255),
        place varchar(255),
        city varchar(255),
        state varchar(255),
        country varchar(255),
        pincode varchar(255));
        
    doctorRegister
        
        create table doctor(id int UNIQUE AUTO_INCREMENT,
          fullName varchar(255),
          user varchar(255) PRIMARY KEY,
          pass varchar(255),
          gender varchar(255),
          specialist varchar(255),
          mobileNumber varchar(255),
          place varchar(255),
          city varchar(255),
          state varchar(255),
          country varchar(255),
          pincode varchar(255));
          
    patientRegister
    
         create table patient(id int PRIMARY KEY AUTO_INCREMENT,
         fullName varchar(255),
         gender varchar(255),
         mobileNumber varchar(255),
         place varchar(255),
         city varchar(255),
         state varchar(255),
         country varchar(255),            
         pincode varchar(255));