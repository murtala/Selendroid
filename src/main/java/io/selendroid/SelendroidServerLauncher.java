package io.selendroid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;

public class SelendroidServerLauncher {
	private static SelendroidLauncher selendroidServer = null;
	private static WebDriver driver = null;
	static SelendroidConfiguration config;

	public SelendroidServerLauncher(String supportedApp) {
		config = new SelendroidConfiguration();
		config.addSupportedApp("src/main/resources/" + supportedApp+".apk");
		System.out.println("PATH ==> " +"src/main/resources/" + supportedApp+".apk");
		selendroidServer = new SelendroidLauncher(config);
	}

	public static void startServer() {
		if (selendroidServer != null) {
			selendroidServer.stopSelendroid();
		}

		selendroidServer.launchSelendroid();
	}

	public static void stopServer() {
		if (selendroidServer != null) {
			selendroidServer.stopSelendroid();
		}
	}
	public SelendroidServerLauncher() {
		  if (selendroidServer != null) {
		      selendroidServer.stopSelendroid();
		    }
		    SelendroidConfiguration config = new SelendroidConfiguration();
		    selendroidServer = new SelendroidLauncher(config);
	}

	
}
