package pl.tomacie861.ProjInz;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http
		.httpBasic()
		.and()
		.csrf()
		.disable()
		.authorizeRequests()
		.anyRequest()
		.authenticated();
		
	}
	
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth
		.jdbcAuthentication()
		.dataSource(dataSource)
.usersByUsernameQuery("select username,password,enabled from projinz.projauth p where username =?")
.authoritiesByUsernameQuery("select username,authority from projinz.projauth p where username =?")
.passwordEncoder(passwordEncoder());
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
	

