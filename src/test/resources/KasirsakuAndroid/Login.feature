Feature: Login kasirsaku Apps

  Narrative:
  As a user
  I want to login at kasirsaku webpage

  @Login
  Scenario: user login at kasirsaku App happyflow
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku

  @invalidUsername
  Scenario: user login at kasirsaku App error flow invalid Username
    Given user go to LoginActivity
    When user type username as 'kasirsaku' and password as 'kasir_saku'
    Then user cant login as kasir saku

  @invalidPassword
  Scenario: user login at kasirsaku App error flow invalid Password
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasirsaku'
    Then user cant login as kasir saku

  @zeroUsername
  Scenario: user login at kasirsaku App error flow zero Username
    Given user go to LoginActivity
    When user type username as '' and password as 'kasir_saku'
    Then user cant login as kasir saku

  @zeroPassword
  Scenario: user login at kasirsaku App error flow invalid Password
    GGiven user go to LoginActivity
    When user type username as 'kasirsaku' and password as ''
    Then user cant login as kasir saku

  @zeroUsernameAndPassword
  Scenario: user login at kasirsaku App error flow zero Username and Password
    GGiven user go to LoginActivity
    When user type username as '' and password as ''
    Then user cant login as kasir saku