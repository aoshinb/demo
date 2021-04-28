package com.service;

import java.util.List;

import com.entity.Bumen;
import com.entity.FenMenu;
import com.entity.Juese;
import com.entity.Power;
import com.entity.Rank;
import com.entity.User;
import com.utils.Layui;

public interface UserService {
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
	public Layui<Power> selePower();
	public Layui<Juese> seleALLujs();
	public Layui<User> seleYG();
	public Layui<FenMenu> seleALLQXTree();
}
