package test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ryl.bean.Columnn;
import com.ryl.service.ColumnService;
import com.ryl.utils.CSVUtils;

public class ColumnTest {
	@Test
	public void test(){
		ApplicationContext xml = new ClassPathXmlApplicationContext("spring.xml");
		ColumnService bean = xml.getBean(ColumnService.class);
		
		ArrayList<Columnn> list = new ArrayList<Columnn>();
		File file = new File("E:\\aaa.csv");
		List<String> importCsv = CSVUtils.importCsv(file);
		for (String string : importCsv) {
			String[] split = string.split(",");
		Columnn column = new Columnn(Integer.valueOf(split[0]), split[1], split[2], split[3], split[4], split[5], split[6], split[7], split[8], split[9], split[10]);
		list.add(column);
		}
		for (Columnn string : list) {
			bean.add(string);
		}
	}
}
