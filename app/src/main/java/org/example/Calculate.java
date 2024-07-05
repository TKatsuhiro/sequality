package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;

  }

  public double ave(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int multipleadd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public double multipleave(int x, int y) {
    return (double) y / x;
  }

  public int sumodd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public int sumeven(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
      }
    }
    return sum;
  }
}
