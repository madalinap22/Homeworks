package org.madalina.bankingsystem.controller;

import org.madalina.bankingsystem.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    //metoda 1 de injectare (nerecomandata):
//    @Autowired  //forteaza spring-ul sa verifice contextul si sa vada daca exista vreun Bean de tipul BankingService
//                // in contextul de Spring; daca da este pus in variabila bankingService si ulterior variabila sa faca saySomething in home
//    private BankingService bankingService;  //inlocuieste apelarea metodei saySomething din BankinkService

    //metoda 2 de injectare (recomandata):
    private final BankingService bankingService;
   public HomeController(BankingService bankingService){
       this.bankingService = bankingService;
   }

    @GetMapping
    public String home(){
//        BankingService bankingService = new BankingService();
//        bankingService.saySomething();
        bankingService.saySomething();
        return "home";
    }

    //metoda de 3 de injectare(nerecomandata)
//    @Autowired
//    public void setBankingService(BankingService bankingService){
//        this.bankingService = bankingService;
//    }



}

