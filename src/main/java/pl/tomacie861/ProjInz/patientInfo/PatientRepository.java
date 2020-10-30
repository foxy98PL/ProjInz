package pl.tomacie861.ProjInz.patientInfo;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface  PatientRepository extends JpaRepository<Model,Long> {

@Query(value ="select pesel,firstname,secondname,surrname,city,street,house_nbr from projinz.basicinformation b where pesel=:pesel and docid = :docid" , nativeQuery = true)
public Model selectPatient(@Param("pesel") Long pesel,@Param("docid") Long docid);

@Query(value="select pesel,firstname,secondname,surrname,city,street,house_nbr,docid from projinz.basicinformation b where docid =:docid",nativeQuery=true)
public List<Model> selectPatients(@Param("docid") Long docid);

}
