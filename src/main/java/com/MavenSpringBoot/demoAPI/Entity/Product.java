package com.MavenSpringBoot.demoAPI.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    private String sku;
    private String name;
    private String description;
    private boolean active;
    private String imageUrl;
    @CreationTimestamp
    private LocalDateTime datecreated;
    @UpdateTimestamp
    private LocalDateTime dateUpdated;

}
