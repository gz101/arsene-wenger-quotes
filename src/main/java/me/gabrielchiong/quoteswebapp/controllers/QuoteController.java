package me.gabrielchiong.quoteswebapp.controllers;

import me.gabrielchiong.quoteswebapp.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuoteController {
    private final QuotesService quotesService;

    public QuoteController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping({"/", ""})
    public String showQuote(Model model) {
        model.addAttribute("quote", quotesService.getQuote());
        return "index";
    }
}
