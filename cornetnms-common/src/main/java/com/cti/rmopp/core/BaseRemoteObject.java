/**
 * 
 */
package com.cti.rmopp.core;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author nathanr_kamal
 *
 */
public class BaseRemoteObject extends UnicastRemoteObject implements
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8519686639249883383L;

	/**
	 * @throws RemoteException
	 */
	public BaseRemoteObject() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param port
	 * @throws RemoteException
	 */
	public BaseRemoteObject(int port) throws RemoteException {
		super(port);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param port
	 * @param csf
	 * @param ssf
	 * @throws RemoteException
	 */
	public BaseRemoteObject(int port, RMIClientSocketFactory csf,
			RMIServerSocketFactory ssf) throws RemoteException {
		super(port, csf, ssf);
		// TODO Auto-generated constructor stub
	}

}
