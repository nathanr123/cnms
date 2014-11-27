/**
 * 
 */
package com.cti.rmopp.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.cti.rmopp.Impl.BaseServiceImpl;

/**
 * @author nathanr_kamal
 *
 */
public class CornetNMSServer {

	/**
	 * 
	 */
	public CornetNMSServer() {

	}

	private void startService() throws RemoteException {

		System.out.println("Starting Server...");

		BaseServiceImpl service = new BaseServiceImpl();

		Registry registry = LocateRegistry.createRegistry(2525);

		registry.rebind("RMI", service);

		System.out.println("Server Started...");
	}

	/**
	 * @param args
	 * @throws RemoteException
	 */
	public static void main(String[] args) {

		try {
			CornetNMSServer cornetServer = new CornetNMSServer();

			cornetServer.startService();

		} catch (RemoteException e) {
			System.out.println("Problem in Server Starting");
		}

	}

}
