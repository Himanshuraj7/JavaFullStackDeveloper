package Earlier;

public class ArrayOfObjects {
	int intNumbers[];
	ArrayOfObjects(int i){
		intNumbers=new int[i]; // array of objects being created
	}
	void populateArray() {
		for(int i=0; i<intNumbers.length; ++i)
			intNumbers[i]=i;
	}
	void displayContents() {
		for(int i=0; i<intNumbers.length; ++i)
			System.out.println("Number"+i+":"+intNumbers[i]);
	}
	public static void main(String[] args) {
		int intArg=Integer.parseInt(args[0]);
		ArrayOfObjects obj=new ArrayOfObjects(intArg); // value being passed to constructer
		obj.displayContents();
		obj.populateArray();
		System.out.println();
		obj.displayContents();
	}
}