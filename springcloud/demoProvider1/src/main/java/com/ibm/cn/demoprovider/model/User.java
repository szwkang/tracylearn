package com.ibm.cn.demoprovider.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
/*import org.springframework.cloud.context.config.annotation.RefreshScope;*/
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "user")
@RefreshScope
public class User {
    String name;
    String sex;
    int age;
    String phone;
}
