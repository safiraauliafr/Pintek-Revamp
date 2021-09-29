Feature: Signup Revamp

  Scenario Outline: User Signup to Pintek Website
    Given I navigate to the home page
    When user click button Masuk
    When user click button Daftar
    And user inputs sign up field with name <nama_lengkap> phone <nomor_telepon> email <alamat_email> password <new_password> retype_password <confirm_password>
    And user click on button Daftar
    And user scroll down tnc page
    And user click button Setuju dan Lanjutkan
    And user get otp code
    And user click button Verifikasi in phone verification page
    And user get email verify

    Examples: 
      | nama_lengkap | nomor_telepon | alamat_email          | new_password | confirm_password |
      | Permana Adi  |   85814464227 | permana.adi@pintek.id | P!ntek123    | P!ntek123        |
