# Ödev 8

1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

```
CREATE DATABASE test;

CREATE TABLE employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);
```

2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

- Veri eklemek için [Mockaroo](https://www.mockaroo.com/) sitesini kullanabilirsiniz.

```
insert into employee (name, birthday, email) values ('Merlina Glasson', '2014-06-07', 'mglasson0@altervista.org');
insert into employee (name, birthday, email) values ('Jillene Jansens', null, 'jjansens1@moonfruit.com');
insert into employee (name, birthday, email) values ('Carey Gehrels', '2021-05-14', 'cgehrels2@answers.com');
...
```

3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

```
UPDATE employee
SET name= 'Yusuf KIZILKAYA',
	birthday= '1994-08-07'
WHERE id=1;

UPDATE employee
SET email= 'yusuf@outlook.com'
WHERE name= 'Yusuf KIZILKAYA';

UPDATE employee
SET name= 'Ali KAYA'
WHERE name LIKE 'A%'
RETURNING *;

UPDATE employee
SET email= 'ali@outlook.com'
WHERE name LIKE 'A%'
RETURNING *;

UPDATE employee
SET name= 'Talisca',
	email= 'talisca@gmail.com',
	birthday= '1990-05-02'
WHERE email= 'hsendley8@tinyurl.com'
RETURNING *;
```

4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

```
DELETE FROM employee
WHERE id=7;

DELETE FROM employee
WHERE email='yusuf@outlook.com'
RETURNING *;

DELETE FROM employee
WHERE name ILIKE 'a%'
RETURNING *;

DELETE FROM employee
WHERE birthday='1990-05-02'
RETURNING *;

DELETE FROM employee
WHERE id BETWEEN 3 AND 25
RETURNING *;
```
