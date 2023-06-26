Feature: Authentication (User)

  @Login-User
  Scenario: TC-Auth-1
    Given I set POST endpoints user login
    When I send POST HTTP request user login
    And I receive Message user Berhasil Login
    Then I receive valid HTTP response code 200

  @Login-User
  Scenario: TC-Auth-2
    Given I set POST endpoints user login
    When I send POST HTTP request user login empty email
    And I receive Message user Masukkan Email
    Then I receive valid HTTP response code 400

  @Login-User
  Scenario: TC-Auth-3
    Given I set POST endpoints user login
    When I send POST HTTP request user login wrong password
    And I receive Message user Email atau password salah
    Then I receive valid HTTP response code 400




  @Register-User
  Scenario: TC-Auth-6
    Given I set POST endpoints user register
    When I send POST HTTP request user register
    And I receive Message user Register Sukses
    Then I receive valid HTTP response code 200

  @Register-User
  Scenario: TC-Auth-7
    Given I set POST endpoints user register
    When I send POST HTTP request user register already exists email
    And I receive Message user Email already exists
    Then I receive valid HTTP response code 500

  @Register-User
  Scenario: TC-Auth-8
    Given I set POST endpoints user register
    When I send POST HTTP request user register not valid email
    And I receive Message user Email yang anda masukkan tidak valid
    Then I receive valid HTTP response code 500

  @Register-User
  Scenario: TC-Auth-9
    Given I set POST endpoints user register
    When I send POST HTTP request user register empty email
    And I receive Message user Masukkan Email
    Then I receive valid HTTP response code 500

  @Register-User
  Scenario: TC-Auth-10
    Given I set POST endpoints user register
    When I send POST HTTP request user register not valid phone
    And I receive Message user Phone tidak valid
    Then I receive valid HTTP response code 500




  @ForgotPassword-User
  Scenario: TC-Auth-16
    Given I set POST endpoints user forgot password
    When I send POST HTTP request user forgot password
    And I receive Message user Berhasil mengirim kode otp
    Then I receive valid HTTP response code 200

  @ForgotPassword-User
  Scenario: TC-Auth-17
    Given I set POST endpoints user forgot password
    When I send POST HTTP request user forgot password invalid email
    And I receive Message user Email yang anda masukkan tidak valid
    Then I receive valid HTTP response code 400

  @ForgotPassword-User
  Scenario: TC-Auth-18
    Given I set POST endpoints user forgot password
    When I send POST HTTP request user forgot password not exists email
    And I receive Message user Email tidak ditemukan
    Then I receive valid HTTP response code 400





  @ChangePassword-User
  Scenario: TC-Auth-21
    Given I set POST endpoints user change password
    When I send POST HTTP request user change password
    Then I receive valid HTTP response code 401

  @ChangePassword-User
  Scenario: TC-Auth-22
    Given I set POST endpoints user change password
    When I send POST HTTP request user change password invalid email
    Then I receive valid HTTP response code 401

  @ChangePassword-User
  Scenario: TC-Auth-23
    Given I set POST endpoints user change password
    When I send POST HTTP request user change password not exists email
    Then I receive valid HTTP response code 401






