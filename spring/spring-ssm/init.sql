create database spring_db default character set utf8mb4 collate utf8mb4_unicode_ci;
CREATE TABLE `books` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `type` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
                            `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
                            `description` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
