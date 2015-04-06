package org.denis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import java.util.regex.Pattern;

public class Test1 {

  public static final Pattern PATTERN = Pattern.compile("\\d+([^\\s]+)");

  private static final Logger LOGGER = LoggerFactory.getLogger(Test1.class);

  public void test(XPath xPath) throws XPathExpressionException {
    if (xPath != null) {
      LOGGER.info("Testing xpath inside string injection");
      xPath.compile("//parent/child::grandchild");
    }
  }

  public static void main(String[] args) throws XPathExpressionException {
    Test1 t = new Test1();
    System.out.println(Test1.PATTERN);
    t.test(null);
  }
}
