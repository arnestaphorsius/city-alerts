package main.java.com.incentro.core.util;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * @author Arne Staphorsius.
 * @since 16-3-2016.
 */
public class Util {

  public static String getRemoteAddress(WebServiceContext wsContext) {

    try {

      MessageContext msgx = wsContext.getMessageContext();
      HttpServletRequest req = (HttpServletRequest) msgx.get(MessageContext.SERVLET_REQUEST);
      return req.getRemoteAddr();

    } catch (Exception ignored) {

      return "unknown host";
    }
  }
}
