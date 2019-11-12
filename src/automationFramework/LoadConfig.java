package automationFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Properties;

public class LoadConfig 
{
	private String env, driverPath;
	
	/**
	 * @return the env
	 */
	public String getEnv() {
		return env;
	}


	/**
	 * @return the driverPath
	 */
	public String getDriverPath() {
		return driverPath;
	}

	public LoadConfig()
	{
	try
	{
		InputStream input = new FileInputStream(Paths.get(".").toAbsolutePath().normalize().toString()+"/resources/config.properties");

        Properties prop = new Properties();
        // load a properties file
        prop.load(input);
        
        // get the property value and print it out
        this.env = prop.getProperty("test.env", prop.getProperty("default.env"));
//        this.driverPath = prop.getProperty("chromedriver.path", prop.getProperty("defaultdriver.path"));
        this.driverPath = new StringBuilder(Paths.get(".").toAbsolutePath().normalize().toString())
        										.append("/resources/chromedriver").toString();
	 } 
	catch (IOException io) {
         io.printStackTrace();
     }
	}
}

