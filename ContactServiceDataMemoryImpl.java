package com.softtek.java.academy.service;

import com.softtek.java.academy.entidad.ContactType;
import com.softtek.java.academy.entidad.contact;
import com.softtek.java.academy.util.util;

public class ContactServiceDataMemoryImpl implements ContactServiceData {
contact[] contacts;
int currentIndex;
private util Util;

public ContactServiceDataMemoryImpl() {
	contacts = new contact [100];
	currentIndex =0;
	Util = new util();
}
@Override
public contact createContact(contact Contact) {
	contact newContact = new contact(
			Util.generateId(),
			Contact.getFirstName(),
			Contact.getLastName(),
			Contact.getMotherName(),
			Contact.getEmail(),
			Contact.getPhoneNumber(),
			Contact.getContactType()
			);
	contacts[currentIndex] = newContact;
	currentIndex++;
	return newContact;
}
@Override
public contact updateContact(String id, contact Contact) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean deleteContact(String id) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public contact findBydId(String id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public contact findByEmail(String id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public contact[] findByContactType(ContactType ContactType) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public contact[] findAll() {
	contact[]storedContacts= new contact[currentIndex];
	for(int i=0; i<contacts.length;i++) {
		contact c =contacts[i];
		if(c !=null) {
			storedContacts[i] = c;
		}
		else {
			break;
		}
	}
	return storedContacts;
}
     
}
