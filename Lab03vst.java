// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 100 Point Version\n");
      int milli = 10000123;
	  System.out.println ("Starting milli-seconds:" +milli);
	  System.out.println("Hours:" +milli/3600000);
	  int millisecleftafthr = milli%3600000;
	  System.out.println("Minutes:" +millisecleftafthr/60000);
	  int millisecleftaftmin = millisecleftafthr%60000;
	  System.out.println("Seconds:" +millisecleftaftmin/1000);
	  System.out.println("Milli Seconds:" +millisecleftaftmin%1000);

	}
}

