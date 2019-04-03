Feature: Barang kasirsaku Apps

  Narrative:
  As a user
  I want to Barang at kasirsaku android Apps

  @CRUDBarangHappyFlow
  Scenario: user melakukan CRUD Barang - happyflow
    Given user type nama barang
    Then user type stock barang
    Then user type harga satuan barang
    Then user type harga supplier barang
    Then user type scan barcode
    And user click button add barang

  @CRUDBarangHappyFlow2
  Scenario: user melakukan CRUD Barang - errorflow error Nama
    Given user longpress barang

  @CRUDBarangNoFillNamaErrorFlow
  Scenario: user melakukan CRUD Barang - errorflow Tanpa Mengisi Field Nama
    Given user go to LoginActivity
    When user type username Login as 'kasir_saku' and password as 'kasir_saku'
    Then user cant login as kasir saku
    When user click logo barang

  @CRUDBarangNoStockErrorFlow
  Scenario: user melakukan CRUD Barang - errorflow Tanpa Mengisi Field Stock
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click logo barang

  @CRUDBarangNoFillSupplierErrorFlow
  Scenario: user melakukan CRUD Barang - errorflow Tanpa Mengisi Field Supplier
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click logo barang

  @CRUDBarangNoFillHargaJualErrorFlow
  Scenario: user melakukan CRUD Barang - errorflow Tanpa Mengisi Field Harga Jual
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click logo barang

  @CRUDBarangNoFillAllFieldErrorFlow
  Scenario: ser melakukan CRUD Barang - errorflow Tanpa Mengisi Semua Field
    Given user go to LoginActivity
    When user type username as 'kasir_saku' and password as 'kasir_saku'
    Then user login as kasir saku
    When user click logo barang


