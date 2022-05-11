package com.saitej.springdatajpahibernateinheritance.entities;



import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {

    @Id
    private int id;
    private  double amount;
}
