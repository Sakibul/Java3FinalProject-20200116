CREATE DATABASE IF NOT EXISTS ScheduleDB;

USE ScheduleDB;
-------------------------------------------------------------
DROP TABLE IF EXISTS Appointment;
CREATE TABLE Appointment
(
	id INT NOT NULL AUTO_INCREMENT,
	appDate VARCHAR(255),
	appTime VARCHAR(255),
	ssn INT,
	PRIMARY KEY(id)
);
DESCRIBE Appointment;
-------------------------------------------------------------
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '09:00', 1234);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '10:00', 2345);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '11:00', 3456);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '12:00', 4567);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '13:00', 5678);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '14:00', 6789);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '15:00', 7890);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '16:00', 8901);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '17:00', 9012);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '18:00', 4321);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '19:00', 5432);
insert into Appointment (appDate, appTime, ssn) values('2019-01-16', '20:00', 6543);
-------------------------------------------------------------