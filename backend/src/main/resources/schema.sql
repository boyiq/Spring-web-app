create database houses;

use houses;

CREATE TABLE IF NOT EXISTS sales (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    beds INT,
    baths INT,
    size INT,
    zipcode VARCHAR(10),
    price INT
);

