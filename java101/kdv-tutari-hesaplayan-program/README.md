# KDV Tutarı Hesaplayan Program

- Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

## Ödev

- Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

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

cd java101\kdv-tutari-hesaplayan-program
(Doğru klasöre git. Dizini değiştirmek için cd(change directory kısaltmasıdır.) komutunu, ardından dizinin adını yazarak kullan.)

javac Main.java
(Buradaki adımı yapmak zorunda değilsiniz diğer adıma geçerek de programı çalıştırabilirsiniz.)
(Doğru dizine geçtikten sonra, programı derlemek için bu komut kullanılır ve .class dosyasını oluşturur.
Programında hata varsa veya derlemede sorun yaşanıyorsa komut istemi bunu sana bildirir.)

java Main.java
(Programı çalıştırmak için bu komut kullanılır. java dosyaadi yaz ve Enter’a bas. Tabii, "dosyaadi"nı senin dosyanın adı neyse onunla değiştir.
Enter’a bastıktan sonra programının çalışması gerekir. Hata alırsan veya programın herhangi bir şekilde çalışmazsa internette arama yaparak sorunu bulamanız gerekir.)

```
