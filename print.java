package practice.java;

import java.util.Scanner;

public class print {
    java.util.Scanner sc = new java.util.Scanner(System.in);
      void main() {
          System.out.println(" enter your name:");
          String name = sc.nextLine();
          System.out.println("Age:");
          int age = sc.nextInt();

          sc.close();
          System.out.println("your name is :"+name);
          System.out.println("age is :"+age);
      }
}
