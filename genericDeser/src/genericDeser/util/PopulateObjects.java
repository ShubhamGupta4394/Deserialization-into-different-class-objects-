package genericDeser.util;

import java.util.HashMap;
import java.util.Map;

import genericDeser.fileOperations.FileProcessor;
import genericDeser.fileOperations.Logger;

public class PopulateObjects {
	private Map<String, Class> map;
	private Map<First,Integer> map1 = new HashMap<First, Integer>();
	private Map<Second,Integer> map2 = new HashMap<Second, Integer>();
	private FileProcessor fp;
	
	public PopulateObjects(FileProcessor fileProcessor) {
		Logger.writeMessage("Constructor of PopulateObjects", Logger.DebugLevel.CONSTRUCTOR);
		fp = fileProcessor;
		map = new HashMap<String, Class>();
		map.put("int",Integer.TYPE);
		map.put("String", String.class);
		map.put("short", Short.TYPE);
		map.put("double",Double.TYPE);
		map.put("float", Float.TYPE);
		map.put("byte", Byte.TYPE);
		map.put("long", Long.TYPE);
		map.put("boolean", Boolean.TYPE);
		map.put("char", Character.TYPE);
	}
    
	public void deserObjects(){
	
	}
}
