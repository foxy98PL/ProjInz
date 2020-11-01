package pl.tomacie861.ProjInz.PatientAllergy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.tomacie861.ProjInz.patientInfo.Model;

@Repository
public interface AllergyRepository extends JpaRepository<AllergyModel,Long> {

	@Query(value = "select pesel,allergy from projinz.patientallergy where pesel = :pesel" , nativeQuery = true)
	public List<AllergyModel> getAllergies(@Param("pesel") Long pesel);
	
}
