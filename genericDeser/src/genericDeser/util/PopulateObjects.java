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
		String str,rslt;
		String classname = null;
		String type = null;
		String value = null;
		String methodName = null;
		Class cls = null;
		Object obj = null;
		
		while((str=fp.readLineFromFile())!=null)
		{
			rslt = str.replaceAll("[<>]", "");
		try{
			if(rslt.contains("fqn")){
				if(!(classname==null)){
					if(classname.equalsIgnoreCase("genericDeser.util.First")){
						if(map1.containsKey(obj)){
							int count = map1.get(obj);
							count++;
							map1.put((First) obj, count);
							
						}
						else{
							map1.put((First) obj, 1);
						}
					}
					else if(classname.equalsIgnoreCase("genericDeser.util.Second"))
					{
						if(map2.containsKey(obj)){
							int count = map2.get(obj);
							count++;
							map2.put((Second) obj, count);
						}
						else {
							map2.put((Second) obj, 1);
						}
					}
				}
				String arr[] = rslt.split(":");
				classname = arr[1];
				cls = Class.forName(classname);
				obj = cls.newInstance();
			}
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		}
	}
}
