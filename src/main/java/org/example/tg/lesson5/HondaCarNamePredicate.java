package org.example.tg.lesson5;

import java.util.function.Predicate;

public class HondaCarNamePredicate implements Predicate<AbstractCar> {

  String TEST_FIELD_NAME = "HONDA";

  @Override
  public boolean test(AbstractCar abstractCar) {
    return TEST_FIELD_NAME.equals(abstractCar.getCompanyName());
  }
}
