package org.denis;

import java.util.regex.Pattern;

/**
 * @author Denis Zhdanov
 * @since 16/03/15 16:26
 */
public class Test1 {
  void test () {
    String s = "\\d+([^\\s]+)";
    Pattern pattern = Pattern.compile("\\d+([^\\s]+)");
  }
}
