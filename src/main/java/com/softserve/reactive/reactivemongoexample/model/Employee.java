package com.softserve.reactive.reactivemongoexample.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
@Data
public class Employee {

    @Id
    private String id;
    private String name;
    private Long salary;
}
