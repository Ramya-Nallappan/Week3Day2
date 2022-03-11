//Classroom Assignment 1
package Week3Day2;

public class MyBank {

	public static void main(String[] args) {
     SBI Obj = new SBI();// Object creation for SBI Implementation Class
     Obj.openAccount();//SBI
     Obj.provideCreditCard();//SBI
     Obj.provideDebitCard();//Concrete method in SBI
     
     RBI Obj2 = new SBI(); // Object created to restrict to access only the implementation methods.Here Obj2 cant access the concrete methods.
     Obj2.openAccount();
     Obj2.provideCreditCard();

	}

}
