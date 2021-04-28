package com.entity;

public class User {
			private int id;
			private String pwd;
			private int jueseid;
			private String name;
			private String juese;
			private String bumen;
			private String rank;
			
			public String getJuese() {
				return juese;
			}
			public User(int id, String pwd, int jueseid, String name, String juese, String bumen, String rank, int bmid,
					int zcid) {
				super();
				this.id = id;
				this.pwd = pwd;
				this.jueseid = jueseid;
				this.name = name;
				this.juese = juese;
				this.bumen = bumen;
				this.rank = rank;
				this.bmid = bmid;
				this.zcid = zcid;
			}
			public User() {
				// TODO Auto-generated constructor stub
			}
			public void setJuese(String juese) {
				this.juese = juese;
			}
			public String getBumen() {
				return bumen;
			}
			public void setBumen(String bumen) {
				this.bumen = bumen;
			}
			public String getRank() {
				return rank;
			}
			public void setRank(String rank) {
				this.rank = rank;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getPwd() {
				return pwd;
			}
			public void setPwd(String pwd) {
				this.pwd = pwd;
			}
			public int getJueseid() {
				return jueseid;
			}
			public void setJueseid(int jueseid) {
				this.jueseid = jueseid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getBmid() {
				return bmid;
			}
			public void setBmid(int bmid) {
				this.bmid = bmid;
			}
			public int getZcid() {
				return zcid;
			}
			public void setZcid(int zcid) {
				this.zcid = zcid;
			}
			private int bmid;
			private int zcid;
}
