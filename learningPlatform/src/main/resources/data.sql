DROP TABLE IF EXISTS instructor;
DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250),
  student_detail_id  INT,
  constraint foreign key student_detail_id references student_detail(id)
);

CREATE TABLE student_detail (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  gender int,
  course int
);

CREATE TABLE instructor (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250),
  instructor_detail_id  int,
  constraint foreign key instructor_detail_id references instructor_detail(id)

);

CREATE TABLE instructor_detail (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  gender int,
  county int,
  date_of_birth date
);
