package com.springsource.roo.reservetickets.domain;
import java.util.List;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Ticket {

    /**
     */
    private int rowNumber;

    /**
     */
    private int placeNumber;

    /**
     */
    @ManyToOne
    private Show show;

    /**
     */
    @ManyToOne
    private Price price;

    /**
     */
    private String reserveCheck;
    
    public static List<Ticket> checkTicket(int row, int place, int id){
    	return entityManager().createQuery(
    			"FROM Ticket t WHERE t.rowNumber = :row AND t.placeNumber= :place AND t.show.id = :id",Ticket.class)
    			.setParameter("row", row)
    			.setParameter("place", place)
    			.setParameter("id",Long.valueOf(id))
    			.getResultList();
    }
}
