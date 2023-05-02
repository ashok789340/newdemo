package net.javaguides.springboot.dto;

import java.util.Date;

public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String contactNumber;
	private String alternateNumber;
	private Double yearsOfExperience;
	private String address;
	private String gender;
	private Integer age;
	private Date Date_of_birth;
	private String company;
	private Double currentSalary;
	private Double expectedSalary;
	private String preferredWorkLocation;
	private String officeNoticePeriod;
	private String negotiatedNoticePeriod;
	private String state;
	private String Zipcode;
	private String country;
	private String comments;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	public Double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(Double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDate_of_birth() {
		return Date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		Date_of_birth = date_of_birth;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getCurrentSalary() {
		return currentSalary;
	}
	public void setCurrentSalary(Double currentSalary) {
		this.currentSalary = currentSalary;
	}
	public Double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(Double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	public String getPreferredWorkLocation() {
		return preferredWorkLocation;
	}
	public void setPreferredWorkLocation(String preferredWorkLocation) {
		this.preferredWorkLocation = preferredWorkLocation;
	}
	public String getOfficeNoticePeriod() {
		return officeNoticePeriod;
	}
	public void setOfficeNoticePeriod(String officeNoticePeriod) {
		this.officeNoticePeriod = officeNoticePeriod;
	}
	public String getNegotiatedNoticePeriod() {
		return negotiatedNoticePeriod;
	}
	public void setNegotiatedNoticePeriod(String negotiatedNoticePeriod) {
		this.negotiatedNoticePeriod = negotiatedNoticePeriod;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public UserRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegistrationDto(String firstName, String lastName, String email, String password, String contactNumber,
			String alternateNumber, Double yearsOfExperience, String address, String gender, Integer age,
			Date date_of_birth, String company, Double currentSalary, Double expectedSalary,
			String preferredWorkLocation, String officeNoticePeriod, String negotiatedNoticePeriod, String state,
			String zipcode, String country, String comments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.contactNumber = contactNumber;
		this.alternateNumber = alternateNumber;
		this.yearsOfExperience = yearsOfExperience;
		this.address = address;
		this.gender = gender;
		this.age = age;
		Date_of_birth = date_of_birth;
		this.company = company;
		this.currentSalary = currentSalary;
		this.expectedSalary = expectedSalary;
		this.preferredWorkLocation = preferredWorkLocation;
		this.officeNoticePeriod = officeNoticePeriod;
		this.negotiatedNoticePeriod = negotiatedNoticePeriod;
		this.state = state;
		Zipcode = zipcode;
		this.country = country;
		this.comments = comments;
	}
	
}