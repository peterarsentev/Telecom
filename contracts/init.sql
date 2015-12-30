CREATE TABLE role (
 id  serial,
 name  VARCHAR(45) NOT NULL,
 PRIMARY KEY ( id )
);

CREATE TABLE client (
 client_id  serial,
 role  INT NOT NULL,
 name  VARCHAR(45) NOT NULL,
 family  VARCHAR(45) NOT NULL,
 berthdate  VARCHAR(45) NOT NULL,
 passport  VARCHAR(45) NOT NULL,
 adress  VARCHAR(45) NOT NULL,
 password  VARCHAR(45) NULL DEFAULT NULL,
 email  VARCHAR(45) NULL DEFAULT NULL,
 PRIMARY KEY ( client_id ),

 CONSTRAINT fk_client_role  FOREIGN KEY ( role ) REFERENCES role  ( id )
);
