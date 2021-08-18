package com.hayward.spring.notifications.Entity;


public class Users {

  private long id;
  private String email;
  private String password;
  private java.sql.Timestamp dob;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private long view;
  private String googleid;
  private String profile;
  private String firstname;
  private String lastname;
  private long notifications;
  private double longitude;
  private double latitude;
  private long miles;
  private long admin;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public java.sql.Timestamp getDob() {
    return dob;
  }

  public void setDob(java.sql.Timestamp dob) {
    this.dob = dob;
  }


  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public long getView() {
    return view;
  }

  public void setView(long view) {
    this.view = view;
  }


  public String getGoogleid() {
    return googleid;
  }

  public void setGoogleid(String googleid) {
    this.googleid = googleid;
  }


  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }


  public long getNotifications() {
    return notifications;
  }

  public void setNotifications(long notifications) {
    this.notifications = notifications;
  }


  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }


  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }


  public long getMiles() {
    return miles;
  }

  public void setMiles(long miles) {
    this.miles = miles;
  }


  public long getAdmin() {
    return admin;
  }

  public void setAdmin(long admin) {
    this.admin = admin;
  }

}
