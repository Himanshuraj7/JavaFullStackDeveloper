package Earlier;

class MultipleCatch{
	public static void main(String[] arg){
	int a[]={1,2,3};
	int x=9, y=0;
	
	try{
		a[5]=90;
		int z=x/y;
	}
	
	catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ 
		System.out.println("Exception caugth in first catch "+e);
		System.out.println("Exception caugth in first catch "+e.getMessage());
		e.printStackTrace();
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	}
}