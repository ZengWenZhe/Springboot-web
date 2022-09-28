package com.zwz.springbootweb.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
@ConfigurationProperties(prefix="person")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private String name;
    private Integer age;
    private Date birth;
    private List<Integer> score;
    private List<String> girlfriends;
}
