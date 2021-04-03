package com.reilways.servicetain.database;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.reilways.servicetain.model.Train;

@Repository
public interface TrainDataBase extends MongoRepository<Train,String>{
	List<Train> findBystatus(String status);
}
