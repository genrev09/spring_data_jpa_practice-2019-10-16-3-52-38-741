DROP TABLE IF EXISTS `criminal_case`;

CREATE TABLE `criminal_case` (
    `id` BINARY(16) NOT NULL,
    `name` VARCHAR(255) DEFAULT NULL,
    `time` date DEFAULT NULL,
    `element_id` BINARY(16) NOT NULL,
    `procuratorate_id` BINARY(16) NOT NULL,
    PRIMARY KEY (`id`)
);