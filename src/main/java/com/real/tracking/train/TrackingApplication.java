package com.real.tracking.train;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@SpringBootApplication
@ComponentScan(basePackages={"com.real.tracking.*"})
public class TrackingApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(TrackingApplication.class, args);
	}
	
	public DataSourceInitializer dataSourceInitializer(@Qualifier("dataSource") final DataSource dataSource) {
	    ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
	    resourceDatabasePopulator.addScript(new ClassPathResource("/data.sql"));
	    DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
	    dataSourceInitializer.setDataSource(dataSource);
	    dataSourceInitializer.setDatabasePopulator(resourceDatabasePopulator);
	    return dataSourceInitializer;
	}

}
