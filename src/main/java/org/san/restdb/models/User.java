package org.san.restdb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.san.restdb.auditing.AuditableEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity(name = "USERS")
@DynamicUpdate
public class User extends AuditableEntity {
    // private static final long serialVersionUID = -4541856084396704983L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "password")
    // @JsonIgnore
    private String password;
    @Column(name = "CITY")
    private String city;
}
