package com.zwz.springbootweb.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "ball")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ball {
    private  Double price;
    private String ballName;
    private List<String> ballNames;
    private Map<String,List<Ball>>  allBalls;
}
