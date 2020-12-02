DROP TABLE IF EXISTS instructor;

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

