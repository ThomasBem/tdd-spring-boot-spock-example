package com.github.temperature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "temperature", schema = "tdd")
public class Temperature {
    private String city;
    private Integer temperature;
    @Id
    private String timestamp;
}
