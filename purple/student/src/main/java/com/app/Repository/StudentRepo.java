package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.app.model.Register;


@Repository
public interface StudentRepo extends JpaRepository<Register, Long>{

	Optional<Register> findByEmail(String email);
	

	

	

	

}
