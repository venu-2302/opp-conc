package com.spec.venu;

//is / has relation
class Person{
	int aadhar;
	String name;
	String address;
}
class Worker extends Person{ // is /// Worker is a Person
	Address permanetAddress;// Worker has permanent Address
	Address tempAddress;// Worker has temp Address
	Address offAddress;// Worker has office Address
}
class Address{
	String street;
	String flat;
	String pincode;
}
public class MultiInheritence {
	public static void main(String[] args) {
		
	}

}