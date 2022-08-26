package org.example.tg.lesson5;

import org.example.tg.lesson5.carinterface.Start;
import org.example.tg.lesson5.carinterface.Stop;

public abstract class AbstractCar implements Stop, Start {

  protected final String name;
  protected final String companyName;
  protected Engine engine;
  protected int size;
  protected int lengt;


  public AbstractCar(String name, String companyName) {
    this.name = name;
    this.companyName = companyName;
  }

  public AbstractCar(String name, String companyName, Engine engine) {
    this(name, companyName);
    this.engine = engine;
  }


  public AbstractCar(String name, String companyName, Engine engine, int size, int lengt) {
    this(name, companyName, engine);
    this.size = size;
    this.lengt = lengt;
  }


  public String getCompanyName() {
    return companyName;
  }

  protected final void validateEngine() {

    System.out.println("Engine is validating, power is: ");
  }

  protected void validateEngine(boolean isStarted) {
    validateEngine();
    System.out.println("Engine is validating, power is: ");
  }


  protected void validateEngine(int power) {
    validateEngine();
    System.out.println("Engine is validating, power is: ");
  }

  protected void validateEngine(int power, int maxPower) {
    validateEngine();
    System.out.println("Engine is validating, power is: ");
  }
}
