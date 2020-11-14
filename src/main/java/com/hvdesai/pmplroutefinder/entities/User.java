package com.hvdesai.pmplroutefinder.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_details")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class User {

    @Id
    @Column(name = "u_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uId;

    @Column(name = "name")
    private String name;

    @Column(name = "email_id", unique = true)
    private String emailId;

    @Column(name = "mobile_no", unique = true)
    private String mobileNo;

    @Column(name = "password")
    private String password;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

}
