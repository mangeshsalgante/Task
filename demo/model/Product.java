package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int pid;
	private String pname;
	private String ptype;
	private String pcategory;
	private String pfeatures;
	private String pprice;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory
				+ ", pfeatures=" + pfeatures + ", pprice=" + pprice + "]";
	}

	private int getPid() {
		return pid;
	}

	private void setPid(int pid) {
		this.pid = pid;
	}

	private String getPname() {
		return pname;
	}

	private void setPname(String pname) {
		this.pname = pname;
	}

	private String getPtype() {
		return ptype;
	}

	private void setPtype(String ptype) {
		this.ptype = ptype;
	}

	private String getPcategory() {
		return pcategory;
	}

	private void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	private String getPfeatures() {
		return pfeatures;
	}

	private void setPfeatures(String pfeatures) {
		this.pfeatures = pfeatures;
	}

	private String getPprice() {
		return pprice;
	}

	private void setPprice(String pprice) {
		this.pprice = pprice;
	}
}
