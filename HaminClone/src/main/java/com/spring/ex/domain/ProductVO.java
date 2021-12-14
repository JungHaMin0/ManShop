package com.spring.ex.domain;

import java.sql.Date;

public class ProductVO {

	private int pdtNum;
	private String pdtBrand;
	private String pdtName;
	private int pdtPrice;
	private int pdtStock;
	private String pdtDes;
	private String pdtImg;
	private Date pdtDate;
	private String pdtCategory_main;
	private String pdtCategory_sub;
	private String mname;
	private String sname;
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getPdtNum() {
		return pdtNum;
	}
	public void setPdtNum(int pdtNum) {
		this.pdtNum = pdtNum;
	}
	public String getPdtBrand() {
		return pdtBrand;
	}
	public void setPdtBrand(String pdtBrand) {
		this.pdtBrand = pdtBrand;
	}
	public String getPdtName() {
		return pdtName;
	}
	public void setPdtName(String pdtName) {
		this.pdtName = pdtName;
	}
	public int getPdtPrice() {
		return pdtPrice;
	}
	public void setPdtPrice(int pdtPrice) {
		this.pdtPrice = pdtPrice;
	}
	public int getPdtStock() {
		return pdtStock;
	}
	public void setPdtStock(int pdtStock) {
		this.pdtStock = pdtStock;
	}
	public String getPdtDes() {
		return pdtDes;
	}
	public void setPdtDes(String pdtDes) {
		this.pdtDes = pdtDes;
	}
	public String getPdtImg() {
		return pdtImg;
	}
	public void setPdtImg(String pdtImg) {
		this.pdtImg = pdtImg;
	}
	public Date getPdtDate() {
		return pdtDate;
	}
	public void setPdtDate(Date pdtDate) {
		this.pdtDate = pdtDate;
	}
	public String getPdtCategory_main() {
		return pdtCategory_main;
	}
	public void setPdtCategory_main(String pdtCategory_main) {
		this.pdtCategory_main = pdtCategory_main;
	}
	public String getPdtCategory_sub() {
		return pdtCategory_sub;
	}
	public void setPdtCategory_sub(String pdtCategory_sub) {
		this.pdtCategory_sub = pdtCategory_sub;
	}
	
}
