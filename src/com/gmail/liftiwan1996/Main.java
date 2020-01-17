package com.gmail.liftiwan1996;

import static java.lang.Math.random;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Please input frame_width");
    int fw = sc.nextInt();
    System.out.println("Please input frame_height");
    int fh = sc.nextInt();
    System.out.println("Please input pic_width");
    int pw = sc.nextInt();
    System.out.println("Please input pic_height");
    int ph = sc.nextInt();
    System.out.println("Please input pic_x");
    int x = sc.nextInt();
    System.out.println("Please input pic_y");
    int y = sc.nextInt();

    int[][] array = new int[fh][fw];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = 0 + (int) (random() * 9);
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }
    System.out.println();

    for (int i = 0; i < ph; i++) {
      for (int j = 0; j < pw; j++) {
        int buf = array[i][j];
        array[i][j] = array[x + i][y + j];
        array[x + i][y + j] = buf;
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }
  }
}
