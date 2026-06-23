package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationEx {
	public static void main(String[] args) throws Exception{
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			
			PrintAnnotation printAnnotatiton = method.getAnnotation(PrintAnnotation.class);
			
			printLine(printAnnotatiton);
			
			method.invoke(new Service());
			
			printLine(printAnnotatiton);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i = 0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
