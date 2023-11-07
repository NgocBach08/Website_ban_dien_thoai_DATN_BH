package com.example.demo.entity;

import javax.persistence.*;

/**
 * Description:
 *
 * @author: hieu
 * @since: 29/06/2022
 * Project_name: IntelliJ IDEA
 */
@Entity
@Table(name = "chip", schema = "world_phone", catalog = "")
public class ChipEntity extends BaseEntity{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
