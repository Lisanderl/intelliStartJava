package org.example.tg.lesson5;

public class Toyota extends AbstractCar {

  private static String COMPANY_NAME = "TOYOTA";

  public Toyota(String name) {
    super(name, COMPANY_NAME);
  }

  @Override
  public void doStart() {
    System.out.println(name + " Car is started");
  }

  @Override
  public void doStop() {
    System.out.println("Car is stopped");
  }

  @Override
  public void accept(Object o) {

  }
}
