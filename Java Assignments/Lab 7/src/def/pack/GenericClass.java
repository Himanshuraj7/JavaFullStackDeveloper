package def.pack;

class GenericClass <T>{
		T s;
		
		void f(T s){
		     this.s=s;
			System.out.println(s);
		}
		public static void main(String[] args) {
			
			GenericClass <Integer> o1=new  GenericClass <Integer>();
			GenericClass <String> o2=new  GenericClass <String>();
			o1.f(10);
			o2.f("hello");
		}
	}