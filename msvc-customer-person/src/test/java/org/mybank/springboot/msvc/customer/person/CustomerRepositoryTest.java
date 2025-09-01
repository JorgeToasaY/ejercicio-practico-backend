package org.mybank.springboot.msvc.customer.person;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybank.springboot.msvc.customer.person.entity.Customer;
import org.mybank.springboot.msvc.customer.person.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class CustomerRepositoryTest {
    @Autowired
    CustomerRepository repo;

    @Test
    void shouldSaveAndFindByCustomerId() {
        Customer c = new Customer();
        c.setName("Ana"); c.setGender("F"); c.setAge(30);
        c.setIdentification("123002"); c.setCustomerId("C-002");
        c.setPassword("12345"); c.setState(true);
        repo.save(c);
        assertTrue(repo.findByCustomerId("C-002").isPresent());
    }
}