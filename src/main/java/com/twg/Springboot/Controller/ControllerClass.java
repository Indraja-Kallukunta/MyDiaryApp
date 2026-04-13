package com.twg.Springboot.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twg.Springboot.Entities.EntriesOfUser;
import com.twg.Springboot.Entities.Users;
import com.twg.Springboot.Service.EntriesServiceInterface;
import com.twg.Springboot.Service.UserServiceInterface;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerClass {
	
	@Autowired
	private UserServiceInterface userServiceInterface ;
	
	@Autowired
	private EntriesServiceInterface entriesServiceInterface;
	
	@Autowired
	HttpSession session;
	
	
	@GetMapping("/login")
	public String login() {
		return "loginpage";	
	}
	@GetMapping("/register")
	public String register() {
		return "registerpage";
		
	}
	
	@PostMapping("/registeruser")
	public String registeruser(@ModelAttribute("users") Users user) {
		 Users user1 = userServiceInterface.saveUser(user);
		return "registersuccess";	
	}
	
	@PostMapping("/loginuser")
	public String loginuser(@ModelAttribute("users") Users user,Model model) {
		 Users user2 = userServiceInterface.findByUsername(user.getUsername());
		 session.setAttribute("users",user2);
		 if(user2 != null && (user.getPassword().equals(user2.getPassword()))) {
			 model.addAttribute("user", user);
			 List<EntriesOfUser> entries = null;
			 try {
				  entries = entriesServiceInterface.findByUserid(user2.getId());
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 model.addAttribute("entrieslist",entries);
			 Users user1 = (User3) session.getAttribute("users");
			 if(user1!=null) {
			 return "Userhomepage";
			 }
		 }
		return "loginpage";
		
	}
	
	@GetMapping("/addEntry")
	public String addentry() {
		Users user = (Users) session.getAttribute("users");
		String viewname = "addEntry";
	if(user == null) {
		viewname="loginpage";
	}
	return viewname;
	}
	
	@PostMapping("/saveentry")
	public String addentrypro(@ModelAttribute("entriesOfUser") EntriesOfUser entriesOfUser,Model model) {
		EntriesOfUser entriesOfUser1 = entriesServiceInterface.saveEntry(entriesOfUser);
		 Users user = (Users) session.getAttribute("users");
			List<EntriesOfUser> entries = null;
			try {
				entries = entriesServiceInterface.findByUserid(user.getId());
			}catch(Exception e) {
				e.printStackTrace();
			}
			model.addAttribute("entrieslist",entries);
			model.addAttribute("user",user);
			if(user!=null) {
			return "Userhomepage";
			}
			return null;
	}
	
	@GetMapping("/viewEntry")
	public String viewentry(@RequestParam("id") long id,Model model) {
		 Users user = (Users) session.getAttribute("users");
		EntriesOfUser entriesOfUser1 = null;
		try {
		      entriesOfUser1 = entriesServiceInterface.getById(id) ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entry",entriesOfUser1);
		if(user != null) {
		return "viewEntry";
		}
		return "loginpage";
	}
	@GetMapping("/userhome")
	public String userhome(Model model) {
		 Users user = (Users) session.getAttribute("users");
		List<EntriesOfUser> entries = null;
		try {
			entries = entriesServiceInterface.findByUserid(user.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist",entries);
		model.addAttribute("user",user);
		if(user!=null) {
		return "Userhomepage";
		}
		return "loginpage";
	}
	
	@GetMapping("/updateEntry")
	public String updateeentry(@RequestParam("id") long id,Model model) {
		Users user = (Users) session.getAttribute("users");
		EntriesOfUser entriesOfUser1 = null;
		try {
		      entriesOfUser1 = entriesServiceInterface.getById(id) ;
		}catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entry",entriesOfUser1);
		if(user!=null) {
		return "updateEntry";
		}
		return "loginpage";
	}
	@PostMapping("/updateEntryProcess")
	public String updateprocess(@ModelAttribute("entriesOfUser") EntriesOfUser entry,Model model) {
		EntriesOfUser entriesOfUser = entriesServiceInterface.updateEntry(entry);
		Users user = (Users) session.getAttribute("users");
		List<EntriesOfUser> entries = null;
		try {
			entries = entriesServiceInterface.findByUserid(user.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist",entries);
		model.addAttribute("user",user);
		if(user!=null) {
		return "Userhomepage";
		}
		return "loginpage";
	}
	
	
	@GetMapping("/deleteEntry")
	public String deleteprocess(@RequestParam("id") long id,Model model) {
		EntriesOfUser entry= null;
		try {
		      entry = entriesServiceInterface.getById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		entriesServiceInterface.deleteEntry(entry);
		Users user = (Users) session.getAttribute("users");
		List<EntriesOfUser> entries = null;
		try {
			entries = entriesServiceInterface.findByUserid(user.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("entrieslist",entries);
		model.addAttribute("user",user);
		return "Userhomepage";
	}
	
	@GetMapping("/signout")
	public String signout() {
		session.invalidate();
		return "loginpage";
	}
	
		
	
	

}
