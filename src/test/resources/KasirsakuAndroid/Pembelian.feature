Feature: Pembelian kasirsaku Apps

  Narrative:
  As a user
  I want to Pembelian at kasirsaku android Apps

  @PembelianHappyFlow
  Scenario: user melakukan Pembelian Barang - happyflow
    Given user click btn search
    When user type barang
    Then user click btn Add To Cart
    Then user click btn Checkout
    And user type total bayar pelanggan
    Then user click btn bayar
    And user click btn Ok
    Then user click btn Selesai
