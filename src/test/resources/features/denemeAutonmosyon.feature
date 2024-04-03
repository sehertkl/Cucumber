

Feature: Kullanıcı hesap oluşturabilmeli

 Scenario: TC01 kayıt olabilmeli
  Given user "autoUrl" web sayfasinda
  Given user sign up linkine tiklar
  Given new user sign up bölümüne isim girer
  Given new user sign up bölümüne email girer
  And signUp butonuna basar
  And user kisisel bilgilerini ve iletisim bilgilerini girer




