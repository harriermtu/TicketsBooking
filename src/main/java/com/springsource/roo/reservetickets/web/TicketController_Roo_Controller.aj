// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.roo.reservetickets.web;

import com.springsource.roo.reservetickets.domain.Price;
import com.springsource.roo.reservetickets.domain.Show;
import com.springsource.roo.reservetickets.domain.Ticket;
import com.springsource.roo.reservetickets.web.TicketController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect TicketController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String TicketController.create(@Valid Ticket ticket, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, ticket);
            return "tickets/create";
        }
        uiModel.asMap().clear();
        ticket.persist();
        return "redirect:/tickets/" + encodeUrlPathSegment(ticket.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String TicketController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Ticket());
        return "tickets/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String TicketController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("ticket", Ticket.findTicket(id));
        uiModel.addAttribute("itemId", id);
        return "tickets/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String TicketController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("tickets", Ticket.findTicketEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Ticket.countTickets() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("tickets", Ticket.findAllTickets(sortFieldName, sortOrder));
        }
        return "tickets/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String TicketController.update(@Valid Ticket ticket, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, ticket);
            return "tickets/update";
        }
        uiModel.asMap().clear();
        ticket.merge();
        return "redirect:/tickets/" + encodeUrlPathSegment(ticket.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String TicketController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Ticket.findTicket(id));
        return "tickets/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String TicketController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Ticket ticket = Ticket.findTicket(id);
        ticket.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/tickets";
    }
    
    void TicketController.populateEditForm(Model uiModel, Ticket ticket) {
        uiModel.addAttribute("ticket", ticket);
        uiModel.addAttribute("prices", Price.findAllPrices());
        uiModel.addAttribute("shows", Show.findAllShows());
    }
    
    String TicketController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
