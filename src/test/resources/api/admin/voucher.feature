Feature: Voucher

  @GetAlVoucher
  Scenario: TC-Voucher-1
    Given I set GET endpoints voucher
    When I send GET HTTP request voucher
    Then I receive valid HTTP response code 200

  @GetAllVoucher
  Scenario: TC-Voucher-2
    Given I set GET endpoints voucher
    When I send GET HTTP request voucher without token
    Then I receive valid HTTP response code 401



  @GetVoucherById
  Scenario: TC-Voucher-3
    Given I set GET endpoints voucher by id
    When I send GET HTTP request voucher by id
    Then I receive valid HTTP response code 200

  @GetVoucherById
  Scenario: TC-Voucher-4
    Given I set GET endpoints voucher by wrong id
    When I send GET HTTP request voucher by wrong id
    Then I receive valid HTTP response code 500

  @GetVoucherById
  Scenario: TC-Voucher-5
    Given I set GET endpoints voucher by id
    When I send GET HTTP request voucher by id without token
    Then I receive valid HTTP response code 401



#  @CreateVoucher (ERROR Time)
#  Scenario: TC-Voucher-6
#    Given I set POST endpoints create voucher
#    When I send POST HTTP request create voucher
#    Then I receive valid HTTP response code 201
#
#  @CreateVoucher (ERROR Time)
#  Scenario: TC-Voucher-7
#    Given I set POST endpoints create voucher
#    When I send POST HTTP request create voucher incomplete data
#    Then I receive valid HTTP response code 400

  @CreateVoucher
  Scenario: TC-Voucher-8
    Given I set POST endpoints create voucher
    When I send POST HTTP request create voucher without token
    Then I receive valid HTTP response code 401




#  @UpdateVoucher(Error time)
#  Scenario: TC-Voucher-9
#    Given I set PUT endpoints voucher
#    When I send PUT HTTP request voucher
#    Then I receive valid HTTP response code 200

  @UpdateVoucher
  Scenario: TC-Voucher-10
    Given I set PUT endpoints voucher incomplete data
    When I send PUT HTTP request voucher incomplete data
    Then I receive valid HTTP response code 404

  @UpdateVoucher
  Scenario: TC-Voucher-11
    Given I set PUT endpoints voucher
    When I send PUT HTTP request voucher without token
    Then I receive valid HTTP response code 401




  @DeleteVoucher
  Scenario: TC-Voucher-12
    Given I set DELETE endpoints voucher
    When I send DELETE HTTP request voucher
    Then I receive valid HTTP response code 200

  @DeleteVoucher
  Scenario: TC-Voucher-13
    Given I set DELETE endpoints voucher by wrong id
    When I send DELETE HTTP request voucher by wrong id
    Then I receive valid HTTP response code 200

  @DeleteVoucher
  Scenario: TC-Voucher-14
    Given I set DELETE endpoints voucher
    When I send DELETE HTTP request voucher without token
    Then I receive valid HTTP response code 401