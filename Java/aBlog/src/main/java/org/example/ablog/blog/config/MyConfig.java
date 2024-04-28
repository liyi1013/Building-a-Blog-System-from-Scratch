package org.example.ablog.blog.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration  // 表示是配置类
@EnableConfigurationProperties(MyProperty.class)  // 开启属性注入
public class MyConfig {
    private final MyProperty myProperty;

    // 单参数构造方法，从容器中注入参数
    public MyConfig(MyProperty myProperty) {
        this.myProperty = myProperty;
    }

    public MyProperty getMyProperty() {
        return myProperty;
    }
}
