package org.example.tg.lesson5.carinterface;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public interface Start extends Consumer {

  String DELAY_MSG = "Start is delayed by %s ";

  void doStart();

  default void doStart(int delay) {
    System.out.printf(DELAY_MSG, delay);
    doStart();
  }

  static void doStart(int delay, TimeUnit timeUnit) {

  }

  private void doStart(int delay, String msg) {

  }
}
