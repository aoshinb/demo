package com.entity;

public class Power {
			private int id;
			private String qxname;
			private String btn;
			private int fatherid;
			private String url;
			private int type;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getQxname() {
				return qxname;
			}
			public void setQxname(String qxname) {
				this.qxname = qxname;
			}
			public String getBtn() {
				return btn;
			}
			public void setBtn(String btn) {
				this.btn = btn;
			}
			public int getFatherid() {
				return fatherid;
			}
			public void setFatherid(int fatherid) {
				this.fatherid = fatherid;
			}
			public String getUrl() {
				return url;
			}
			public void setUrl(String url) {
				this.url = url;
			}
			public int getType() {
				return type;
			}
			public void setType(int type) {
				this.type = type;
			}
			public String getFunction() {
				return function;
			}
			public void setFunction(String function) {
				this.function = function;
			}
			private String function;
}
