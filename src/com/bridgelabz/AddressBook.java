package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program");
		AddressBookOperations add = new AddressBookOperations();
		Scanner sc = new Scanner(System.in);
		boolean exit = true ;
		do {
			System.out.println("Enter Option :\n1 To Add Contact\n2 To Add Multiple Persons \n3 Display Contact ");
			int option =sc.nextInt();
			switch(option) {
			case 1:
				add.addContact();
				break;
			case 2:
				add.addMultiplePerson();
				break;
			case 3:
				add.displayContacts();
				break;
			default:
				break;
			}
		}while(exit);

	}
}



