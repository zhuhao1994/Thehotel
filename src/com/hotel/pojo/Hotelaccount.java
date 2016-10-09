package com.hotel.pojo;

import java.util.Date;

/**
 * Hotelaccount generated by hbm2java
 */
public class Hotelaccount implements java.io.Serializable {

	private Integer hid;
	private Customer customer;
	private Guestroom guestroom;
	private Usertable usertable;
	private float deposit;
	private Date cometime;
	private Date leavetime;
	private float consume;
	private float allconsume;
	private String remarks;
	private int accuntstatus;

	public Hotelaccount() {
	}
	
	public Hotelaccount(Customer customer, Guestroom guestroom, Usertable usertable, float deposit, Date cometime,
			float consume, float allconsume, int accuntstatus) {
		this.customer = customer;
		this.guestroom = guestroom;
		this.usertable = usertable;
		this.deposit = deposit;
		this.cometime = cometime;
		this.consume = consume;
		this.allconsume = allconsume;
		this.accuntstatus = accuntstatus;
	}

	public Hotelaccount(Customer customer, Guestroom guestroom, Usertable usertable, float deposit, Date cometime,
			Date leavetime, float consume, float allconsume, String remarks, int accuntstatus) {
		this.customer = customer;
		this.guestroom = guestroom;
		this.usertable = usertable;
		this.deposit = deposit;
		this.cometime = cometime;
		this.leavetime = leavetime;
		this.consume = consume;
		this.allconsume = allconsume;
		this.remarks = remarks;
		this.accuntstatus = accuntstatus;
	}

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Guestroom getGuestroom() {
		return this.guestroom;
	}

	public void setGuestroom(Guestroom guestroom) {
		this.guestroom = guestroom;
	}

	public Usertable getUsertable() {
		return this.usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public float getDeposit() {
		return this.deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public Date getCometime() {
		return this.cometime;
	}

	public void setCometime(Date cometime) {
		this.cometime = cometime;
	}

	public Date getLeavetime() {
		return this.leavetime;
	}

	public void setLeavetime(Date leavetime) {
		this.leavetime = leavetime;
	}

	public float getConsume() {
		return this.consume;
	}

	public void setConsume(float consume) {
		this.consume = consume;
	}

	public float getAllconsume() {
		return this.allconsume;
	}

	public void setAllconsume(float allconsume) {
		this.allconsume = allconsume;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getAccuntstatus() {
		return this.accuntstatus;
	}

	public void setAccuntstatus(int accuntstatus) {
		this.accuntstatus = accuntstatus;
	}

}
