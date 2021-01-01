DROP TABLE IF EXISTS user_registration.user;

CREATE TABLE user_registration.user (
  username VARCHAR(45) NOT NULL,
  password VARCHAR(45) NULL,
  firstname VARCHAR(45) NOT NULL,
  lastname VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  address VARCHAR(45) NULL,
  phone INT NULL,
PRIMARY KEY (username));


INSERT INTO user(username, password, firstname, lastname, email, address, phone) VALUES('Harish','Hari@123','Shah','User','harish@gmail.com','Mumbai',829168151); 
