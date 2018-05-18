package com.articlebuilder.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "user")
public class User {
  private String id;
  private String firstName;
  private String lastName;

  public User(){

  }

  /**
   * User model object.
   *
   * @param  id the unique id of the user
   * @param  firstName the first name of the user
   * @param  lastName the last name of the user
   * @param  username the username displayed publically
   *
   * @return [description]
   */
  public User(String id, String firstName, String lastName, String username){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
  }

  @DynamoDBHashKey(attributeName = "id")
  public String getId() {
    return id;
  }
 
  public void setId(String id) {
    this.id = id;
  }

  @DynamoDBHashKey(attributeName = "username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
 
  @DynamoDBAttribute(attributeName = "firstName")
  public String getFirstName() {
    return firstName;
  }
 
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
 
  @DynamoDBAttribute(attributeName = "lastName")
  public String getLastName() {
    return lastName;
  }
 
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
 
  @Override
  public String toString() {
    return String.format("Customer[id=%s, firstName='%s', lastName='%s', username='%s']", id, firstName, lastName, username);
  }
}