// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.reservetickets.domain;

import com.springsource.roo.reservetickets.domain.Price;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Price_Roo_Jpa_Entity {
    
    declare @type: Price: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Price.id;
    
    @Version
    @Column(name = "version")
    private Integer Price.version;
    
    public Long Price.getId() {
        return this.id;
    }
    
    public void Price.setId(Long id) {
        this.id = id;
    }
    
    public Integer Price.getVersion() {
        return this.version;
    }
    
    public void Price.setVersion(Integer version) {
        this.version = version;
    }
    
}
