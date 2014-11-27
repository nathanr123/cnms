/**
 * 
 */
package com.cti.rmopp.core;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author nathanr_kamal
 *
 */
public interface BaseService extends Remote {

	public String whoAreYou() throws RemoteException;

}
