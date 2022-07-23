package com.example;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisAutoGeneratorTests {
//
    @Value("${spring.datasource.url}")
    public String url;
    @Value("${spring.datasource.username}")
    public String username;
    @Value("${spring.datasource.password}")
    public String password;

    @Test
    void testFastAutoGenerator() {

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

