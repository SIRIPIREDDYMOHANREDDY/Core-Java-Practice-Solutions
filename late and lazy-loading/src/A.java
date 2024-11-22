 public class  A 
{
	private  static A obj;     // =  new A();
	private A(){
         System.out.println("i am in A()");
    }
	public static A getObject(){
		synchronized(A.class){
		if(obj == null){
			obj = new A();//late loading or lazy loading
		}
		}
		return obj;	
	}
}
//getobject static any where you are calling 
//