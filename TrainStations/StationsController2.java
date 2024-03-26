package pkg1.trainstations2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationsController2 {
	@Autowired
	StationsRepo sr;
	@PostMapping("stations/loadData/{fname}")
	public List<StationsEntity> loadData(@PathVariable String fname) throws IOException {
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		ArrayList<String> location=new ArrayList<>();
		ArrayList<String> locaCode=new ArrayList<>();
		List<StationsEntity> list1=new ArrayList<>();
		String s1,s2="";
		for(int i=0;i<15;i++) {
			s1=sc1.nextLine();
			String[]arr1=s1.split(",");
			list1.add(new StationsEntity(arr1[0],arr1[1]));	
		}
		sr.saveAll(list1);		
		return list1;
	}
	
	@GetMapping("/station/getbyid/{id}")
	public List<String> getStationByID(@PathVariable int id){
		return sr.getLoactionByID(id);	
	}
	
	@GetMapping("/station/getbyname/{station_name}")
	public List<String> getStationByName(@PathVariable String station_name){
		return sr.getLocationByName(station_name);
	}

}
