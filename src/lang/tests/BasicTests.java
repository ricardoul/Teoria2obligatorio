package lang.tests;

import java.util.*;

import java_cup.runtime.Symbol;
import junit.framework.TestCase;
import lang.parser.Lexer;
import lang.parser.Parser;
import lang.parser.QObject;
import lang.parser.QQuery;
import lang.parser.Tokens;

public class BasicTests extends TestCase {
	
	public static void showTokens(String input) throws Exception {
	Lexer lexer = Parser.makeLexer(input);
	Symbol token = lexer.next_token();
	while (token.sym != Tokens.EOF) {
		System.out.println(token.sym +": "+ token.value);
		token = lexer.next_token();
	}
	System.out.println("FIN");
}

	public void test1() throws Exception {
		String input = "List(algo(id:\"a\",a:sist(id:1)))";
		//String input2 = "List(Company(id:1,name:\"Google\",Person(id: 1, name: \"Larry Page\"),Person(id: 2,name: \" Serguéi Brin\") ),Company( /* id, name at the end */ Person(id: 1,name: \"Lawrence J. Ellison\"),Person(id: 2, name: \"Bob Miner\"),Person(id: 3, name: \"Ed Oates\"), id: 2, name: \"Oracle\" ))";
		showTokens(input);
		QObject qobj = (QObject) Parser.parseString(input);
		System.out.println(qobj.toString()+ "hola");
		assertEquals(qobj, 1);
		
	}
	
	public void testRegexTag() throws Exception {
		ArrayList aux = new ArrayList();
		String input = "List(algo(id:\"a\",a:sist(id:1)))";
		QObject qobj = (QObject) Parser.parseString(input);
		aux.add(qobj);
		QQuery.actualContext = aux;
		QQuery.filterByRegex("a+");
	}
	
	public void testIntersection(){
		List a = new ArrayList();
		a.add(1);
		a.add(2);
		List b = new ArrayList();
		b.add(1);
		assertEquals(QQuery.intersect(a,b), b);
	}
	

	
}
// 