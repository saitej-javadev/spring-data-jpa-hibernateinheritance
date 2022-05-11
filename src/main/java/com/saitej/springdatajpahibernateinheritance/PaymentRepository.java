package com.saitej.springdatajpahibernateinheritance;

import com.saitej.springdatajpahibernateinheritance.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer> {
}
