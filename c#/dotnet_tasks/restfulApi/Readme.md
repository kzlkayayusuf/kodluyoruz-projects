# Restful Api Geliştirin

* Rest standartlarna uygun olmalıdır.
* GET,POST,PUT,DELETE,PATCH methodları kullanılmalıdır.
* Http status code standartlarına uyulmalıdır. Error Handler ile 500, 400, 404, 200, 201 hatalarının standart format ile verilmesi.
* Modellerde zorunlu alanların kontrolü yapılmalıdır.
* Routing kullanılmalıdır.
* Model binding işlemleri hem body den hemde query den yapılacak şekilde örneklendirilmelidir.
* Bonus:Standart crud işlemlerine ek olarak, listeleme ve sıralama işlevleride eklenmelidir. Örn: /api/products/list?name=abc

## AutoMapper eklemek için konsoldan aşağıdaki kodu çalıştırınız

```.NET CLI
dotnet add package AutoMapper.Extensions.Microsoft.DependencyInjection
```

## Projenin Kullanımı

![swagger](pictures/cartoon.png)

* Endpointler yukarıdaki resimdeki gibidir. Swagger ile rahat bir şekilde bu fonksiyonları kullanıp deneyebilirsiniz.
