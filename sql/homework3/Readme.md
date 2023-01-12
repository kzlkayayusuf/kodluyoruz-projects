# Bilgi

### LIKE ve ILIKE

- bazı durumlarda tam eşleşme değil belirli şablonlara uyan koşulların sağlanmasını isteriz. Örneğin sorgumuzda first_name sütunun 'Penelope' değerine eşit olmasını değil, ilk harfin 'P' olması koşulunu sağlar. Bunun için LIKE operatörünü kullanırız.

- ILIKE operatörü LIKE operatörünün case - insensitive versiyonudur.

- % karakteri sıfır, bir veya daha fazla karakteri temsil eder ve Wildcard olarak isimlendirilir. Bir diğer wildcard karakteri \_ karakteridir ve bir karakteri temsil eder.

# Ödev 3

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1. country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.

```
SELECT country FROM country
WHERE country LIKE 'A%a';
-- Aynı sorguyu aşağıdaki kod ile de çalıştırabiliriz:
SELECT country FROM country
WHERE country ILIKE 'a%a';
-- LIKE= ~~
-- ILIKE= ~~*
-- NOT LIKE= !~~
-- NOT ILIKE= !~~*
-- Yukarıdaki sorguları aşağıdaki gibi de çalıştırabiliriz:
SELECT country FROM country
WHERE country ~~* 'a%a';
-- Bir diğeri:
SELECT country FROM country
WHERE country ~~ 'A%a';
```

2. country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.

```
SELECT country FROM country
WHERE country ~~ '_____%n';
```

3. film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.

```
SELECT title FROM film
WHERE title ~~* '%t%t%t%t%';
```

4. film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.

```
SELECT * FROM film
WHERE title ~~ 'C%' AND length>90 AND rental_rate=2.99;
```
