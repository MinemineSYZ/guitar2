package cumt.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBAccess {
	// ������̬ȫ�ֱ���
    static Connection conn;

    /* ��ȡ���ݿ����ӵĺ���*/
    public static Connection getConnection() {
        Connection con = null;  //���������������ݿ��Connection����
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");// ����Mysql��������
             
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "wangwei", "wangwei");// ������������
             
        } catch (Exception e) {
            System.out.println("���ݿ�����ʧ��" + e.getMessage());
        }
        return con; //���������������ݿ�����
    }
    public static void main(String[] args) {
		getConnection();
	}

    
}
