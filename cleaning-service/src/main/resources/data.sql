CREATE DATABASE IF NOT EXISTS cleaning_service /*!40100 DEFAULT CHARACTER SET latin1 */;
USE cleaning_service;
CREATE TABLE IF NOT EXISTS user (
  id int(6) unsigned NOT NULL AUTO_INCREMENT,
  username varchar(30) NOT NULL,
  password varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
