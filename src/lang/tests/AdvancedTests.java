package lang.tests;

import java.util.*;

import java_cup.runtime.Symbol;
import junit.framework.TestCase;
import lang.parser.Expression;
import lang.parser.Lexer;
import lang.parser.Parser;
import lang.parser.QOPERATION;
import lang.parser.QObject;
import lang.parser.Tokens;


public class AdvancedTests extends TestCase {
	
	
	
	public static void showTokens(String input) throws Exception {
	Lexer lexer = Parser.makeLexer(input);
	Symbol token = lexer.next_token();
	while (token.sym != Tokens.EOF) {
		System.out.println(token.sym +": "+ token.value);
		token = lexer.next_token();
	}
	System.out.println("FIN");
}

	public void testAdvanced1() throws Exception {
		String input = "'List_1'(id:\"name\",Building(id:\"Adress\"),Company_1(Person_1(id:\"b\"),Person_2(id:true)),Company_2(Person_3(id:\"C\"),Person_4(id:\"D\")))";
		showTokens(input);
		Expression qobj = (Expression) Parser.parseString(input);
		
	}
	
	public void testAdvanced2() throws Exception {
		ArrayList<String> arr = new ArrayList();
		
		arr.add("$");
		arr.add("$List_1/");
		arr.add("$List_1//");
		arr.add("$List_1/Company/");
		arr.add("$List_1///");
		arr.add("$List_1/Company/Person/");
		arr.add("$List_1 Company");
		arr.add("$List_1 'Company'");
		arr.add("$List_1//'Person'");
		arr.add("$List_1 ~'Comp[a-z]n[oy]'");
		arr.add("$List_1.");
		arr.add("$List_1//'Person'");
		arr.add("$List_1/+$List_1//");
		arr.add("$List_1/+$List_1//-$List_1/Building-$List_1//Person");
		arr.add("$List_1/∩$List_1/");
		arr.add("$List_1/+$List_1//∪$List_1/+$List_1//-$List_1/Building-$List_1//Person");
		for(String s:arr){
			System.out.println(s);
			showTokens(s);
			Expression qobj = (Expression) Parser.parseString(s);
			assertEquals(s, qobj.toString());
		}
		
	}

}
// 