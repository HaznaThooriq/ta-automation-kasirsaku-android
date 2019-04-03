Feature: Pelanggan kasirsaku Apps

  Narrative:
  As a user
  I want to Barang at kasirsaku android Apps

  @CRUDPelangganHappyFlow
  Scenario: user melakukan CRUD Pelanggn - happyflow
    Given user type username pelanggan
    Then user type nama pelanggan
    Then user type alamat pelanggan
    Then user type telepon pelanggan
    And user click button add pelanggan
