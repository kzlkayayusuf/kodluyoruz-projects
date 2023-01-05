# Artık Yıl Hesaplama

Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

## Artık Yıl Nedir?

Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.

### Artık Yıl Nasıl Hesaplanır?

Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.

```
Yıl Giriniz : 2020
2020 bir artık yıldır !
```

```
Yıl Giriniz : 2021
2021 bir artık yıldır değildir !
```

## Usage

Projeyi cloneladıktan sonra Visual Studio Code programında açınız.

Java kodlarını visual studio code ile çalıştırmak için aşağıdaki eklentiyi kurmanız gerekiyor:

```
vscjava.vscode-java-pack
```

## Projeyi Terminal'den çalıştırma

Eğer projeyi java run ile çalıştıramazsanız Visual Studio Code terminal ile çalıştırabilirsiniz. Öncelikle kısayol ile terminal ekranını açınız (ctrl+") veya View sekmesinden Terminal'e basarak açabilirsiniz. Sonra aşağıdaki adımları tek tek uygulayarak projeyi çalıştırınız.

```
java -version
(Java’nın yüklü olup olmadığına bak. Komut satırına java -version yaz. Java yüklüyse Java’nın hâlihazırda hangi sürümünün yüklü olduğunu belirten bir mesaj görürsün. Yüklü değilse Java Development Kit’i (Java Geliştirme Aracı), Java’nın web sitesinden indirmen gerekir.)

dir
(bulunduğunuz dizindeki dosyaları gösterir veya ls komutuyla da görebilirsiniz.)

cd java101\artik-yil-hesaplama
(Doğru klasöre git. Dizini değiştirmek için cd(change directory kısaltmasıdır.) komutunu, ardından dizinin adını yazarak kullan.)

javac Main.java
(Buradaki adımı yapmak zorunda değilsiniz diğer adıma geçerek de programı çalıştırabilirsiniz.)
(Doğru dizine geçtikten sonra, programı derlemek için bu komut kullanılır ve .class dosyasını oluşturur.
Programında hata varsa veya derlemede sorun yaşanıyorsa komut istemi bunu sana bildirir.)

java Main.java
(Programı çalıştırmak için bu komut kullanılır. java dosyaadi yaz ve Enter’a bas. Tabii, "dosyaadi"nı senin dosyanın adı neyse onunla değiştir.
Enter’a bastıktan sonra programının çalışması gerekir. Hata alırsan veya programın herhangi bir şekilde çalışmazsa internette arama yaparak sorunu bulamanız gerekir.)

```
