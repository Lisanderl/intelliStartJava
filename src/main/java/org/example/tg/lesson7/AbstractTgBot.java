package org.example.tg.lesson7;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;

public abstract class AbstractTgBot extends TelegramLongPollingBot {

  private final TokenProvider tokenProvider;
  private final UserNameProvider userNameProvider;

  protected AbstractTgBot(TokenProvider tokenProvider, UserNameProvider userNameProvider) {
    this.tokenProvider = tokenProvider;
    this.userNameProvider = userNameProvider;
  }


  @Override
  public final String getBotUsername() {
    return userNameProvider.get();
  }

  @Override
  public final String getBotToken() {

    return tokenProvider.get();
//    return "5472311526:AAH-p8G_EwluONwEhYvOP9jLK4m0XMxar-o";
  }


}
