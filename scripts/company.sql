-- Create Posgresql table with ID, name.
CREATE TABLE Gender(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) UNIQUE NOT NULL
);

-- Create Posgresql table with ID, name, salary.
CREATE TABLE Job(
  id SERIAL PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  salary NUMERIC(9,2) NOT NULL
);

-- Create Posgresql table with ID, gender_id, job_id name, last_name, birthdate with  primary key and unique index on name and last_name.
CREATE TABLE Employee(
  id SERIAL PRIMARY KEY,
  gender_id INTEGER NOT NULL,
  job_id INTEGER NOT NULL,
  name VARCHAR(255) UNIQUE NOT NULL,
  last_name VARCHAR UNIQUE NOT NULL,
  birthdate DATE NOT NULL,
  FOREIGN KEY (gender_id) REFERENCES Gender(id),
  FOREIGN KEY (job_id) REFERENCES Job(id)
);

-- create employee_worked_hours table with id, employee_id, worked_hours and worked_date.
CREATE TABLE Employee_worked_hours(
  id SERIAL PRIMARY KEY,
  employee_id INTEGER NOT NULL,
  worked_hours NUMERIC NOT NULL,
  worked_date DATE NOT NULL,
  FOREIGN KEY (employee_id) REFERENCES Employee(id)
);