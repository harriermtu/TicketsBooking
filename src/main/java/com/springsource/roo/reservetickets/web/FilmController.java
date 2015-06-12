package com.springsource.roo.reservetickets.web;
import com.springsource.roo.reservetickets.domain.Film;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/films")
@Controller
@RooWebScaffold(path = "films", formBackingObject = Film.class)
public class FilmController {
}
