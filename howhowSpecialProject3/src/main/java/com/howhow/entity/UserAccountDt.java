package com.howhow.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "useraccountdt")
@Component
public class UserAccountDt {

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "userAccountMt"))
	@Id
	@Column(name = "user_id", insertable = false, updatable = false)
	@GeneratedValue(generator = "generator")
	private int userID;

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "userAccountMt"))
	@Column(name = "account", unique = true,insertable = false,updatable = false)
	private String Account;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "given_name")
	private String givenName;

	@Column(name = "gamily_name")
	private String familyName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "birth")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private String Birth;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "creation_time")
	private java.util.Date acountCreationTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@Column(name = "system_time")
	private java.util.Date SystemTime;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "user_id",insertable = false,updatable = false)
	@JoinColumn(referencedColumnName = "account",insertable = false,updatable = false)
	private UserAccountMt userAccountMt;

	@OneToMany(mappedBy = "creator")
	private List<CourseBasic> createdCourseList = new ArrayList<CourseBasic>();

	@OneToMany(mappedBy = "userAccountDt")
	private List<Bulletin> bulletinList = new ArrayList<Bulletin>();

	@OneToMany(mappedBy = "userAccountDt")
	private List<BulletinReply> bulletinReplyList = new ArrayList<BulletinReply>();

	@OneToMany(mappedBy = "author")
	private List<Notes> notesList = new ArrayList<Notes>();

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		Account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public java.util.Date getAcountCreationTime() {
		return acountCreationTime;
	}

	public void setAcountCreationTime(java.util.Date acountCreationTime) {
		this.acountCreationTime = acountCreationTime;
	}

	public java.util.Date getSystemTime() {
		return SystemTime;
	}

	public void setSystemTime(java.util.Date systemTime) {
		SystemTime = systemTime;
	}

	public UserAccountMt getUserAccountMt() {
		return userAccountMt;
	}

	public void setUserAccountMt(UserAccountMt userAccountMt) {
		this.userAccountMt = userAccountMt;
	}

	public List<Bulletin> getBulletinList() {
		return bulletinList;
	}

	public void setBulletinList(List<Bulletin> bulletinList) {
		this.bulletinList = bulletinList;
	}

	public List<BulletinReply> getBulletinReplyList() {
		return bulletinReplyList;
	}

	public void setBulletinReplyList(List<BulletinReply> bulletinReplyList) {
		this.bulletinReplyList = bulletinReplyList;
	}

	public List<Notes> getNotesList() {
		return notesList;
	}

	public void setNotesList(List<Notes> notesList) {
		this.notesList = notesList;
	}

	public List<CourseBasic> getCreatedCourseList() {
		return createdCourseList;
	}

	public void setCreatedCourseList(List<CourseBasic> createdCourseList) {
		this.createdCourseList = createdCourseList;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	

}