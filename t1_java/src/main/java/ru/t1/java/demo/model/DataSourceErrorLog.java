package ru.t1.java.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Getter
@Setter
public class DataSourceErrorLog extends AbstractPersistable<Long> {

    @Column(columnDefinition = "TEXT")
    private String stackTrace;

    private String message;

    private String methodSignature;

}

