package org.example.tg;

import org.example.tg.lesson7.AbstractTgBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class MainTgApp {

  private static final String KEY_NAME = "TG_KEY";
  private static final String KEY;
  private static final String HELLO_MSG = "Hello: %s";

  static {
    KEY = System.getenv(KEY_NAME);
  }

  public static void main(String[] args) throws TelegramApiException {
    TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

    telegramBotsApi.registerBot(bot);
  }

}
