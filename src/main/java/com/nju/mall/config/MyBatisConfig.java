package com.nju.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.nju.mall.mbg.mapper","com.nju.mall.dao"})
public class MyBatisConfig {

}
