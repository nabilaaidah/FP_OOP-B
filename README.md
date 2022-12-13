# FP_OOP-B

Nama  : Nabila A'idah Diani

NRP   : 5025211032


*Final project yang dibuat ini merupakan sebuah game dengan bahasa dasar, yaitu java. Storyboard dari game ini adalah seekor kucing yang harus menangkap semua tikus yang terdapat dalam sebuah maze. Untuk menangkap tikus, kucing harus memakan dot besar dan untuk menambah score, kucing harus memakan dot sebanyak - banyaknya. Dalam game ini, digunakan extended file berupa tipe txt untuk membantu dalam mencatat skor dan juga extended asset sebagai visualisasi dari subjek game. Selain itu, juga digunakan library seperti java.awt maupun javax.swing dalam perakitan aspek GUI dalam game.*





===Berikut merupakan beberapa contoh dari daftar materi OOP yang terdapat di FP yang telah saya buat/modifikasi===



```
Casting/Conversion
Lokasi File: class GamePlay > method inputScoreMain
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java


```
Constructor
Lokasi File: class MainMenu > constructor MainMenu
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/MainMenu.java


```
Overloading
Lokasi File: class Scoreboard > method setObj(String) & setObj(int)
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Scoreboard.java


```
Overriding
Lokasi file: class TextFormatFile > method getEndformat() -> Parent
class Storyboard > method getEndformat() -> Child
class Instructions > method getEndformat() -> Child
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/TextFormatFile.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Storyboard.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Instructions.java


```
Encapsulation
Lokasi file: class TextFormatFile > get & set
class Storyboard > get & set
class Instructions > get & set
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/TextFormatFile.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/TextFormatFile.java


```
Inheritance
class TextFormatFile ke class Instructions, Storyboard
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Storyboard.java


```
Polymorphism
Polymorphism yang dipakai adalah overriding dan overloading
```
```
Lokasi overloading: class Scoreboard > method setObj(String) & setObj(int)
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Scoreboard.java
```
Lokasi overriding: class TextFormatFile > method getEndformat() -> Parent
class Storyboard > method getEndformat() -> Child
class Instructions > method getEndformat() -> Child
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/TextFormatFile.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Storyboard.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Instructions.java


```
ArrayList
Lokasi file: class GamePlay > private ArrayList<Scoreboard> sb = new ArrayList<Scoreboard>();
class GamePlay > method outputScoreMain
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java


```
Exception Handling
Lokasi file: class GamePlay > inputScoreMain
class GamePlay > outputScoreMain
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java


```
GUI
Lokasi file: class MainMenu
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/MainMenu.java


```
Interface
Lokasi file: class InterfaceTextFormatFile
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/InterfaceTextFormatFile.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/Instructions.java


```
Abstract Class
Lokasi file: class TextFormatFile
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/TextFormatFile.java


```
Generics
Lokasi file: class GenericClass
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GenericClass.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/TextFormatFile.java


```
Collection (Salah satu collection yang dipakai adalah ArrayList)
Lokasi file: class GamePlay > private ArrayList<Scoreboard> sb = new ArrayList<Scoreboard>();
class GamePlay > method outputScoreMain
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java


```
Input Output
Lokasi file: class GamePlay > method inputScoreMain & method outputScoreMain
```
https://github.com/nabilaaidah/FP_OOP-B/blob/2b328c0b3721ad5310e21e6174db7a15057084df/FinalProjectPBO2022/src/main/java/FinalProjectPBO/GamePlay.java







===EXTERNAL SOURCES===

```Code Sources```
```
1. https://github.com/janicek1m/PacMan
2. https://github.com/janbodnar/Java-Pacman-Game
3. https://github.com/tatemandel/tron
4. https://github.com/Overv/BoggleSaga
5. https://github.com/mystor/cisc124-assn4-game
```

```Asset Sources```
```
1. Mouse: https://www.pngkit.com/png/full/398-3984980_pixel-mouse-png.png
2. Cat: https://www.pngitem.com/pimgs/m/259-2598654_cat-pixel-art-png-download-simple-cat-pixel.png
3. Brick: https://i.pinimg.com/564x/ce/ef/5b/ceef5b4e92d1cc73e0468e495b70c131.jpg
```


Rekaman : https://youtu.be/p6xHEU4Wuuk
