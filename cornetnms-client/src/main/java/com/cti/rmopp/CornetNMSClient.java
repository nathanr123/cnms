/**
 * 
 */
package com.cti.rmopp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.cti.rmopp.core.BaseService;

/**
 * @author nathanr_kamal
 *
 */
public class CornetNMSClient {

	private BaseService service;

	/**
	 * @throws RemoteException
	 * @throws NotBoundException
	 * 
	 */
	public CornetNMSClient() throws RemoteException, NotBoundException {

		Registry registry = LocateRegistry.getRegistry("localhost", 2525);

		service = (BaseService) registry.lookup("RMI");

	}

	private void connectServer() throws RemoteException {
		System.out.println("I asked to the server 'Who Are You?'");

		System.out.println("Server reply is '" + service.whoAreYou() + "'");
	}

	/**
	 * @param args
	 * @throws NotBoundException
	 * @throws RemoteException
	 */
	public static void main(String[] args) throws RemoteException,
			NotBoundException {

		CornetNMSClient nmsClient = new CornetNMSClient();

		nmsClient.connectServer();

	}

}
