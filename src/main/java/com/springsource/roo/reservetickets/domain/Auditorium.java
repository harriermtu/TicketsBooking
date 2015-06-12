package com.springsource.roo.reservetickets.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Auditorium {

    /**
     */
    private int numberOfRows;

    /**
     */
    private int numberOfPlaces;

    /**
     */
    private int numberOfAuditorium;
}
