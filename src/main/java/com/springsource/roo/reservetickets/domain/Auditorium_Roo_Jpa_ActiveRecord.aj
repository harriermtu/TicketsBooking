// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.reservetickets.domain;

import com.springsource.roo.reservetickets.domain.Auditorium;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Auditorium_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Auditorium.entityManager;
    
    public static final List<String> Auditorium.fieldNames4OrderClauseFilter = java.util.Arrays.asList("numberOfRows", "numberOfPlaces", "numberOfAuditorium");
    
    public static final EntityManager Auditorium.entityManager() {
        EntityManager em = new Auditorium().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Auditorium.countAuditoriums() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Auditorium o", Long.class).getSingleResult();
    }
    
    public static List<Auditorium> Auditorium.findAllAuditoriums() {
        return entityManager().createQuery("SELECT o FROM Auditorium o", Auditorium.class).getResultList();
    }
    
    public static List<Auditorium> Auditorium.findAllAuditoriums(String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Auditorium o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Auditorium.class).getResultList();
    }
    
    public static Auditorium Auditorium.findAuditorium(Long id) {
        if (id == null) return null;
        return entityManager().find(Auditorium.class, id);
    }
    
    public static List<Auditorium> Auditorium.findAuditoriumEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Auditorium o", Auditorium.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    public static List<Auditorium> Auditorium.findAuditoriumEntries(int firstResult, int maxResults, String sortFieldName, String sortOrder) {
        String jpaQuery = "SELECT o FROM Auditorium o";
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            jpaQuery = jpaQuery + " ORDER BY " + sortFieldName;
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                jpaQuery = jpaQuery + " " + sortOrder;
            }
        }
        return entityManager().createQuery(jpaQuery, Auditorium.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Auditorium.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Auditorium.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Auditorium attached = Auditorium.findAuditorium(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Auditorium.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Auditorium.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Auditorium Auditorium.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Auditorium merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}