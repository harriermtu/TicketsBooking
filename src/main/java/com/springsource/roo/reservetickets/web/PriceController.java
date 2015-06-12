package com.springsource.roo.reservetickets.web;
import com.springsource.roo.reservetickets.domain.Price;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/prices")
@Controller
@RooWebScaffold(path = "prices", formBackingObject = Price.class)
public class PriceController {
}
