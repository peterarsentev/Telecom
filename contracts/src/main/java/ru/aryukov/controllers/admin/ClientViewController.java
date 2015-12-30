package ru.aryukov.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.aryukov.model.ClientEntity;
import ru.aryukov.services.ClientService;

import java.util.Collections;

/**
 * Created by oleg on 20.12.2015.
 */
@Controller
@RequestMapping("/admin")
public class ClientViewController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String showAllClients(@RequestParam(value = "key", required=false) String key, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    model.addAttribute("isAdmin", "admin".equals(auth.getPrincipal()));
	    model.addAttribute("clients", Collections.EMPTY_LIST);//clientService.listClient());
        return "admin/clients";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showFormAddClient() {
        return "admin/addClient";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addClient(@ModelAttribute ClientEntity client){
        clientService.addClient(client);
        return "redirect:/app/admin/all";
    }

    @RequestMapping(value = "/showDetails", method = RequestMethod.GET)
    public String showDetails(@RequestParam Integer id, Model model){
        model.addAttribute("contracts",clientService.getContracts(id));
        return "admin/clientDetails";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deletClient(@RequestParam Integer id){
        clientService.removeClient(id);

        return "redirect:/app/admin/all";
    }


}
