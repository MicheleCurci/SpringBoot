package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class RESTController {

	@Autowired
	private ContactService contactService;

	@GetMapping
	public List<Contact> getAll() {
		return contactService.getList();

	}

	@GetMapping("/{id}")
	public Contact getById(@PathVariable("id") int id) {
		return contactService.getById(id);
	}

	@PostMapping("/create")
	public Contact create(@RequestBody Contact contact) {
		return contactService.create(contact);
	}
	
	@PostMapping("/print")
	public void printNow() {
		System.out.println("##### OK #####\n");
	}

	@PutMapping("/update")
	public Contact update(@RequestBody Contact contact) {
		return contactService.update(contact);
	}

	@DeleteMapping
	public void deleteAll() {
		contactService.deleteAll();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		contactService.delete(id);
	}

	

}


