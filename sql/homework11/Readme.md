# Ödev 11

Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

1. actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.

```
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer
```

2. actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.

```
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
```

3. actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.

```
-- actor tablosunda olup da customer tablosunda olmayan first_name'ler
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer

-- customer tablosunda olup da actor tablosunda olmayan first_name'ler
SELECT first_name FROM customer
EXCEPT
SELECT first_name FROM actor

```

4. İlk 3 sorguyu tekrar eden veriler için de yapalım.

```
-- 1.
SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
--2.
SELECT first_name FROM actor
INTERSECT ALL
SELECT first_name FROM customer
--3.
SELECT first_name FROM customer
EXCEPT ALL
SELECT first_name FROM actor

SELECT first_name FROM actor
EXCEPT ALL
SELECT first_name FROM customer
```
