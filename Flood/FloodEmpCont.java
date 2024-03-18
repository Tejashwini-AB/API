package pkg1.floods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FloodEmpCont {
	@Autowired
	FloodEmpRepo fer;

	@PostMapping("/Emp/add")
	public String addEmployee(@RequestBody FloodEmpEntity fee) {
		fer.save(fee);
		return "Success";
	}

}
