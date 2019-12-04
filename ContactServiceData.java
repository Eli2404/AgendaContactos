package com.softtek.java.academy.service;

import com.softtek.java.academy.entidad.contact;
import com.softtek.java.academy.entidad.ContactType;

public interface ContactServiceData {
public contact createContact(contact Contact); 
public contact updateContact(String id, contact Contact);
public boolean deleteContact(String id);
public contact findBydId(String id);
public contact findByEmail(String id);
public contact[] findByContactType(ContactType ContactType);
public contact[] findAll();


}
