package com.saitej.springdatajpahibernateinheritance;

import com.saitej.springdatajpahibernateinheritance.entities.Check;
import com.saitej.springdatajpahibernateinheritance.entities.CreditCard;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDataJpaHibernateinheritanceApplicationTests {

    @Autowired
    private PaymentRepository paymentRepository;

    @Test
    void contextLoads() {
    }


    @Test
    void testCreatePayment() {
        CreditCard cc = new CreditCard();
        cc.setId(126);
        cc.setAmount(1000);
        cc.setCardnumber("123455345");
        paymentRepository.save(cc);
    }

    @Test
    void testCheckPayment() {
        Check ch = new Check();
        ch.setId(124);
        ch.setAmount(1000);
        ch.setChecknumber("123455345");
        paymentRepository.save(ch);
        assertNotNull(ch);

    }
}