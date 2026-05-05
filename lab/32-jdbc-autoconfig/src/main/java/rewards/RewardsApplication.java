package rewards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class RewardsApplication implements CommandLineRunner {

    static final String SQL = "SELECT count(*) FROM T_ACCOUNT";

    final Logger logger = LoggerFactory.getLogger(RewardsApplication.class);

    private final JdbcTemplate jdbcTemplate;

    public RewardsApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(RewardsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Long numberOfAccounts = jdbcTemplate.queryForObject(SQL, Long.class);
        logger.info("Number of accounts: {}", numberOfAccounts);
    }
}