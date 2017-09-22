
package genericDeser.fileOperations;

public class Logger{
	
    public static enum DebugLevel {RELEASE, VALIDATEARGS ,METHODCALLED, FILEPROCESSOROBJECT , CONSTRUCTOR
                                   };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
		case 0: debugLevel = DebugLevel.RELEASE; break;
		case 1: debugLevel = DebugLevel.VALIDATEARGS; break;
		case 2: debugLevel = DebugLevel.METHODCALLED; break;
		case 3: debugLevel = DebugLevel.FILEPROCESSOROBJECT; break;
		case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    public static void writeMessage (String  message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}
