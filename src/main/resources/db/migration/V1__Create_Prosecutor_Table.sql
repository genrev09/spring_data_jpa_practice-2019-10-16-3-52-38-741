DROP TABLE IF EXISTS `prosecutor`;

CREATE TABLE `prosecutor` (
    `id` BINARY(16) NOT NULL,
    `name` VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);