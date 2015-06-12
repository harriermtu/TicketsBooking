package com.springsource.roo.reservetickets.web;
import java.util.List;

import com.springsource.roo.reservetickets.domain.Price;
import com.springsource.roo.reservetickets.domain.Show;
import com.springsource.roo.reservetickets.domain.Ticket;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/tickets")
@Controller
@RooWebScaffold(path = "tickets", formBackingObject = Ticket.class)
public class TicketController {
	
	@RequestMapping(value = "/reserve", method = RequestMethod.GET)
	public String printFirst(ModelMap model){
		
		List<Show> showlist = Show.findShowEntries(0, 10);
		model.addAttribute("showList",showlist);
        return "tickets/reserve";
	}
	
	@RequestMapping(value = "/checkfree", method = RequestMethod.GET)
	public String checkTicketFree(@RequestParam(value = "row", required = true) int row, @RequestParam(value = "place", required = true) int place, @RequestParam(value = "id", required = true) int id, ModelMap model){
		Boolean check;
		if (Ticket.checkTicket(row, place, id).size() > 0) check = false;
		else check = true;
		model.addAttribute("checkFree", check);
			
		return "tickets/checkfree";
		
	}
	
	@RequestMapping(value="/createticket", method = RequestMethod.POST)
	public String createTicket(@RequestParam(value = "price") int price, @RequestParam(value = "row") int row, @RequestParam(value = "place") int place, @RequestParam(value = "show") int show, @RequestParam(value = "password", defaultValue = "reserve") String password, ModelMap model){
			Ticket ticket = new Ticket();
			ticket.setRowNumber(row);
			ticket.setPlaceNumber(place);
			ticket.setShow(Show.findShow((long) show));
			ticket.setPrice(Price.findPrice((long) price));
			ticket.setReserveCheck(password);
			ticket.persist();
			model.addAttribute("row", row);
			model.addAttribute("place",place);
			model.addAttribute("show", show);
			model.addAttribute("password", password);
		return "tickets/createticket";
		
	}
	
}
