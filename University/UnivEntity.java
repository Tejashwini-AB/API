package pkg1.univ;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="university")
public class UnivEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String univ_name;
	public UnivEntity(String univ_name) {
		super();
		this.univ_name = univ_name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUniv_name() {
		return univ_name;
	}
	public void setUniv_name(String univ_name) {
		this.univ_name = univ_name;
	}
	
	
	
	

}

