package com.fsep.DAO;


import com.fsep.DB.JDBCTemplate;

/**
 * 03/10/16
 *
 * @author Dinar Rafikov (First Software Engineering Platform)
 * @version 1.0
 */
public class NameDao {
    //language=SQL
    private static final String SQL_SAVE_NAME = "INSERT INTO names (name) VALUES (?);";
    //language=SQL
    private static final String SQL_IS_EXISTS_NAME = "SELECT CASE WHEN EXISTS(SELECT id FROM names WHERE name LIKE ?) THEN TRUE ELSE FALSE END;";

    public static void addName(String name) {
        JDBCTemplate.getInstance().update(SQL_SAVE_NAME, name);
    }

    public static boolean isExistsName(String name) {
        return JDBCTemplate.getInstance().queryForObject(SQL_IS_EXISTS_NAME, boolean.class, name);
    }
}
