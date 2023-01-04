# Burç Bulan Program

- Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.

| Burç          |          Tarih Aralığı |
| :------------ | ---------------------: |
| Koç Burcu     |     21 Mart - 20 Nisan |
| Boğa Burcu    |    21 Nisan - 21 Mayıs |
| İkizler Burcu |  22 Mayıs - 22 Haziran |
| Yengeç Burcu  | 23 Haziran - 22 Temmuz |
| Aslan Burcu   | 23 Temmuz - 22 Ağustos |
| Başak Burcu   |  23 Ağustos - 22 Eylül |
| Terazi Burcu  |     23 Eylül - 22 Ekim |
| Akrep Burcu   |     23 Ekim - 21 Kasım |
| Yay Burcu     |   22 Kasım - 21 Aralık |
| Oğlak Burcu   |    22 Aralık - 21 Ocak |
| Kova Burcu    |     22 Ocak - 19 Şubat |
| Balık Burcu   |     20 Şubat - 20 Mart |
|               |

## Ödev

- Aynı örneği switch-case kullanmadan yapınız.

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

cd java101\burc-bulan-program
(Doğru klasöre git. Dizini değiştirmek için cd(change directory kısaltmasıdır.) komutunu, ardından dizinin adını yazarak kullan.)

javac Main.java
(Buradaki adımı yapmak zorunda değilsiniz diğer adıma geçerek de programı çalıştırabilirsiniz.)
(Doğru dizine geçtikten sonra, programı derlemek için bu komut kullanılır ve .class dosyasını oluşturur.
Programında hata varsa veya derlemede sorun yaşanıyorsa komut istemi bunu sana bildirir.)

java Main.java
(Programı çalıştırmak için bu komut kullanılır. java dosyaadi yaz ve Enter’a bas. Tabii, "dosyaadi"nı senin dosyanın adı neyse onunla değiştir.
Enter’a bastıktan sonra programının çalışması gerekir. Hata alırsan veya programın herhangi bir şekilde çalışmazsa internette arama yaparak sorunu bulamanız gerekir.)

```
