package pl.tomacie861.ProjInz.patientTreatment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.tomacie861.ProjInz.patientInfo.Model;


@Repository
public interface TreatRepository extends JpaRepository<TreatModel,Long> {

	
	@Query(value = "select pesel,icddisease,icdnbr,icdsubtype from projinz.patienticd10 p " , nativeQuery = true)
	public TreatModel selectPatientSingleTreatment(@Param("pesel") Long pesel);
	
	
	@Query(value = "select pesel,icddisease,icdnbr,icdsubtype from projinz.patienticd10 p"  , nativeQuery = true)
	public List<TreatModel> selectPatientTreatment(@Param("pesel") Long pesel);
}
