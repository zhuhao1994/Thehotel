package com.hotel.pojo;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usertable generated by hbm2java
 */
public class Usertable implements java.io.Serializable {

	private Integer userid;
	private String username;
	private String password;
	private String realname;
	private Date userbirth;
	private String usersex;
	private String position;
	private double salary;
	private Float achievement;
	private Set hotelaccounts = new HashSet(0);
	private Set logtables = new HashSet(0);

	public Usertable() {
	}

	public Usertable(String username, String password, String realname, Date userbirth, String usersex, String position,
			double salary) {
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.userbirth = userbirth;
		this.usersex = usersex;
		this.position = position;
		this.salary = salary;
	}

	public Usertable(String username, String password, String realname, Date userbirth, String usersex, String position,
			double salary, Float achievement, Set hotelaccounts, Set logtables) {
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.userbirth = userbirth;
		this.usersex = usersex;
		this.position = position;
		this.salary = salary;
		this.achievement = achievement;
		this.hotelaccounts = hotelaccounts;
		this.logtables = logtables;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public Date getUserbirth() {
		return this.userbirth;
	}

	public void setUserbirth(Date userbirth) {
		this.userbirth = userbirth;
	}

	public String getUsersex() {
		return this.usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Float getAchievement() {
		return this.achievement;
	}

	public void setAchievement(Float achievement) {
		this.achievement = achievement;
	}

	public Set getHotelaccounts() {
		return this.hotelaccounts;
	}

	public void setHotelaccounts(Set hotelaccounts) {
		this.hotelaccounts = hotelaccounts;
	}

	public Set getLogtables() {
		return this.logtables;
	}

	public void setLogtables(Set logtables) {
		this.logtables = logtables;
	}

}
