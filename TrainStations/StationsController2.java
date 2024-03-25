package pkg1.trainstations2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationsController2 {
	@PostMapping("stations/loadData")
	public String loadData(@PathVariable String fname) throws IOException {
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		String s1,s2="";
		for(int i=0;i<2;i++) {
			s1=sc1.nextLine();
			String[]arr1=s1.split(",");			
		}
		return "Success";
	}

}
