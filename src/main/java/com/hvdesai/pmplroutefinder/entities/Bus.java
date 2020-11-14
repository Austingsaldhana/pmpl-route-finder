package com.hvdesai.pmplroutefinder.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bus")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
public class Bus {

    @Id
    @Column(name = "b_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bId;

    @Column(name = "name")
    private String name;

    @Column(name = "vehicle_no", unique = true)
    private String vehicleNo;

    @Column(name = "bus_no", unique = true)
    private String  busNo;

    @Column(name = "bus_type")
    private String busType;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "color")
    private String color;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

}
