package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

	
	
	Scanner s = new Scanner(System.in);
	
	
    ArrayList<Contact> list = new ArrayList<Contact>();
    
    
    public void operation(ArrayList<Contact> dataRead) {
		
		list = dataRead;
		boolean status = true;
		do {
			System.out.println("Choose Operation you want to do");
			   System.out .println("1. Add\t2. Edit\t3. delete\t4");
       switch (s.nextInt()) {
           case 1:
               add();
               break;
           case 2:
               edit();
               break;
           case 3:
               delete();
               break;
           case 4:
               status = false;
               break;
       }
		} while (status);
	}

	public void add() {
		Contact person = new Contact();
		AddressBook address = new AddressBook();
		System.out.println("Enter the First name:");
		String fname = s.next();
		person.setFname(fname);

		System.out.println("Enter the Last name:");
		String lname = s.next();
		person.setLname(lname);

		System.out.println("Enter the Phone Number:");
		Long phone = s.nextLong();
		person.setPhonenumber(phone);

		System.out.println("Enter the City:");
		String city = s.next();
		person.setCity(city);

		System.out.println("Enter the Zip:");
		long zip = s.nextLong();
		person.setZip(zip);

		System.out.println("Enter the State:");
		String state = s.next();
		person.setState(state);
		
		person.setAddress(address);
		list.add(person);
		

	}

	
	public void edit() {
        System.out.println("Enter your First name:");
        String fname = s.next();

        Iterator<Contact> iterator = list.listIterator();

        while (iterator.hasNext()) {
            Contact person = iterator.next();

            if (fname.equals(person.getFname())) {
                AddressBook address = person.getAddress();
                System.out.println("Choose field you want to add:");
                System.out
                        .println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
                switch (s.nextInt()) {
                    case 1:
                        System.out.println("Re-Correct your lastname");
                        person.setLname(s.next());
                        break;
                    case 2:
                        System.out.println("Re-Correct your Phone Number");
                        person.setPhonenumber(s.nextLong());
                        break;
                    case 3:
                        System.out.println("Re-Correct your City");
                        person.setCity(s.next());
                        break;
                    case 4:
                        System.out.println("Re-Correct your Zip");
                        person.setZip(s.nextLong());
                        break;
                    case 5:
                        System.out.println("Re-Correct your State");
                        person.setState(s.next());
                        break;
                }

            }
        }

    }
	
	public void delete() {
        System.out.println("Enter your First name:");
        String fname = s.next();

        Iterator<Contact> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Contact person = iterator.next();

            if (fname.equals(person.getFname())) {
                list.remove(person);
            }
        }
	}
}

