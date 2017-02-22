CREATE DATABASE `interview`;

USE `interview`;

CREATE TABLE `interview`.`orders` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `orders_index` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `orders_index_UNIQUE` (`orders_index` ASC));

INSERT INTO `interview`.`orders` (`id`, `name`, `orders_index`) VALUES ('1', 'test1', '3');
INSERT INTO `interview`.`orders` (`id`, `name`, `orders_index`) VALUES ('2', 'test2', '6');
INSERT INTO `interview`.`orders` (`id`, `name`, `orders_index`) VALUES ('3', 'test3', '5');
INSERT INTO `interview`.`orders` (`id`, `name`, `orders_index`) VALUES ('4', 'test4', '2');
INSERT INTO `interview`.`orders` (`id`, `name`, `orders_index`) VALUES ('5', 'test5', '1');
INSERT INTO `interview`.`orders` (`id`, `name`, `orders_index`) VALUES ('6', 'test6', '4');



CREATE TABLE `interview`.`duplicates` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  `enabled` BIT(1) NOT NULL,
  PRIMARY KEY (`id`));

INSERT INTO `interview`.`duplicates` (`id`, `name`, `description`, `enabled`) VALUES ('1', 'test', 'desc1', b'1');
INSERT INTO `interview`.`duplicates` (`id`, `name`, `description`, `enabled`) VALUES ('2', 'test', 'desc2', b'1');
INSERT INTO `interview`.`duplicates` (`id`, `name`, `description`, `enabled`) VALUES ('3', 'test', 'desc3', b'1');
