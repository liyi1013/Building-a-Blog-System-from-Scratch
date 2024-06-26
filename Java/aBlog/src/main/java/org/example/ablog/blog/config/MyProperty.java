package org.example.ablog.blog.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

// 属性注入
@ConfigurationProperties(prefix = "my") // 前缀
public class MyProperty {

    // 配置项，不应该改变
    // 但是一些框架中 如 HttpEncodingAutoConfiguration ，里面就没对属性设置为final
    private  String name = "default";
    private  String age = "default";
    private  String sex = "default";

    // 构造方法, 自动注入
//    public MyProperty(String name, String age, String sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
        public MyProperty() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "MyProperty{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
