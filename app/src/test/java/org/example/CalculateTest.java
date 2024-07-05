package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;

    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testave() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    double n = calculate.ave(2, 3);
    assertEquals(expected, n, 0.1);
  }

  @Test
  public void multipleadd() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.multipleadd(1, 10));
  }

  @Test
  public void multipleave() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.multipleave(10, 55), 0.1);
  }

  @Test
  public void sumodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumodd(1, 10));
  }

  @Test
  public void sumeven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumeven(1, 10));
  }
}
