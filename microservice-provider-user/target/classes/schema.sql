DROP TABLE IF EXISTS USER ;
CREATE TABLE USER(
  id int(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(40),
  username VARCHAR(40),
  age int(3),
  balance DECIMAL
);
