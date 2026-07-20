package com.springcore.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.Expression;;

public class App { 

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Expresion expression = context.getBean("expresion",Expresion.class);
		System.out.println(expression);
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression ex = parser.parseExpression("43+54+34");
		System.out.println(ex.getValue());
		
		context.close();
	}
}
