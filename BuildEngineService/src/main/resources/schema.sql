DROP TABLE IF EXISTS TBL_TASKS;
  
CREATE TABLE TBL_TASKS (
  id INT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  constraint_Type VARCHAR(250) NOT NULL,
  parent_Id INT NOT NULL DEFAULT 0,
  predecessor_Id INT NOT NULL DEFAULT 0
);

DROP TABLE IF EXISTS TBL_JSON_GRAPHS;
  
CREATE TABLE TBL_JSON_GRAPHS (
  id INT  PRIMARY KEY,
  json CLOB NOT NULL
);