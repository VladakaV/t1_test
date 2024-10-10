package ru.t1.java.demo.model;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.math.BigDecimal;

@Entity
public class Account extends AbstractPersistable<Long> {

    private Long id;

    private TypeEnum type;

    private BigDecimal balance;

}
