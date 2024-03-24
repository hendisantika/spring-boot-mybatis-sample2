CREATE TABLE if NOT EXISTS `T_TODO`
(
    `id`
    INTEGER
    PRIMARY
    KEY,
    `title`
    VARCHAR
(
    100
) NOT NULL,
    `body` VARCHAR
(
    2000
) NOT NULL
    );
