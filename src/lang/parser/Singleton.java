package lang.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Singleton {

	public static Expression rootData = new Expression();
	

	public static Expression getRootData() {
		return rootData;
	}
	public static void setRootData(Expression rootData) {
		Singleton.rootData = rootData;
	}
	
	public static void setRootData(QObject rootData) {
		Singleton.rootData = new Expression(rootData);
	}
	
	public static Expression getData( ) {
		return rootData;
	}

}