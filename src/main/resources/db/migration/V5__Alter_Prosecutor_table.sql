ALTER TABLE `prosecutor`
ADD (`age` INT(3) DEFAULT 0,
    `sex` VARCHAR(5) DEFAULT NULL,
    `birthday` date DEFAULT NULL,
    `id_number` VARCHAR(255) DEFAULT NULL,
    `experience` VARCHAR(255) DEFAULT NULL);