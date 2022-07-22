create database spring_db default character set utf8mb4 collate utf8mb4_unicode_ci;
CREATE TABLE `users` (
                            `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                            `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
                            `password` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
insert into users (name, password)values ('zhangsan', '123456');
insert into users (name, password)values ('lisi', '123456');