# Proje 1

## Birinci soru: [22,27,16,2,18,6] -> Insertion Sort

Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

Big-O gösterimini yazınız.

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız.

- Average case: Aradığımız sayının ortada olması
- Worst case: Aradığımız sayının sonda olması
- Best case: Aradığımız sayının dizinin en başında olması.

## İkinci soru: [7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız.

---

# Proje 1 Çözümler:

## Birinci soru çözümler:

### Aşamaları:

I) [**22**,**27**,16,2,18,6] (İlk iki öğeye bakarız, sıralıdırlar.)

II) [22,**27**,**16**,2,18,6] (27 ve 16'ya bakarız, yerlerini değiştiririz.)

III) [**22**,**16**,27,2,18,6] (Bu sefer 22 ile 16'ya bakarız, yine yerlerini değiştiririz.)

IV) [16,22,**27**,**2**,18,6] (Şu ana kadar [16,22,27] sıralı bir dizi oluşturmuştur, bu sefer sıralanmamış kısımdan 2'yi alıp 27 ile karşılaştırırız. Yerlerini değiştiririz.)

V) [16,***22***,***2***,27,18,6] (Önceki adımlardaki gibi yer değiştirmesi gereken öğeleri kalın(bold) bir şekilde belirttim.)

VI) [**16**,**2**,22,27,18,6] (Bu işlem sonucunda [2,16,22,27] bizim sıralı dizimiz haline gelir)

VII) [2,16,22,**27**,**18**,6] (18'i alıp soluna bakmaya devam ederiz, yani 27 ile yer değişimi.)

VIII) [2,16,**22**,**18**,27,6] (18 ile 22 yer değişimi.)

IX) [2,16,18,22,**27**,**6**] (Halihazırda 6 dışında diğer tüm öğeler sıralıdır ve aslında bundan sonrası için benzer şekilde 6'yı sola doğru gelmesi gereken yere kadar solundaki her öğe ile karşılaştıra karşılaştıra yer değişimi yapacağız.)

X) [2,16,18,**22**,**6**,27] (22 ile 6 yer değiştirir.)

XI) [2,16,**18**,**6**,22,27] (18 ile 6 yer değiştirir.)

XII) [2,**16**,**6**,18,22,27] (16 ile 6 yer değiştirir.)

XIII) [2,6,16,18,22,27] (Sonunda her öğe olması gereken sıradadır.)

### Big-O Gösterimi:

O(n²)

### Average case : Aradığımız sayı 18 ve dizinin ortasında yer alır, bu da cevabı average case yapar.

---

## İkinci soru çözüm:

Dizinin başlangıç halinde önce dizinin tamamını bir gözden geçiririz ve en küçük elemanı bulup dizinin başına atarız, yani örneğimizdeki 2'yi alıp dizinin başındaki 7 ile yerini değiştiririz. Sonrasında yine dizinin sırası bozuk geride kalan kısmında en küçük elemanını buluruz ve o dizinin başına getiririz yani ikinci pozisyona ve bu böyle devam eder, ta ki hepsi sıralanmış oluncaya dek.

İlk hali: [**7**,3,5,8,**2**,9,4,15,6]

I) [2,**3**,5,8,7,9,4,15,6] (ilk öğe sırasında, sırasızlarda en küçük olan 3 de şansımıza yerindedir.)

II) [2,3,5,8,7,9,**4**,15,6] (ilk iki öğe sıralı, sırasızlarda 4 en küçük. 4 ile 5 yer değiştirir.)

III) [2,3,4,8,7,9,**5**,15,6] (ilk üç öğe sıralı, sırasızlarda 5 en küçük. 5 ile 8 yer değiştirir.)

IV) [2,3,4,5,7,9,8,15,**6**] (ilk dört öğe sıralı, sırasızlarda 6 en küçük. 6 ile 7 yer değiştirir. Bu aşamada dizinin son hali [2,3,4,5,6,9,8,15,7]'dir.)
