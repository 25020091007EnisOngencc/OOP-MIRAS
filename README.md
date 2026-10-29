# 🚀 Java OOP - Kalıtım (Inheritance) ve ArrayList Uygulamaları

Bu depo, Kahramanmaraş İstiklal Üniversitesi Yazılım Mühendisliği dersi kapsamında Nesne Yönelimli Programlama (OOP) ilkelerinden **Kalıtım (Inheritance)**, **Çok Biçimlilik (Polymorphism)** ve **`ArrayList`** yapılarını pekiştirmek amacıyla tamamlanan alıştırma çözümlerini içermektedir.

---

## 📌 Ödevin Amacı ve Kapsamı
Bu alıştırmaların temel amacı:
- **Kalıtım (Inheritance)** mekanizmasını kavramak, `extends` ve `super` anahtar kelimelerini doğru kullanmak.
- Sınıflar arası hiyerarşik yapıları kurgulamak ve `toString()` metodunu override ederek nesne özetlerini yönetmek.
- **`ArrayList`** yapısı üzerinde dinamik veri depolama, eleman arama (`max`), sıralama (`sort`), karıştırma (`shuffle`) ve toplama (`sum`) algoritmalarını geliştirmek.
- Çok biçimlilik (Polymorphism) prensibiyle `ArrayList<Object>` içerisinde farklı türdeki nesneleri esnek bir şekilde yönetmektir.

---

## 📂 Proje Yapısı ve İçerik

| Proje / Klasör | Açıklama |
| :--- | :--- |
| **`TriangleProject`** | `GeometricObject` ata sınıfından türetilen, alan (Heron formülü) ve çevre hesaplayan `Triangle` sınıfı. |
| **`MyData`** | `Person` sınıfından türeyen `Student`, `Employee`, `Faculty` ve `Staff` kalıtım hiyerarşisi. |
| **`Account`** | `Account` sınıfından türeyen eksi limitli `CheckingAccount` ve eksiye düşmeyen `SavingsAccount` yapısı. |
| **`ArrayList`** | Bir `ArrayList<Integer>` içerisindeki maksimum elemanı bulan `max` metodu uygulaması. |
| **`ArrayList2`** | `String[]` dizisi yerine `ArrayList<String>` kullanarak dinamikleştirilen `Course` sınıfı. |
| **`ArrayListObject`** | `ArrayList<Object>` içerisinde `Loan`, `Date`, `String` ve `Circle` nesnelerini tutma ve yazdırma. |
| **`ArrayListInteger`** | `ArrayList<Integer>` elemanlarını rastgele takas eden `shuffle` algoritması. |
| **`Scanner`** | Kullanıcıdan alınan sayıları Selection Sort algoritmasıyla sıralayan `sort` metodu. |
| **`Toplam`** | `ArrayList<Double>` içerisindeki sayıların toplamını hesaplayan `sum` metodu. |

---

## 💻 Geliştirme Ortamı ve Sistem Özellikleri

Proje geliştirme ve test süreçleri aşağıdaki sistem ve araçlar üzerinde gerçekleştirilmiştir:

- **Geliştirici:** Enis
- **IDE:** Eclipse IDE for Java Developers
- **JDK Sürümü:** Java SE 17+ / OpenJDK
- **Sistem Özellikleri:**
  - **Cihaz:** Game Garaj Slayer [4] X7T-5060
  - **İşlemci:** Intel 14th Gen
  - **Ekran Kartı:** NVIDIA GeForce RTX 5060 GPU
  - **RAM:** 32 GB RAM
  - **Depolama:** 1 TB NVMe SSD
  - **İşletim Sistemi:** Windows 11

---

