package com.softtek.java.academy.entidad;

import com.softtek.java.academy.entidad.ContactType;
public class contact {
			    private String id;
			    private String firstName;
			    private String lastName;
			    private String MotherName;
			    private String email;
			    private String phoneNumber;
			    private ContactType ContactType;
			    
				public String getId() {
					return id;
				}
				
				public String getFirstName() {
					return firstName;
				}
				public void setFirstName(String firstName) {
					this.firstName = firstName;
				}
				public String getLastName() {
					return lastName;
				}
				public void setLastName(String lastName) {
					this.lastName = lastName;
				}
				public String getMotherName() {
					return MotherName;
				}
				public void setMotherName(String motherName) {
					MotherName = motherName;
				}
				public String getEmail() {
					return email;
				}
				public void setEmail(String email) {
					this.email = email;
				}
				public String getPhoneNumber() {
					return phoneNumber;
				}
				public void setPhoneNumber(String phoneNumber) {
					this.phoneNumber = phoneNumber;
				}
				public ContactType getContactType() {
					return ContactType;
				}
				public void setContactType(ContactType contactType) {
					ContactType = contactType;
				}
				
				public contact() {
			        this.ContactType = ContactType.UNKNOWN;
			    }
			    
				public contact(String id, String firstName, String lastName, String motherName, String email, String phoneNumber,
						ContactType contactType) {
					super();
					this.id = id;
					this.firstName = firstName;
					this.lastName = lastName;
					this.MotherName = motherName;
					this.email = email;
					this.phoneNumber = phoneNumber;
					this.ContactType = contactType;
				}

				 public String toString() {
				        StringBuilder sb = new StringBuilder();
				        sb.append("Contact ID: " + this.getId() + "\n");
				        sb.append("Contact First Name: " + this.getFirstName() + "\n");
				        sb.append("Contact Last Name: " + this.getLastName() + "\n");
				        sb.append("Contact Mother Name: " + this.getMotherName() + "\n");
				        sb.append("Contact eMail: " + this.getEmail() + "\n");
				        sb.append("Contact Phone Number: " + this.getPhoneNumber() + "\n");
				        sb.append("Contact Type: " + this.getContactType() + "\n");

				        return sb.toString();
				    }
}