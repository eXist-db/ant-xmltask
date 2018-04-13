package com.oopsconsultancy.xmltask;

import java.lang.reflect.Constructor;

/**
 * builds a XPathAnalyser. The concrete type
 * is determined by the JDK in use
 * 
 * This used to switch between 1.4/1.5 etc. Now we only support
 * 1.5 and beyond (September 2009)
 *
 * @author <a href="mailto:brian@oopsconsultancy.com">Brian Agnew</a>
 * @version $Id: XPathAnalyserFactory.java,v 1.6 2009/09/14 17:18:50 bagnew Exp $
 */
public class XPathAnalyserFactory {

  public static XPathAnalyser getAnalyser(final String xpathObjectModelUri) throws Exception {

    final Class<XPathAnalyser> clazz = (Class<XPathAnalyser>) Class.forName("com.oopsconsultancy.xmltask.jdk15.XPathAnalyser15");
    final Constructor<XPathAnalyser> cstr = clazz.getConstructor(String.class);
    return cstr.newInstance(xpathObjectModelUri);
  }
}
