package org.example.tg;

import java.util.Objects;
import org.apache.commons.codec.binary.StringUtils;
import org.example.tg.lesson7.AbstractTgBot;
import org.example.tg.lesson7.FileTokeProvider;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
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
    var bot = new AbstractTgBot(
        new FileTokeProvider("src/main/resources/token.txt"),
        () -> "name") {
      @Override
      public void onUpdateReceived(Update update) {
        System.out.println("Hello");
        try {

          super.execute(SendMessage.builder()
              .chatId(update.getMessage()
                  .getChatId())
                  .text("Hello" +     Objects.requireNonNull(update.getMessage().getText())
                      .contains("/start"))
              .build());
        } catch (TelegramApiException e) {
          e.printStackTrace();
        }
      }
    };
    telegramBotsApi.registerBot(bot);
  }

}
