DROP TABLE IF EXISTS `c`;

CREATE TABLE `criminal_elements` (
    `id` BINARY(16) NOT NULL,
    `subjective_element_description` VARCHAR(255) DEFAULT NULL,
    `objective_element_description` VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);