// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.reservetickets.domain;

import com.springsource.roo.reservetickets.domain.Film;
import com.springsource.roo.reservetickets.domain.FilmDataOnDemand;
import com.springsource.roo.reservetickets.domain.FilmType;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect FilmDataOnDemand_Roo_DataOnDemand {
    
    declare @type: FilmDataOnDemand: @Component;
    
    private Random FilmDataOnDemand.rnd = new SecureRandom();
    
    private List<Film> FilmDataOnDemand.data;
    
    public Film FilmDataOnDemand.getNewTransientFilm(int index) {
        Film obj = new Film();
        setFilmType(obj, index);
        setTitle(obj, index);
        return obj;
    }
    
    public void FilmDataOnDemand.setFilmType(Film obj, int index) {
        FilmType filmType = FilmType.class.getEnumConstants()[0];
        obj.setFilmType(filmType);
    }
    
    public void FilmDataOnDemand.setTitle(Film obj, int index) {
        String title = "title_" + index;
        obj.setTitle(title);
    }
    
    public Film FilmDataOnDemand.getSpecificFilm(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Film obj = data.get(index);
        Long id = obj.getId();
        return Film.findFilm(id);
    }
    
    public Film FilmDataOnDemand.getRandomFilm() {
        init();
        Film obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Film.findFilm(id);
    }
    
    public boolean FilmDataOnDemand.modifyFilm(Film obj) {
        return false;
    }
    
    public void FilmDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Film.findFilmEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Film' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Film>();
        for (int i = 0; i < 10; i++) {
            Film obj = getNewTransientFilm(i);
            try {
                obj.persist();
            } catch (final ConstraintViolationException e) {
                final StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    final ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
                }
                throw new IllegalStateException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
