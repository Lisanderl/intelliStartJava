package org.example.tg.lesson5;

import org.example.tg.lesson5.carinterface.Start;
import org.example.tg.lesson5.carinterface.Stop;


public class Bike implements Stop, Start {

  @Override
  public void doStart() {
    System.out.println("Bike is started");
  }

  @Override
  public void doStop() {
    System.out.println("Bike is stopped");
  }


  @Override
  public void accept(Object o) {

  }
}
