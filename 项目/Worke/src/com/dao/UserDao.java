package com.dao;

import java.util.List;

import com.entity.Bumen;
import com.entity.Juese;
import com.entity.Power;
import com.entity.Rank;
import com.entity.User;
public interface UserDao {
		public int denlu(String name,String pwd);
		public List<Power> seleq(int jsid);
		public List<User> seleuse();
		public List<Power> seleJsJuese(int fid,int jsid);
		public List<Juese> seleJuese();
		public List<Bumen> seleBumen();
		public List<Rank> seleRank();
		public int addUser(User yg);
		public int deleteUser(int id);
		public User echoUser(int id);
		public int updateUser(User yg);
		public List<Power> selePower();
		public List<Juese> seleALLujs();
}
