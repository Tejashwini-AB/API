package pkg1.univ;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnivController {
	@Autowired
	
	public String adddata() throws FileNotFoundException {
		ArrayList<String> list1=new ArrayList<>();
		File f1=new File("univIndia.txt");
		Scanner sc1=new Scanner(f1);
		while(sc1.hasNext()) {
			list1.add(sc1.nextLine());
		}
		List<UnivEntity> records=new ArrayList<>();
		for (int i=0;i<list1.size();i++) {
			records.add(new UnivEntity(list1.get(i)));
			
		}
		
		
		
		
		
		return "Tejashwini";
	}

}
