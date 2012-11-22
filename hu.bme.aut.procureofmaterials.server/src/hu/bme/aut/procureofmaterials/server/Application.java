package hu.bme.aut.procureofmaterials.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class Application implements IApplication {

	private final Object appLock = new Object();
	private boolean done = false;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	public Object start(IApplicationContext appContext) throws Exception {
		System.out.println("Application Starting!");
		waitForDone();
		
		return IApplication.EXIT_OK;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		System.out.println("Application Stopping!");
//		synchronized (appLock) {
//			done = true;
//			appLock.notifyAll();
//		}
	}

	private void waitForDone() {
		
		Read read = new Read();
		read.start();
		
		// then just wait here
		synchronized (appLock) {
			while (!done) {
				try {
					appLock.wait();
				} catch (InterruptedException e) {
					// do nothing
				}
			}
		}
	}
	
	private class Read extends Thread {
		public void run() {
			
			final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				String line = br.readLine();
				while (!line.equals("exit")) {
					line = br.readLine();
					sleep(200);
				}
				
				synchronized (appLock) {
					done = true;
					appLock.notify();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
