# Ödev - Çin Zodyağı Hesaplama

Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

## Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

## Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

```
Doğum Yılınızı Giriniz : 1990
Çin Zodyağı Burcunuz : At
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

cd java101\china-zodyagi-hesaplama
(Doğru klasöre git. Dizini değiştirmek için cd(change directory kısaltmasıdır.) komutunu, ardından dizinin adını yazarak kullan.)

javac Main.java
(Buradaki adımı yapmak zorunda değilsiniz diğer adıma geçerek de programı çalıştırabilirsiniz.)
(Doğru dizine geçtikten sonra, programı derlemek için bu komut kullanılır ve .class dosyasını oluşturur.
Programında hata varsa veya derlemede sorun yaşanıyorsa komut istemi bunu sana bildirir.)

java Main.java
(Programı çalıştırmak için bu komut kullanılır. java dosyaadi yaz ve Enter’a bas. Tabii, "dosyaadi"nı senin dosyanın adı neyse onunla değiştir.
Enter’a bastıktan sonra programının çalışması gerekir. Hata alırsan veya programın herhangi bir şekilde çalışmazsa internette arama yaparak sorunu bulamanız gerekir.)

```
