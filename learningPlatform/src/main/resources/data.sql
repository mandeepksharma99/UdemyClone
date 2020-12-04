DROP TABLE IF EXISTS instructor;
DROP TABLE IF EXISTS instructor_detail;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS student_detail;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250),
  student_detail_id  INT
);

CREATE TABLE student_detail (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  gender int,
  course int
);

ALTER TABLE student
    ADD FOREIGN KEY (student_detail_id)
    REFERENCES student_detail(ID);

CREATE TABLE instructor (
  id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250),
  instructor_detail_id int
);

CREATE TABLE instructor_detail (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  gender int,
  county int,
  date_of_birth date
);

ALTER TABLE instructor
    ADD FOREIGN KEY (instructor_detail_id)
    REFERENCES instructor_detail(id);

