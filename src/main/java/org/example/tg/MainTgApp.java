package org.example.tg;

import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MainTgApp {

  private static final String KEY_NAME = "TG_KEY";
  private static final String KEY;
  private static final String HELLO_MSG = "Hello: %s";

  static {
    KEY = System.getenv(KEY_NAME);
  }

  public static void main(String[] args) throws TelegramApiException {

  }

}
