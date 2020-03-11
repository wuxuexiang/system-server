package cn.goktech.server;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.mysql.jdbc.Driver;

/**
 * @Classname Code
 * @Description TODO
 * @Date 2020/3/11 12:08
 * @Created by duanyu
 */
public class Code {
	public static void main(String[] args) {
		// 代码生成器
		AutoGenerator mpg = new AutoGenerator();
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		String projectPath = System.getProperty("user.dir");
		gc.setOutputDir(projectPath + "/server/src/main/java");
		gc.setAuthor("duany");
		gc.setSwagger2(true);
		gc.setMapperName("%sMapper");
		gc.setXmlName("%sMapper");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setControllerName("%sController");
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setUrl("jdbc:mysql://localhost:3306/system_server?useUnicode=true&useSSL=false&characterEncoding=utf8");
		dsc.setDriverName(Driver.class.getName());
		dsc.setUsername("root");
		dsc.setPassword("123456");
		mpg.setDataSource(dsc);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setModuleName("user");
		pc.setParent("cn.goktech.system");
		mpg.setPackageInfo(pc);

		StrategyConfig sc = new StrategyConfig();
		sc.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		sc.setInclude(new String[]{"sys_user"});// 需要生成的表
		sc.setEntityBooleanColumnRemoveIsPrefix(true);
		sc.setEntityLombokModel(true);
		mpg.setStrategy(sc);
		mpg.execute();
	}
}
