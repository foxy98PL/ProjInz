package pl.tomacie861.ProjInz.DocActions;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.tomacie861.ProjInz.PatientAllergy.AllergyModel;


@Repository
public interface ActionRepository extends JpaRepository<ActionModel,Long> {
	
	@Query(value = "\r\n"
			+ "update projinz.docinfo\r\n"
			+ "set docstatus = 1\r\n"
			+ "where docid = :docid" , nativeQuery = true)
	public void setStatus1(@Param("docid") Long docid);
	
	@Query(value = "\r\n"
			+ "update projinz.docinfo\r\n"
			+ "set docstatus = 0\r\n"
			+ "where docid = :docid" , nativeQuery = true)
	public void setStatus0(@Param("docid") Long docid);

}
