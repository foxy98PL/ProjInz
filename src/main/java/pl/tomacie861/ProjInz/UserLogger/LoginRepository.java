package pl.tomacie861.ProjInz.UserLogger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel,Long> {

	@Query(value = "select id,login,password,token from projinz.logins where login=:login and password=:password", nativeQuery=true)
	public LoginModel getLoginToken(@Param("login") String login , @Param("password") String password);
}
