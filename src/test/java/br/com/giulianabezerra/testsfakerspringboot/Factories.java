package br.com.giulianabezerra.testsfakerspringboot;

import com.github.javafaker.Faker;

public class Factories {
  private static Faker Faker = new Faker();

  public static User createUser() {
    return new User(
        Faker.lordOfTheRings().character(),
        Faker.name().username(),
        Faker.internet().password(),
        Faker.internet().emailAddress());
  }
}
