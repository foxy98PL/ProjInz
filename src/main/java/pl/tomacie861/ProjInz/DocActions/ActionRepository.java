package pl.tomacie861.ProjInz.DocActions;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.tomacie861.ProjInz.PatientAllergy.AllergyModel;


@Repository
@Transactional
public interface ActionRepository extends JpaRepository<ActionModel,Long> {
	@Modifying
	@Query(value = "\r\n"
			+ "update projinz.docinfo\r\n"
			+ "set docstatus = 11\r\n"
			+ "where docid = :docid" , nativeQuery = true)
	public void setStatus1(@Param("docid") Long docid);
	@Modifying
	@Query(value = "\r\n"
			+ "update projinz.docinfo\r\n"
			+ "set docstatus = 10\r\n"
			+ "where docid = :docid" , nativeQuery = true)
	public void setStatus0(@Param("docid") Long docid);
	
	@Query(value = "select docid,docstatus,docfirstname, docsurrname from projinz.docinfo" ,nativeQuery = true)
	public List<ActionModel> getDoctor();

}
