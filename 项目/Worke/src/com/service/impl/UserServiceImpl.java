package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.Bumen;
import com.entity.FenMenu;
import com.entity.Juese;
import com.entity.Power;
import com.entity.Rank;
import com.entity.User;
import com.service.UserService;
import com.utils.Layui;
public class UserServiceImpl implements UserService {
		UserDao userd=new UserDaoImpl();
	@Override
	public int denlu(String name, String pwd) {
		// TODO Auto-generated method stub
		return userd.denlu(name, pwd);
	}
	@Override
	public List<Power> seleq(int jsid) {
		// TODO Auto-generated method stub
		return userd.seleq(jsid);
	}
	@Override
	public List<User> seleuse() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Power> seleJsJuese(int fid, int jsid) {
		// TODO Auto-generated method stub
		return userd.seleJsJuese(fid, jsid);
	}
	@Override
	public List<Juese> seleJuese() {
		// TODO Auto-generated method stub
		return userd.seleJuese();
	}
	@Override
	public List<Bumen> seleBumen() {
		// TODO Auto-generated method stub
		return userd.seleBumen();
	}
	@Override
	public List<Rank> seleRank() {
		// TODO Auto-generated method stub
		return userd.seleRank();
	}
	@Override
	public int addUser(User yg) {
		// TODO Auto-generated method stub
		return userd.addUser(yg);
	}
	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userd.deleteUser(id);
	}
	@Override
	public User echoUser(int id) {
		// TODO Auto-generated method stub
		return userd.echoUser(id);
	}
	@Override
	public int updateUser(User yg) {
		// TODO Auto-generated method stub
		return userd.updateUser(yg);
	}
	@Override
	public Layui<Power> selePower() {
		// TODO Auto-generated method stub
		Layui<Power> layui = new Layui<Power>();
		List<Power> seleQX = userd.selePower();
		layui.setCode(0);
		layui.setCount(seleQX.size());
		layui.setMessage("");
		layui.setData(seleQX);
		return layui;
	}
	@Override
	public Layui<Juese> seleALLujs() {
		// TODO Auto-generated method stub
		List<Juese> seleALLYGJS = userd.seleALLujs();
		Layui<Juese> layui = new Layui<Juese>();
		layui.setCode(0);
		layui.setCount(seleALLYGJS.size());
		layui.setData(seleALLYGJS);
		layui.setMessage("");
		return layui;
	}
	@Override
	public Layui<User> seleYG() {
		// TODO Auto-generated method stub
		Layui<User> layui = new Layui<User>();
		List<User> seleYG = userd.seleuse();
		
		layui.setCode(0);
		layui.setCount(seleYG.size());
		layui.setMessage("");
		layui.setData(seleYG);
		
		return layui;
	}
	@Override
	public Layui<FenMenu> seleALLQXTree() {
		// TODO Auto-generated method stub
		Layui<FenMenu> layui = new Layui<FenMenu>();
		List<Power> seleQX = userd.selePower();
		List<FenMenu> fenList = new ArrayList<FenMenu>();
		layui.setCode(0);
		layui.setCount(seleQX.size());
		layui.setMessage("");
		for (Power qx : seleQX) {
			FenMenu fen = new FenMenu();
			fen.setId(qx.getId());
			fen.setParentId(qx.getFatherid());
			fen.setTitle(qx.getQxname());
			fen.setCheckArr("0");
			fenList.add(fen);
		}
		layui.setData(fenList);
		
		return layui;
	}

}
