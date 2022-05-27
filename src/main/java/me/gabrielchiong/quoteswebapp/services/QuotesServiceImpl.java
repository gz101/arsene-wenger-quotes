package me.gabrielchiong.quoteswebapp.services;

import org.springframework.stereotype.Service;

@Service
public class QuotesServiceImpl implements QuotesService {
    private final ArseneWengerQuotes arseneWengerQuotes;

    public QuotesServiceImpl() {
        this.arseneWengerQuotes = new ArseneWengerQuotes();
    }

    @Override
    public String getQuote() {
        return arseneWengerQuotes.getRandomQuote();
    }
}
