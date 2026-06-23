package ch06.singleton;

public class singletonEx {
	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton();
		//SIngleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
	    Singleton obj2 = Singleton.getInstance();
	    
	    if(obj1 == obj2) {
	    	System.out.println("동일");
	    }else {
	    	System.out.println("비동일");
	    }
	}
}
