package rewards;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import config.RewardsConfig;


@Configuration
@Import(RewardsConfig.class)
public class SystemTestConfig {

    @Bean
    public DataSourceTransactionManager transactionManager() {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(dataSource());
        return txManager;
    }
	@Bean
	public DataSource dataSource(){
		return
			(new EmbeddedDatabaseBuilder()) //
			.addScript("classpath:rewards/testdb/schema.sql") //
			.addScript("classpath:rewards/testdb/data.sql") //
			.build();
	}	
	
	
	//	TODO-02: Define a bean named 'transactionManager' that configures a
	//           DataSourceTransactionManager.
	//           How does it know which dataSource to manage?
	
}
