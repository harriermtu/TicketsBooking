package com.springsource.roo.reservetickets.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Price {

    /**
     */
    private int valueOfPrice;

    /**
     */
    @Enumerated
    private FilmType filmType;

    /**
     */
    @Enumerated
    private PriceType priceType;
}
