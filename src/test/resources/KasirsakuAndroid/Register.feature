Feature: Register kasirsaku Apps

  Narrative:
  As a user
  I want to Register at kasirsaku android Apps

  @RegisterHappyFlow
  Scenario: user register at kasirsaku App happyflow
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as 'toko.makmur@gmail.com'
    When user type username as 'toko_makmur'
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as 'm4kmurj4y4'
    Then user already registered

  @AccountAlreadyExistErrorFlow
  Scenario: user Test API Signup - errorflow Account yang sudah ada
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Kasirsaku'
    When user type email as 'kasirsaku@gmail.com'
    When user type username as 'kasir_saku'
    When user type nama toko as 'kasir_saku'
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as 'kasir_saku'
    Then user cant register

  @NoFillNamaErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Nama
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as ''
    When user type email as 'toko.makmur@gmail.com'
    When user type username as 'toko_makmur'
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as 'm4kmurj4y4'
    Then user already registered


  @NoFillTokoErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Toko
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as 'toko.makmur@gmail.com'
    When user type username as 'toko_makmur'
    When user type nama toko as ''
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as 'm4kmurj4y4'
    Then user already registered

  @NoFillKotaErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Kota
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as 'toko.makmur@gmail.com'
    When user type username as 'toko_makmur'
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as '088230236000'
    When user type kota as ''
    When user type password as 'm4kmurj4y4'
    Then user already registered

  @NoFillUsernameErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Username
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as 'toko.makmur@gmail.com'
    When user type username as ''
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as 'm4kmurj4y4'
    Then user already registered

  @NoFillEmailErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Email
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as ''
    When user type username as 'toko_makmur'
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as 'm4kmurj4y4'
    Then user already registered

  @NoFillPhoneErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Phone
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as 'toko.makmur@gmail.com'
    When user type username as 'toko_makmur'
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as ''
    When user type kota as 'Surabaya'
    When user type password as 'm4kmurj4y4'
    Then user already registered

  @NoFillPasswordErrorFlow
  Scenario: user Test API Signup - errorflow Tanpa Mengisikan field Password
    Given user go to LoginActivity r
    Then user click Register Button r
    When user type nama lengkap as 'Hj. Samsudin'
    When user type email as 'toko.makmur@gmail.com'
    When user type username as 'toko_makmur'
    When user type nama toko as 'toko makmur'
    When user type nomor telefon as '088230236000'
    When user type kota as 'Surabaya'
    When user type password as ''
    Then user already registered
