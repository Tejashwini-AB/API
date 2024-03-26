package pkg1.trainstations2;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StationsRepo extends JpaRepository<StationsEntity,Integer> {
	@Query(value="select station_name,station_code from stations where id=:id",nativeQuery=true)
	public List<String> getLoactionByID(@Param("id")int id);
	@Query(value="select station_code,station_name from stations where station_name=:station_name",nativeQuery=true)
	public List<String> getLocationByName(@Param("station_name")String station_name);
	

}

