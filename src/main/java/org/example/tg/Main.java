package org.example.tg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.example.tg.lesson5.AbstractCar;
import org.example.tg.lesson5.Honda;
import org.example.tg.lesson5.Toyota;
import org.example.tg.lesson5.carinterface.Stop;
//TODO:
// Show access modifiers
// Show super, this, final
// Method overloading
public class Main {

  public static void main(String[] args) {

    AbstractCar car1 = new Honda("Honda CRv");
    AbstractCar car2 = new Toyota("Toyota Rav4");


  }


  public static void checkAllCars(AbstractCar... cars) {

    for (AbstractCar car : cars) {
      car.doStart(5);
      System.out.println("Check if car works");
      car.doStop();
    }
  }

  public static List<AbstractCar> filterCars(Predicate<AbstractCar> abstractCarPredicate, AbstractCar... cars) {

    List<AbstractCar> resultList = new ArrayList<>();
    for (AbstractCar car : cars) {
      if (abstractCarPredicate.test(car)) {
        resultList.add(car);
      }
    }
    return resultList;
  }


  public static void stopAll(Stop... cars) {

    for (Stop car : cars) {
      car.doStop();
      car.doStop();
    }
  }

}
