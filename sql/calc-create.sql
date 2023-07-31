CREATE DATABASE IF NOT EXISTS `aiful`;
USE `aiful`;

--
-- Table structure for table `personal_information`
--
DROP TABLE IF EXISTS `personal_information`;

CREATE TABLE `personal_information` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(50) DEFAULT NULL,
  `email` VARCHAR(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

--
-- Table structure for table `equation_log`
--
DROP TABLE IF EXISTS `equation_log`;

CREATE TABLE `equation_log` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `personal_id` INT DEFAULT NULL,
  `equation` VARCHAR(255) DEFAULT NULL,
  `result` VARCHAR(45) DEFAULT NULL,
  `summit_date` DATETIME DEFAULT CURRENT_TIMESTAMP,
  INDEX `idx_personal_id` (`personal_id`), -- Add an index for the foreign key column
  PRIMARY KEY (`id`),
  FOREIGN KEY (`personal_id`) REFERENCES `personal_information` (`id`) -- Reference the `id` column in `equation_log`
);
