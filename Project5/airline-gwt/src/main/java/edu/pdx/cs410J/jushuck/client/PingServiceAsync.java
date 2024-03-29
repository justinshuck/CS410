package edu.pdx.cs410J.jushuck.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import edu.pdx.cs410J.AbstractAirline;

/**
 * The client-side interface to the ping service
 */
public interface PingServiceAsync {

  /**
   * Return the current date/time on the server
   */
  void ping(AsyncCallback<AbstractAirline> async);
}
