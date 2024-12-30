package com.spec.venu;

public class isvalidIPAddress {

	public static void main(String[] args) {
		String input = "172.16.254.1";
		input = input.replace('.', ' ');
		String[]data = input.split(" ");
		//1172 16 254 1
		int num =0;
		boolean isvalid = false;
		if(data.length ==4) 
		 {
			for(int i=0;i<data.length;i++) {
				num = Integer.parseInt(data[i]);
				if((num>=0) &&(num<=255)) {
					isvalid = true;
				}else {
					isvalid = false;
					break;
				}
			}
		}
		if(isvalid == true) {
			System.out.println("valid IPv4 Address");
			}else {
				System.out.println("Not a valid Adress");
			}
		}

}
