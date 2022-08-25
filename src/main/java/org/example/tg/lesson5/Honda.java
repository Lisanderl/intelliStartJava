package org.example.tg.lesson5;

public class Honda extends AbstractCar {

  private static String COMPANY_NAME = "HONDA";

  public Honda(String name) {
    super(name, COMPANY_NAME);
  }


  @Override
  public void doStart() {
    System.out.println(name + " Car is started with electric engine");
  }


  @Override
  public void doStop() {
    System.out.println(name + " Car is stooped with electric engine");
  }

  @Override
  public void accept(Object o) {

  }

  @Override
  public String toString() {
    return "Honda{" +
        "name='" + name + '\'' +
        ", companyName='" + companyName + '\'' +
        '}';
  }
}
