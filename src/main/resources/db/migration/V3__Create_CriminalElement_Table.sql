DROP TABLE IF EXISTS `criminal_elements`;

CREATE TABLE `criminal_elements` (
    `id` BINARY(16) NOT NULL,
    `subjective_element_description` VARCHAR(255) DEFAULT NULL,
    `objective_element_description` VARCHAR(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);