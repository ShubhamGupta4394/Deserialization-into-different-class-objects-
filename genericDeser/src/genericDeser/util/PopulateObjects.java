package genericDeser.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
			else if(rslt.contains("int")||rslt.contains("float")||rslt.contains("double")||rslt.contains("short")||rslt.contains("String")||rslt.contains("byte")||rslt.contains("long")||rslt.contains("boolean")||rslt.contains("char")){
				String sub[]=rslt.split(",");
				sub[1] = sub[1].replaceAll(" ", "");
				sub[2] = sub[2].replaceAll(" ", "");
				String sub1[] = sub[0].split("=");
				String sub2[] = sub[1].split("=");
				String sub3[] = sub[2].split("=");
				type = sub1[1];
				methodName = sub2[1];
				value = sub3[1];
				Class c = map.get(type);
				Method m1 = cls.getMethod("set"+methodName, c);
				Object ob1 = objType(value,type);
				Object result = m1.invoke(obj, ob1);
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}catch (NoSuchMethodException e){
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		}catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		}
	}

	private Object objType(String value, String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
