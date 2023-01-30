# C# Tanıtım

Orta seviyeli bir programlama dili olan C# Microsoft tarafından geliştirilmiştir. Günlük kullanım diline de makine diline aynı yakınlıktadır.

## .NET 5 Kurulumu

.NET Core ile uygulama geliştirmek için öncelikle SDK paketinin kurulması gerekir.
SDK veya Software Development Kit yazılım geliştirmek için gerekli olan derleyici, cli gibi araçları içeren bir pakettir.
Windows
Windows işletim sistemine kurulum için aşağıdaki yer alan adresten gerekli dosyalar indirilir.

<https://dotnet.microsoft.com/download>

Dosyalar indirildikten sonra ileri butonu aracılığıyla kurulum tamamlanır.

## Kontrol

.NET Core SDK kurulumu ile birlikte .NET Core projesi oluşturmak ve çalıştırmak için dotnet CLI (Command Line Interface) kurulumunu yapar.
Kurulum sonrası .NET Core işletim sistemini path veya çevre değişkenleri olarak adlandırılan alanına ekler.
Bu sayede işletim sistemlerinde yer alan komut yorumlayıcında (CMD, PowerShell, Bash vb.) aşağıdaki komut çalıştırılır.

```.NET CLI
dotnet --version
```

İşletim sisteminde yer alan komut yorumlayıcısına yukarıda yer alan komut yazılıp çalıştırıldığında kurulan .NET Core sürümü yazılacaktır.

* Önemli Not:

VS code ile C# geliştirirken ihtiyacımız olacak olan extension ların yüklenmesi gerekmektedir. Extension arama pencersinde belirtmiş olduğum Extension Id ler arama yaparak hızlıca bulabilirsiniz.

* .Net Core Tools (Extensison Id : formulahendry.dotnet)

* C# (Extension Id : ms-dotnettools.csharp)

* Ms Build Project Tools (Extension Id : tintoy.msbuild-project-tools)
