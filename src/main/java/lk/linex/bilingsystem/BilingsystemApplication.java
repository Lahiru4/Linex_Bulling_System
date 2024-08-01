package lk.linex.bilingsystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BilingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilingsystemApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	@Bean
	public PasswordEncoder PasswordEncoder(){
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				return null;
			}

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return false;
			}
		};
	}

}
