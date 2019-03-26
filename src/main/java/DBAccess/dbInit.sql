CREATE DATABASE  IF NOT EXISTS `useradmin`;


USE `useradmin`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(90) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES 
(1,'jens@somewhere.com','jensen','customer'),
(2,'ken@somewhere.com','kensen','customer'),
(3,'robin@somewhere.com','batman','employee');
UNLOCK TABLES;


DROP TABLE IF EXISTS 'previousorders';
CREATE TABLE 'previousorders';
(
'orderID'      int(11) NOT NULL AUTO_INCREMENT,
'totalBricks'  int(11) NOT NULL,
PRIMARIY KEY ('orderID'),
UNIQUE KEY 'orderID_UNIQUE' ('orderID')
)ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;


