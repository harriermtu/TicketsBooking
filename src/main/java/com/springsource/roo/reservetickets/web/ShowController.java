package com.springsource.roo.reservetickets.web;
import com.springsource.roo.reservetickets.domain.Show;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/shows")
@Controller
@RooWebScaffold(path = "shows", formBackingObject = Show.class)
public class ShowController {
}
