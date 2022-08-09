package com.bridgelabz;

import java.util.Scanner;
import java .util.ArrayList;
public class AddressBookOperations {
	ArrayList<Contact>list=new ArrayList<>();
	Scanner sc =new Scanner (System.in);
	public void addContact() {
		Contact contact= new Contact();
		System.out.println("Enter first name: ");
		contact.setFirstName(sc.next());

		System.out.println("Enter last name: ");
		contact.setLastName(sc.next());

		System.out.println("Enter address: ");
		contact.setAddress(sc.next());

		System.out.println("Enter city: ");
		contact.setCity(sc.next());

		System.out.println("Enter state: ");
		contact.setState(sc.next());

		System.out.println("Enter zipcode: ");
		contact.setZip(sc.next());

		System.out.println("Enter phone Number: ");
		contact.setPhoneNumber(sc.next());


		System.out.println("Enter email id: ");
		contact.setEmailId(sc.next());
		list.add(contact);
	}
	public void addMultiplePerson() {
		System.out.println("Enter the number of persons whose details you want add to the address book ");
		Scanner sc= new Scanner(System.in);
		int no_of_person= sc.nextInt();
		for(int i=1;i<=no_of_person;i++) {
			addContact();
		}
	}
	public void displayContacts() {
		if(list.isEmpty()) {
			System.out.println("No contacts display");
		}
		else {
			for(Contact contact : list) {
				System.out.println(contact);
			}
		}
	}
}

