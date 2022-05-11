package com.saitej.springdatajpahibernateinheritance.entities;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
public class CreditCard extends Payment{
    private String cardnumber;
}
