package com.maxinchun.keepass;

import org.junit.Test;
import org.linguafranca.pwdb.Database;
import org.linguafranca.pwdb.Group;
import org.linguafranca.pwdb.kdbx.KdbxCreds;
import org.linguafranca.pwdb.kdbx.simple.SimpleDatabase;

import java.io.FileInputStream;
import java.io.InputStream;

public class KeePassTest {
    /**
     * 密码文件
     */
    private static final String DB_FILE = "E:\\sync\\other\\test_key_database.kdbx";
    /**
     * 密码文件的管理密码
     */
    private static final String MANAGER_KEY = "123456";

    @Test
    public void test() throws Exception {
        KdbxCreds credentials = new KdbxCreds(MANAGER_KEY.getBytes());
//        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test1.kdbx");
        InputStream inputStream = new FileInputStream(DB_FILE);
        Database database = SimpleDatabase.load(credentials, inputStream);
        String dbName = database.getName();
        Group rootGroup = database.getRootGroup();

        System.out.println("===end===");
    }

}
