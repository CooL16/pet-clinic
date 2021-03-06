package cool.springframework.petclinic.controllers;

import cool.springframework.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(value = {"/owners", "/owners/index", "/owners/index.html"}, method = RequestMethod.GET)
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping(value = "/owners/find", method = RequestMethod.GET)
    public String findOwners() {
        return "notimplemented";
    }
}
