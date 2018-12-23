package com.fd.service;

import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import com.fd.microSevice.web.PortApplicationListener;
import com.fd.myshardingfordata.helper.ConnectionManager;
import com.fd.myshardingfordata.helper.TransManager;

@ServletComponentScan("com.fd.microSevice.web")
@SpringBootApplication
public class MymicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymicroserviceApplication.class, args);
	}

	@Bean
	public PortApplicationListener portApplicationListener() {
		return new PortApplicationListener();
	}

	@Bean
	public TransManager transManager() {
		TransManager trans = new TransManager();
		trans.setConnectionManager(connectionManager());
		return trans;
	}

	@Autowired
	private DataSource ds;

	@Bean
	public ConnectionManager connectionManager() {
		ConnectionManager conm = new ConnectionManager();
		conm.setGenerateDdl(true);
		conm.setShowSql(false);
		conm.setInitConnect("set  names  utf8mb4");
		conm.setDataSource(ds);
		conm.setReadDataSources(Arrays.asList(ds));
		return conm;
	}
}
