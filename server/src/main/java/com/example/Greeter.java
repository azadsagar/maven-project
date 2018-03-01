package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param testing the person
   * @return greeting string to visor
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
