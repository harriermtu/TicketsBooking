package com.springsource.roo.reservetickets.web;
import com.springsource.roo.reservetickets.domain.Auditorium;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auditoriums")
@Controller
@RooWebScaffold(path = "auditoriums", formBackingObject = Auditorium.class)
public class AuditoriumController {
}
