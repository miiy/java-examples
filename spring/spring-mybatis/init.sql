create database spring_db default character set utf8mb4 collate utf8mb4_unicode_ci;
CREATE TABLE `accounts` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
                            `money` double COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 0,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
insert into accounts (name, money)values (''zhangsan'', 100);