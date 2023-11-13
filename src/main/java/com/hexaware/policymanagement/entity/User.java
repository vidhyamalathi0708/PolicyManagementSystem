package com.hexaware.policymanagement.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="User_details")
public class User implements Serializable
{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long userId;
		private String fname;
		private String lname;
		private String password;
		private String email;
		private String mobNo;
		private String userType;
		private String userCategory;
		private LocalDate dob;
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "addressId")
		private Address address;
		
		
		@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
		private Set<UserPolicy> users = new HashSet<UserPolicy>();
		
		
		
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobNo() {
			return mobNo;
		}
		public void setMobNo(String mobNo) {
			this.mobNo = mobNo;
		}
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getUserCategory() {
			return userCategory;
		}
		public void setUserCategory(String userCategory) {
			this.userCategory = userCategory;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		
		public Set<UserPolicy> getUsers() {
			return users;
		}
		public void setUsers(Set<UserPolicy> users) {
			this.users = users;
		}
		public User(long userId, String fname, String lname, String password, String email, String mobNo, String userType,
				String userCategory, Address address, LocalDate dob, Set<UserPolicy> users) {
			super();
			this.userId = userId;
			this.fname = fname;
			this.lname = lname;
			this.password = password;
			this.email = email;
			this.mobNo = mobNo;
			this.userType = userType;
			this.userCategory = userCategory;
			this.address = address;
			this.dob = dob;
			this.users = users;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", password=" + password
					+ ", email=" + email + ", mobNo=" + mobNo + ", userType=" + userType + ", userCategory="
					+ userCategory + ", address=" + address + ", dob=" + dob + "]";
		}
		
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void addUserPolicy(UserPolicy user)
		{
			user.setUser(this);
			
			Set<UserPolicy> set = getUsers() ;
			
			set.add(user);
		}
		
		
		
		
		
		
		
		
		
		
		
		


		
		


}
