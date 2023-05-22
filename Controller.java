package ControllerP;

import java.net.URL;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import EntityP.Stud;
import JpaRepoP.UserRepo;

@RestController
public class Controller 
{
	@Autowired
	UserRepo ur;

	@PostMapping("/saveStud")
	public String saveStud(@RequestBody Stud u)
	{
		ur.save(u);
		return "Data Saved";
	}
	
	@GetMapping("/fetchData")
	public Stud fetchData(@RequestParam int id)
	{
		Optional<Stud>o=ur.findById(id);
		Stud s=o.get();
		return s;
	}
	
	@PutMapping("/updateDate")
	public String updateDate(@RequestBody Stud s)
	{
		ur.save(s);
		return "Data Updated";
	}
	
	@DeleteMapping("/dataDelete")
	public String dataDelete(@RequestParam int id)
	{
		ur.deleteById(id);
		return "data deleted";
	}
	


}
