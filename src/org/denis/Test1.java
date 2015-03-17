package org.denis;

import java.util.regex.Pattern;

public class Test1 {
  void test (String s) {
    Pattern pattern = Pattern.compile("\\d+([^\\s]+)");
    System.out.println(s);
  }
}
