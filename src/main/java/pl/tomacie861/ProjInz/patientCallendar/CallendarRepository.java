package pl.tomacie861.ProjInz.patientCallendar;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CallendarRepository  extends JpaRepository<CallendarModel,Long>{

	
	@Query(value = "select pesel,docid,datefrom,dateto from projinz.patientcallendar where docid = :docid order by dateto", nativeQuery = true)
	public List<CallendarModel> getPatients(@Param("docid") Long docId);

	@Modifying
	@Query(value ="delete from projinz.patientcallendar where pesel =:pesel" ,nativeQuery = true)
	public void deletePatient(@Param("pesel") Long pesel);
}
