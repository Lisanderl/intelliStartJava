package org.example.tg.lesson5;

import org.example.tg.lesson5.carinterface.Start;
import org.example.tg.lesson5.carinterface.Stop;

public abstract class AbstractCar implements Stop, Start {

  protected String name;
  protected String companyName;

  public AbstractCar(String name, String companyName) {
    this.name = name;
    this.companyName = companyName;
  }

  public String getCompanyName() {
    return companyName;
  }

  private void validateEngine() {
    System.out.println("Engine is validating");
  }

}
