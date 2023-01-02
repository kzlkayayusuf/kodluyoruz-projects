# Proje 2

## [16,21,11,8,12,22] -> Merge Sort

- Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
- Big-O gösterimini yazınız.

---

## Proje 2 Çözümler:

## Aşamalar:

Diziyi parçalayıp tek öğeye düşürüp tek öğe halindeyken sıralama yapıp tekrar birleştiriyoruz basitçe.

I) Bir parça [16,21,11] diğer parça ise [8,12,22]

II) [16,21] ile [11] ve [8,12] ile [22] şeklinde daha da parçalanmış oldu.

III) [16] [21] [11] [8] [12] [22] Şimdi ise birleştirme zamanı! Hangisi küçükse başa yaz.

IV) [16,21] [8,11] [12,22] Sıraladık. Dikkat! 8, 11'in başına geldi.

V) [8,11,16,21] [12,22] İlk diziyle ilgili olarak: 16 mı 8 mi? 8 ilk sıraya gelir. 16 mı 11 mi? 11 ikinci sıra. 16 üç. 21 de dördüncü öğe olur.

VI) [8,11,16,21] [12,22]

VII) [8,11,12,16,21,22] Elerken şöyle sorarak ilerliyoruz: 8 mi 12 mi? 8. Zira birleştirilen dizilerin ilk elemanları zaten dizilerinin en küçükleri. Sonra 11 mi 12 mi? 11. 16 mı 12 mi? 12. 16 mı 22 mi? 16. 21 mi 22 mi? 21. En son sıraya da 22 gelir.

## Big-O:

O(n log n)

Merge sort, hem ikiye bölerek arama(binary search - O (log n)) hem de doğrusal aramanın(linear search - O(n)) karışımı olan bir sıralama algoritmasıdır. Her işlemde O(n) time complexity'ye sahiptir. Bütüne bakınca da O(n log n)'dir. O(n²)'den daha hızlıdır. Merge sort ile diziyi daha küçük problemlere/dizilere ayırıp sıraladıktan sonra birleştirerek Insertion ya da Selection sorting gibi her defasında tüm diziyi tekrar taramaktan daha iyi bir performans elde etmiş oluruz.
