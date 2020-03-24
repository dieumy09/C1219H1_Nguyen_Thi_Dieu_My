-- MySQL dump 10.13  Distrib 8.0.13, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `author` (
  `author_id` int NOT NULL,
  `author_name` varchar(50) DEFAULT NULL,
  `author_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`author_id`),
  UNIQUE KEY `author_id` (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Stephen Hawking','England'),(2,'Andy Weir','USA'),(3,'Victor Hugo','France'),(4,'Paulo Coelho','Brazil'),(5,'Michael Greger','USA'),(6,'Satoru Tsubota','USA'),(7,'Benjamin Loh','England'),(8,'Laurie Scheneider','USA'),(9,'Yuval Noah Harari','Israel'),(10,'Larry Gonick','USA');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `book_id` int NOT NULL,
  `book_name` varchar(50) DEFAULT NULL,
  `publishing_year` varchar(4) DEFAULT NULL,
  `quanity` int DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `author_id` int DEFAULT NULL,
  `publishing_id` int DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `type_id` (`type_id`),
  KEY `author_id` (`author_id`),
  KEY `publishing_id` (`publishing_id`),
  CONSTRAINT `book_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `booktype` (`type_id`),
  CONSTRAINT `book_ibfk_2` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`),
  CONSTRAINT `book_ibfk_3` FOREIGN KEY (`publishing_id`) REFERENCES `publishing` (`publishing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `books` (
  `book_id` int NOT NULL,
  `book_name` varchar(50) DEFAULT NULL,
  `publishing_year` varchar(4) DEFAULT NULL,
  `quanity` int DEFAULT NULL,
  `type_id` int DEFAULT NULL,
  `author_id` int DEFAULT NULL,
  `publishing_id` int DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `type_id` (`type_id`),
  KEY `author_id` (`author_id`),
  KEY `publishing_id` (`publishing_id`),
  CONSTRAINT `books_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `booktype` (`type_id`),
  CONSTRAINT `books_ibfk_2` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`),
  CONSTRAINT `books_ibfk_3` FOREIGN KEY (`publishing_id`) REFERENCES `publishing` (`publishing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (1,'Chia khoa vu tru George','2007',2,1,1,1),(2,'Ke giau mat ngoai hanh tinh','2009',1,1,1,1),(3,'George va vu no Big Bang','2016',2,1,1,1),(4,'Nguoi ve tu sao hoa','2015',2,1,2,2),(5,'Artemis','2017',1,1,2,1),(6,'Nhung nguoi khon kho','1962',5,2,3,1),(7,'Ngay cuoi cung cua mot tu tu','1970',5,2,3,1),(8,'Lao dong va bien ca','1969',4,2,3,1),(9,'Nha gia Kim','1988',9,2,4,1),(10,'An gi khong chet','2018',3,3,5,3),(11,'Ngu it van khoe','2017',3,3,6,3),(12,'Nghe thuat truyen cam hung','2018',5,4,7,4),(13,'Dan nhap vao nghe thuat','2019',3,4,8,3),(14,'Luoc su loai nguoi','2019',10,5,9,5),(15,'Luoc su tuong lai','2019',5,5,9,6),(16,'Cau chuyen giai tich','2018',5,6,10,6),(17,'Cau chuyen dai so','2018',5,6,10,3);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booktype`
--

DROP TABLE IF EXISTS `booktype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `booktype` (
  `type_id` int NOT NULL,
  `type_name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`type_id`),
  UNIQUE KEY `type_id` (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booktype`
--

LOCK TABLES `booktype` WRITE;
/*!40000 ALTER TABLE `booktype` DISABLE KEYS */;
INSERT INTO `booktype` VALUES (1,'Khoa hoc'),(2,'Van Hoc'),(3,'Y Hoc'),(4,'Nghe Thuat'),(5,'Lich Su'),(6,'Toan Hoc');
/*!40000 ALTER TABLE `booktype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publishing`
--

DROP TABLE IF EXISTS `publishing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `publishing` (
  `publishing_id` int NOT NULL,
  `publishing_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`publishing_id`),
  UNIQUE KEY `publishing_id` (`publishing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publishing`
--

LOCK TABLES `publishing` WRITE;
/*!40000 ALTER TABLE `publishing` DISABLE KEYS */;
INSERT INTO `publishing` VALUES (1,'NXB Van Hoc'),(2,'NXB NXB Kim Dong'),(3,'NXB Tre'),(4,'NXB Thanh Nien'),(5,'NXB Tri Thuc'),(6,'NXB The Gioi');
/*!40000 ALTER TABLE `publishing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rent`
--

DROP TABLE IF EXISTS `rent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `rent` (
  `rent_id` int NOT NULL,
  `rent_date` date DEFAULT NULL,
  `pay_date` date DEFAULT NULL,
  `number_date` int NOT NULL,
  `student_id` int DEFAULT NULL,
  `book_id` int DEFAULT NULL,
  PRIMARY KEY (`rent_id`),
  KEY `student_id` (`student_id`),
  KEY `book_id` (`book_id`),
  CONSTRAINT `rent_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `students` (`student_id`),
  CONSTRAINT `rent_ibfk_2` FOREIGN KEY (`book_id`) REFERENCES `books` (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rent`
--

LOCK TABLES `rent` WRITE;
/*!40000 ALTER TABLE `rent` DISABLE KEYS */;
/*!40000 ALTER TABLE `rent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `students` (
  `student_id` int NOT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `student_birthday` date DEFAULT NULL,
  `student_address` varchar(50) DEFAULT NULL,
  `student_email` varchar(50) DEFAULT NULL,
  `student_phonenumber` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Nguyen Thi Dieu My','1997-09-09','Quang Nam','my@gmail.com','0123456789'),(2,'Nguyen Huu Tho','1999-12-06','Quang Tri','tho@gmail.com','1234567890'),(3,'Tran Van Thuan','1999-01-01','Da Nang','thuan@gmail.com','2345678901'),(4,'Nguyen Ha Nguyen','1998-01-01','Da Nang','nguyen@gmail,com','3456789012'),(5,'Phan Thi My Tinh','1995-08-01','Da Nang','tinh@gmail.com','4567890123');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-18 18:45:21
