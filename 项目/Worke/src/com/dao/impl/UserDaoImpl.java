package com.dao.impl;
import java.util.ArrayList;
import java.util.List;
import com.dao.BaseDao;
import com.dao.UserDao;
import com.entity.Bumen;
import com.entity.Juese;
import com.entity.Power;
import com.entity.Rank;
import com.entity.User;
public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public int denlu(String name, String pwd) {
		// TODO Auto-generated method stub
		String sql = "SELECT id FROM `user` WHERE `name`=? AND pwd=?";
		int num = 0;
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, name);
			pre.setString(2, pwd);
			rs = pre.executeQuery();
			while(rs.next()) {
				num = rs.getInt("id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return num;
	}

	@Override
	public List<Power> seleq(int jsid) {
		// TODO Auto-generated method stub
		List<Power> list = new ArrayList<Power>();
		String sql = "SELECT * FROM `power` WHERE id IN (SELECT qxid FROM `qxjues` WHERE jsid = ?)";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, jsid);
			rs = pre.executeQuery();
			while(rs.next()) {
				Power qx=new Power();
				qx.setId(rs.getInt(1));
				qx.setQxname(rs.getString(2));
				qx.setBtn(rs.getString(3));
				qx.setFatherid(rs.getInt(4));
				qx.setUrl(rs.getString(5));
				qx.setType(rs.getInt(6));
				qx.setFunction(rs.getString(7));
				list.add(qx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public List<User> seleuse() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		String sql = "SELECT user.id,user.name,juese.`roe`,bumen.`bu`,rank.`raname` FROM `user`,`juese`,`bumen`,`rank` WHERE user.jueseid=juese.`id` AND user.`bmid`=bumen.`id` AND user.`zcid`=rank.`id`";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				User yg=new User();
				yg.setId(rs.getInt(1));
				yg.setName(rs.getString(2));
				yg.setJuese(rs.getString(3));
				yg.setBumen(rs.getString(4));
				yg.setRank(rs.getString(5));
				list.add(yg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public List<Power> seleJsJuese(int fid, int jsid) {
		// TODO Auto-generated method stub
		List<Power> list = new ArrayList<Power>();
		String sql = "SELECT * FROM `power` WHERE fatherid =? AND `type`=3 AND id IN (SELECT qxid FROM `qxjues` WHERE jsid = ?)";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, fid);
			pre.setInt(2, jsid);
			rs = pre.executeQuery();
			while(rs.next()) {
				Power qx=new Power();
				qx.setId(rs.getInt(1));
				qx.setQxname(rs.getString(2));
				qx.setBtn(rs.getString(3));
				qx.setFatherid(rs.getInt(4));
				qx.setUrl(rs.getString(5));
				qx.setType(rs.getInt(6));
				qx.setFunction(rs.getString(7));
				list.add(qx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public List<Juese> seleJuese() {
		// TODO Auto-generated method stub
		List<Juese> list = new ArrayList<Juese>();
		String sql = "SELECT id,roe FROM `juese`";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				Juese js = new Juese();
				js.setId(rs.getInt(1));
				js.setRoe(rs.getString(2));
				list.add(js);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public List<Bumen> seleBumen() {
		// TODO Auto-generated method stub
		List<Bumen> list = new ArrayList<Bumen>();
		String sql = "SELECT id,bu FROM `bumen`";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				Bumen bm = new Bumen();
				bm.setId(rs.getInt(1));
				bm.setBu(rs.getString(2));
				list.add(bm);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public List<Rank> seleRank() {
		// TODO Auto-generated method stub
		List<Rank> list = new ArrayList<Rank>();
		String sql = "SELECT id,raname FROM `rank`";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				Rank zc = new Rank();
				zc.setId(rs.getInt(1));
				zc.setRaname(rs.getString(2));
				list.add(zc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public int addUser(User yg) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO `user`(pwd,jueseid,`name`,bmid,zcid) VALUES(?,?,?,?,?)";
		return operaction(sql, yg.getPwd(),yg.getJueseid(),yg.getName(),yg.getBmid(),yg.getZcid());
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from `user` where id = ?";
		return operaction(sql, id);
	}

	@Override
	public User echoUser(int id) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		User yg = null;
		String sql = "SELECT * FROM `user` WHERE user.id =?";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			rs = pre.executeQuery();
			while(rs.next()) {
				yg=new User();
				yg.setId(rs.getInt(1));
				yg.setName(rs.getString(2));
				yg.setJueseid(rs.getInt(3));
				yg.setBmid(rs.getInt(4));
				yg.setZcid(rs.getInt(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return yg;
	}

	@Override
	public int updateUser(User yg) {
		// TODO Auto-generated method stub
		String sql = "UPDATE `user` SET `name` = ?,jueseid =?,bmid =?,zcid =? WHERE id =?";
		return operaction(sql, yg.getName(),yg.getJueseid(),yg.getBmid(),yg.getZcid(),yg.getId());
	}

	@Override
	public List<Power> selePower() {
		// TODO Auto-generated method stub
		List<Power> list = new ArrayList<Power>();
		String sql = "SELECT * FROM `power`";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				Power qx=new Power();
				qx.setId(rs.getInt(1));
				qx.setQxname(rs.getString(2));
				qx.setBtn(rs.getString(3));
				qx.setFatherid(rs.getInt(4));
				qx.setUrl(rs.getString(5));
				qx.setType(rs.getInt(6));
				qx.setFunction(rs.getString(7));
				list.add(qx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;	
	}

	@Override
	public List<Juese> seleALLujs() {
		// TODO Auto-generated method stub
		List<Juese> list = new ArrayList<Juese>();
		String sql = "SELECT juese.id,juese.roe,user.`name`FROM `juese`,`user` WHERE juese.`id`=user.`jueseid` ORDER BY juese.roe";
		conn = getconnection();
		try {
			pre = conn.prepareStatement(sql);
			rs = pre.executeQuery();
			while(rs.next()) {
				Juese js = new Juese();
				js.setId(rs.getInt(1));
				js.setRoe(rs.getString(2));
				js.setName(rs.getString(3));
				list.add(js);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

}
