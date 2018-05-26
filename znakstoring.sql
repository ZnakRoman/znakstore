DROP DATABASE IF EXISTS znakstoring;
CREATE DATABASE znakstoring;
USE znakstoring;

CREATE TABLE users(
	id INT AUTO_INCREMENT,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(63) NOT NULL,
    firstname VARCHAR(50) NOT NULL,
    surname VARCHAR(50) NOT NULL,
    role VARCHAR(10) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tickets(
	id INT(11) AUTO_INCREMENT,
    aircompany VARCHAR(30) NOT NULL,
    begin_city VARCHAR(30) NOT NULL,
    begin_country VARCHAR(30) NOT NULL,
    end_city VARCHAR(30) NOT NULL,
    end_country VARCHAR(30) NOT NULL,
    data_of_flight VARCHAR(50) NOT NULL,
    time VARCHAR(10) NOT NULL,
    count_of_tickets INT(5) NOT NULL,
    price_USD INT(11) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE users_tickets(
	users_id INT(11) NOT NULL,
    tickets_id INT(11) NOT NULL
);

DROP TABLE tickets;
DROP TABLE req_tic;

INSERT INTO users(email, password, firstname, surname, role) VALUES ('qwert@gmail.com', '76335', 'July', 'Caesar', 'user');
INSERT INTO users(email, password, firstname, surname, role) VALUES ('dfghs@gmail.com', '76795', 'Jack', 'London', 'user');
INSERT INTO users(email, password, firstname, surname, role) VALUES ('lkjhg@gmail.com', '13876', 'Vladimir', 'Lenin', 'user');
INSERT INTO users(email, password, firstname, surname, role) VALUES ('hdgjt@gmail.com', '76335', 'Mikhailo', 'Lomonosoff', 'user');
INSERT INTO users(email, password, firstname, surname, role) VALUES ('poiuy@gmail.com', '76335', 'Mark', 'Markoff', 'user');

UPDATE users SET role = 'admin' WHERE email = 'qwert@gmail.com';
UPDATE users SET role = 'manager' WHERE email = 'dfghs@gmail.com';

INSERT INTO tickets(aircompany, begin_city, begin_country, end_city, end_country, data_of_flight, time, count_of_tickets, price_USD) VALUES ('Alitalia', 'Rome', 'Italy', 'Paris', 'France', '05:19','24-12-2018', 100, 400);
INSERT INTO tickets(aircompany, begin_city, begin_country, end_city, end_country, data_of_flight, time, count_of_tickets, price_USD) VALUES ('ABX_air', 'New York', 'USA', 'Berlin', 'Germany', '15:25','09-09-2018', 100, 800);
INSERT INTO tickets(aircompany, begin_city, begin_country, end_city, end_country, data_of_flight, time, count_of_tickets, price_USD) VALUES ('Iberia_Airlines','Beograd', 'Serbia', 'Madrid', 'Spain', '09:20', '29-04-2018',100, 500);
DELETE FROM tickets WHERE (id = 3);

CREATE TABLE requests(
	id INT(11) AUTO_INCREMENT,
	sender_id INT(11) NOT NULL,
	recipient_id INT(11) NOT NULL,
	req_tic_id INT(11) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE req_tic(
    id INT(11) AUTO_INCREMENT,
    aircompany VARCHAR(30) NOT NULL,
    begin_city VARCHAR(30) NOT NULL,
    begin_country VARCHAR(30) NOT NULL,
    end_city VARCHAR(30) NOT NULL,
    end_country VARCHAR(30) NOT NULL,
    data_of_flight VARCHAR(50) NOT NULL,
    time VARCHAR(10) NOT NULL,
    count_of_tickets INT(5) NOT NULL,
    price_USD INT(11) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO req_tic(aircompany, begin_city, begin_country, end_city, end_country, data_of_flight, time, count_of_tickets, price_USD) VALUES ('Iberia_Airlines', 'Madrid', 'Spain', 'Paris', 'France', '11:25','28-12-2018', 90, 350);
INSERT INTO req_tic(aircompany, begin_city, begin_country, end_city, end_country, data_of_flight, time, count_of_tickets, price_USD) VALUES ('Flybe', 'London', 'UK', 'Rio de Janeiro', 'Brazil', '13:35','10-11-2018', 100, 800);
INSERT INTO req_tic(aircompany, begin_city, begin_country, end_city, end_country, data_of_flight, time, count_of_tickets, price_USD) VALUES ('Turkish_Airlines', 'Beograd', 'Serbia', 'Istambul', 'Turkey', '29-05-2018', '10:20', 100, 100);

INSERT INTO requests(sender_id, recipient_id, req_tic_id) VALUES (2, 1, 1);
INSERT INTO requests(sender_id, recipient_id, req_tic_id) VALUES (2, 1, 2);
INSERT INTO requests(sender_id, recipient_id, req_tic_id) VALUES (2, 1, 3);


    