Feature: Apply Sekolah
  I want to use this template for my feature file

  Scenario Outline: Apply Sekolah Scenario
    Given I navigate to the home page
    When I login using username as <username> and password as <password>
    And user click option Akun Bisnis
    And user choose Sekolah for Company Entity
    And user choose industry type
    And user input company info for companyname <companyname> companyphone <companyphone> employeeqty <employeeqty> companywebsite <companywebsite>
    And user choose company address
    And user input companyaddress <companyaddress>
    And user upload document legalitas for letternum <letternum>
    And user click button Simpan to save section Company Information
    #And user click button Informasi Penanggung Jawab
    #And user input PIC Info name <nama_pj> gender <jenis_kelamin_pj> position <jabatan_pj> pob <tempat_lahir_pj> birth date <tgl_lahir_pj> month <bulan_lahir_pj> year <tahun_lahir_pj> email <email_pj> phone <no_telp_pj>
    #And user input PIC marriage status info <status_pj> birth date <tgl_lahir_pj> month <bulan_lahir_pj> year <tahun_lahir_pj>
    #And user input spouse info name <nama_pasangan>
    #And user input PIC address province <provinsi_pj> district <kab_kota_pj> subdistrict <kecamatan_pj> village <kelurahan_pj> address <alamat_pj>
    #And user tick info domicile address not same with KTP address
    #And user input PIC domicile province <prov_dom_pj> district <kab_kota_dom_pj> subdistrict <kec_dom_pj> village <kel_dom_pj> address <alamat_dom_pj>
    #And user upload PIC ktp document in KTP
    #And user input PIC ktp identity number <no_ktp_pj>
    #And user upload npwp document in NPWP Penanggung Jawab
    #And user input PIC npwp number <no_npwp_perusahaan_pj>
    #And user upload PIC selfie in Swafoto dengan KTP
    #And user upload PIC ktp document in KTP
    #And user input PIC ktp identity number <no_ktp_pj>
    #And user upload spouse selfie in Swafoto dengan KTP
    #And user upload spouse ktp document in KTP
    #And user input spouse ktp identity number <no_ktp_pasangan_pj>
    #And user click button Simpan to save section PIC
    #And user check consent to verify data
    #And user clicks button Simpan Semuanya
    #Then applicant b2b successfully created
    #And notification success is showing
    #And applicant status is Basic Completed
    Examples: 
      | username                  | password  | companyname      | companyphone | employeeqty | companywebsite | companyaddress                   | letternum | # no_nib_tdp_perusahaan | nama_pj | jenis_kelamin_pj | jabatan_pj | tempat_lahir_pj | tgl_lahir_pj | bulan_lahir_pj | tahun_lahir_pj | email_pj        | no_telp_pj | status_pj | provinsi_pj | kab_kota_pj     | kecamatan_pj | kelurahan_pj  | no_pos_pj | alamat_pj                 | no_ktp_pj       | no_npwp_perusahaan_pj |
      | sekolahrevamp@yopmail.com | P!ntek123 | Sekolah Automate |  81299433998 |         666 | www.google.com | Jalan Haji Sarin RT008/002 No.89 | 12/07/20  | #           12345678934 | pj test | laki-laki        | direktur   | Jakarta         |           20 | Juni           |           1987 | abs@yopmail.com | 0812345678 | lajang    | Jakarta     | Jakarta Selatan | Jagakarsa    | Lenteng Agung |     12214 | Jl Lenteng Agung XI No 26 | 321602192709720 |          999292892424 |
