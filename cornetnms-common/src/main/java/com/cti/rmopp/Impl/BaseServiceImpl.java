/**
 * 
 */
package com.cti.rmopp.Impl;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;

import com.cti.rmopp.core.BaseRemoteObject;
import com.cti.rmopp.core.BaseService;

/**
 * @author nathanr_kamal
 *
 */
public class BaseServiceImpl extends BaseRemoteObject implements BaseService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8807317295477365938L;

	/**
	 * @throws RemoteException
	 */
	public BaseServiceImpl() throws RemoteException {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param port
	 * @throws RemoteException
	 */
	public BaseServiceImpl(int port) throws RemoteException {
		super(port);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param port
	 * @param csf
	 * @param ssf
	 * @throws RemoteException
	 */
	public BaseServiceImpl(int port, RMIClientSocketFactory csf,
			RMIServerSocketFactory ssf) throws RemoteException {
		super(port, csf, ssf);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cti.rmopp.core.BaseService#whoAreYou()
	 */
	@Override
	public String whoAreYou() throws RemoteException {
		System.out.println("Client asking Who Am I?");

		System.out.println("I replied Hi! I'm RMI Server");
				
		return "Hi! I'm RMI Server";
	}

}
