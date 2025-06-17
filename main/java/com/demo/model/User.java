package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "a_id")
	    private int aid;
	    @Column(name = "a_name")
	    private String aname;
	    private String tech;
	    
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public User(int aid, String aname, String tech) {
			super();
			this.aid = aid;
			this.aname = aname;
			this.tech = tech;
		}
		public User() {
			super();
		}
	    
}
