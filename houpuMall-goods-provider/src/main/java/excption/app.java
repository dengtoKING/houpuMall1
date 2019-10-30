package excption;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan("com.houpu.mapper")
@SpringBootApplication(scanBasePackages="com.houpu")
public class app{
	public static void main(String[] args){
		SpringApplication.run(app.class, args);
	}
}
