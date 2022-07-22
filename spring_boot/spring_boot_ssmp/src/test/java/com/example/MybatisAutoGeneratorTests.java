package com.example;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@PropertySource("classpath:application.yml")
class MybatisAutoGeneratorTests {
//
//    @Value("${spring.dataSource.url}")
    public String url;
//    @Value("${spring.dataSource.username}")
    public String username;
//    @Value("${spring.dataSource.password}")
    public String password;

    @Test
    void testFastAutoGenerator() {
        url = "jdbc:mysql://localhost:3306/spring_db?serverTimezone=UTC";
        username= "root";
        password = "123456";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("example")
                            .disableOpenDir()
                            .outputDir("src/main/java");
                })
                .packageConfig(builder -> {
                    builder.parent("com.example");
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user", "book")
                            .controllerBuilder()
                            .enableRestStyle()
                            .enableHyphenStyle()
                            .entityBuilder()
                            .enableLombok()
                            .mapperBuilder()
                            .mapperAnnotation(Mapper.class);
                })
                .execute();

    }
}

