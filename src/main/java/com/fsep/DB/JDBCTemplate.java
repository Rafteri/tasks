package com.fsep.DB;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

import static org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType.H2;

/**
 * 03/10/16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class JDBCTemplate {
    private static JdbcTemplate jdbcTemplate;

    private static DataSource DataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(H2)
                .addScript("db/sql/create-db.sql")
                .build();
    }

    public static JdbcTemplate getInstance() {
        if (jdbcTemplate == null) {
            jdbcTemplate = new JdbcTemplate(DataSource());
        }
        return jdbcTemplate;
    }
}
