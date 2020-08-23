package cc.oltremare.querydatawithsql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cc.oltremare.querydatawithsql.mapper")
public class QuerydatawithsqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydatawithsqlApplication.class, args);
	}

}
