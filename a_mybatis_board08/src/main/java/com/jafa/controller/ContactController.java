package com.jafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jafa.domain.ContactDTO;
import com.jafa.domain.ContactVO;
import com.jafa.repository.ContactRepository;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/contact")
@Log4j
public class ContactController {
	
	@Autowired
	ContactRepository contactRepository;
	
	
	@GetMapping("/contactList")
	public String contactList(Model model) {
		model.addAttribute("contactList", contactRepository.contacList());
		return "contact/contactList";
	}
	
	@PostMapping("/addContact")
	public String addContact(ContactDTO contactDTO) {
		log.info(contactDTO.getContactList());
		contactRepository.addContact(contactDTO.getContactList());
		return "redirect:/contact/contactList";
	}
}
