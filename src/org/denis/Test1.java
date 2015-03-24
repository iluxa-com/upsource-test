package org.denis;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class Test1 {

  public static final Pattern PATTERN = Pattern.compile("\\d+([^\\s]+)");

  public void test(XPath xPath) throws XPathExpressionException {
    if (xPath != null) {
      xPath.compile("//parent/child::grandchild");
    }
  }

  public static void main(String[] args) throws XPathExpressionException {
    Test1 t = new Test1();
    System.out.println(Test1.PATTERN);
    t.test(null);
  }
}
