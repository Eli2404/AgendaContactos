package com.softtek.java.academy.service;

import com.softtek.java.academy.entidad.contact;
import com.softtek.java.academy.entidad.ContactType;
import com.softtek.java.academy.service.ContactServiceData;


public class PlaceHolderContacts {
private contact Contact;
private contact Friend;

public static void main(String[] args) {
	PlaceHolderContacts p= new PlaceHolderContacts();
	p.crearContactos();
	
	ContactServiceData csd= new ContactServiceDataMemoryImpl();
	contact myContact = csd.createContact(p.Contact);
	contact myFriendContact = csd.createContact(p.Friend);
	contact[] Contacts = csd.findAll();
	
	
	
	for(contact c: Contacts) {
		System.out.println(c);
		
	}
}
public void crearContactos() {
    Contact = new contact();
    Contact.setFirstName("Eli");
    Contact.setLastName("Hdz");
    Contact.setEmail("javacAcademy@softtek.com");
    Contact.setPhoneNumber("987123456");

    Friend = new contact("2", "Elizabeth", "Granados", "Hernandez", "java-Softtek.hotmail.com", "987456123", ContactType.FRIEND);

}


}