package cc.oltremare.querydatawithsql;

import cc.oltremare.querydatawithsql.mapper.CacheMapper;
import cc.oltremare.querydatawithsql.dataobject.CacheDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class QuerydatawithsqlApplicationTests {
	@Autowired
	private CacheMapper mapper;

	@Test
	void contextLoads() {
		SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");// a为am/pm的标记
		Date now = new Date();// 获取当前时间
		System.out.println(sdf.format(now));
		for (int i = 0; i < 10000; i ++){
			mapper.selectById(1);
		}
		Date end = new Date();// 获取当前时间
		System.out.println(sdf.format(end));
	}
}
