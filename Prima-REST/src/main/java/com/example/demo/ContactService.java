package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ContactService {

	private List<Contact> db;

	public ContactService() {
		this.db = new ArrayList<>();
		Contact c1 = new Contact(1, "Mario", "Rossi", "3332345678", "m.rossi@red.it");
		Contact c2 = new Contact(2, "Francesca", "Gialli", "3332233444", "francesca.g@yllw.com");
		Contact c3 = new Contact(3, "Marco", "Verdi", "3334545456", "marco.verdi@vmail.com");
		Contact c4 = new Contact(4, "Michele", "Qwerty", "3334545456", "mic.qwe@vmail.com");
		db.add(c1);
		db.add(c2);
		db.add(c3);
		db.add(c4);
	}

	public List<Contact> getList() {

		for (Contact contact : db) {

			System.out.println(contact.toString());
		}
		return db;
	}

	public Contact getById(int id) {
		
		for (Contact contact : db) {

			if (id == contact.getId()) {
				System.out.println("Il contatto con id=" + id + " è: \n" + contact.toString());
				return contact;
			}
		}
		System.out.println("Non è presente un contatto con l'identificativo selezionato");
		return null;
	}

	public Contact create(Contact contact) {
		db.add(contact);
		System.out.println("è stato aggiunto un nuovo contatto");
		return contact;
	}

	public Contact update(Contact nuovoContatto) {
		for (Contact contact : db) {
			if (nuovoContatto.getId() == contact.getId()) {
				contact.setFirstName(nuovoContatto.getFirstName());
				contact.setLastName(nuovoContatto.getLastName());
				contact.setPhone(nuovoContatto.getPhone());
				contact.setEmail(nuovoContatto.getEmail());
				return contact;
			}
		}
		System.out.println("Non è presente un contatto con l'identificativo selezionato");
		return null;
	}

	public void delete(int id) {
		for (Contact contact : db) {
			if (id == contact.getId()) {
				db.remove(contact);
				System.out.println("Cancellazione contatto effettuata con successo");
			}
		}
		System.out.println("Non è presente un contatto con l'identificativo selezionato");
	}

	public void deleteAll() {
		db.clear();
		System.out.println("lista contatti cancellata");
	}
}
