// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.reservetickets.domain;

import com.springsource.roo.reservetickets.domain.Film;
import com.springsource.roo.reservetickets.domain.FilmType;

privileged aspect Film_Roo_JavaBean {
    
    public String Film.getTitle() {
        return this.title;
    }
    
    public void Film.setTitle(String title) {
        this.title = title;
    }
    
    public FilmType Film.getFilmType() {
        return this.filmType;
    }
    
    public void Film.setFilmType(FilmType filmType) {
        this.filmType = filmType;
    }
    
}
