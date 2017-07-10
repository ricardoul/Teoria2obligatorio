package lang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Singleton {

	public static ArrayList<QObject> rootData = new ArrayList<QObject>();
	

	public static ArrayList<QObject> getRootData() {
		return rootData;
	}
	public static void setRootData(ArrayList<QObject> rootData) {
		Singleton.rootData = rootData;
	}
	public static ArrayList<QObject> getData( ) {
		return rootData;
	}
	public static void addData(QObject data){
		rootData.add(data);
	}
}