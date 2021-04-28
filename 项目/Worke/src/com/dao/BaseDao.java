package com.dao;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.spi.ResolveResult;

/**
 * BaseDao��
 * ������
 * ��������ɾ�ĵĹ�������
 * @author Lenovo
 *
 */
public class BaseDao {
	/*private static String driver;
	private static String url;
	private static String user;
	private static String password;*/
	public Connection conn=null;
	public PreparedStatement pre=null;
	public ResultSet rs=null;
	int num=0;
	
	
	private ResourceBundle rb = ResourceBundle.getBundle("database");
	
	String driver = rb.getString("driver");
	String url=rb.getString("url");
	String user=rb.getString("user");
	String password=rb.getString("password");
	
	//�����������������ݿ�
	public Connection getconnection(){
		if(conn==null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection(url,user,password);
			}  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	
	//�ر�
	public void closeAll(Connection conn,PreparedStatement pre,ResultSet rs){
		try {
			if(rs!=null){
				rs.close();
			}
			if(pre!=null){
				pre.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//��ɾ�Ĳ���
	public int operaction(String sql,Object... x){
		//�������ݿ�
		conn=getconnection();
			try {
				pre=conn.prepareStatement(sql);
				if(pre!=null){
					//������ֵ
					for (int i = 0; i < x.length; i++) {
						pre.setObject(i+1, x[i]);
					}
					num=pre.executeUpdate();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return num;
	}
	
	//��ҳ������
	public int getTotalCount(String sql) {
		Connection connection=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=5;
		
		try {
			connection=this.getconnection();
			pstmt=connection.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()){
				count=rs.getInt("count");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}/*finally{
			this.closeAll(connection, pstmt, rs);
		}*/
		return count;
	}
	
	
	public boolean existColumn(ResultSet rs,String columnName){
		boolean result = false;
		try {
			if(rs.findColumn(columnName) > 0){
				result = true;
			}
		} catch (SQLException e) {
			result = false;
		}
		return result;
	}
}