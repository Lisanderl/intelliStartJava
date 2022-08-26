package org.example.tg;

import org.example.tg.bot.CurrencyInfoBot;
import org.example.tg.bot.providers.FileTokenProvider;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MainTgApp {


  public static void main(String[] args) throws TelegramApiException {

    TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
    api.registerBot(new CurrencyInfoBot(new FileTokenProvider("src/main/resources/token.txt"),
        () -> "DefaultName"));


  }

//  TODO:
//  Show bad design example
//  Shew "good" design examole
// Try to use keywords from the lesson
// https://t.me/lesson3Lisander_bot
//
}
