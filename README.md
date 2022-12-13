# FP_OOP-B

Nama  : Nabila A'idah Diani

NRP   : 5025211032


*Final project yang dibuat ini merupakan sebuah game dengan bahasa dasar, yaitu java. Storyboard dari game ini adalah seekor kucing yang harus menangkap semua tikus yang terdapat dalam sebuah maze. Untuk menangkap tikus, kucing harus memakan dot besar dan untuk menambah score, kucing harus memakan dot sebanyak - banyaknya. Dalam game ini, digunakan extended file berupa tipe txt untuk membantu dalam mencatat skor dan juga extended asset sebagai visualisasi dari subjek game. Selain itu, juga digunakan library seperti java.awt maupun javax.swing dalam perakitan aspek GUI dalam game.*





===Berikut merupakan salah beberapa contoh dari daftar materi OOP yang terdapat di FP yang telah saya buat/modifikasi===


```Casting/Conversion
Pada class GamePlay dan di dalam method inputScoreMain, terdapat casting data score dari
yang awalnya bertipekan data double menjadi integer, casting ini dilakukan dengan menambahkan
(int) di depan getScore


Constructor
Pada class MainMenu, terdapat constructor yang berisikan fitur2 untuk Main Menu


Overloading
Pada class Scoreboard, terdapat dua method setObj, dengan method pertama memiliki parameter string
dan method kedua memiliki paramater integer 


Overriding
Pada class Storyboad dan Instruction, terdapat method getEndformat() yang merupakan overriding
dari method parentnya, yaitu TextFormatFile


Encapsulation
Terdapat set dan get tipe data private di dalam class Instructions, Storyboard, dan TextFormatFile


Inheritance
Terdapat inheritance dengan metode extend dari parent class, yaitu TextFormatFile, ke child class,
yaitu Instructions dan Storyboard


Polymorphism
Polymorphism yang digunakan pada FP ini adalah overloading dan overriding, peletakannya sendiri
sama seperti yang telah dituliskan di penjelasan overloading dan overriding


ArrayList
Pada class GamePlay, terdapat dua ArrayList. ArrayList pertama menghubungkan dengan class Scoreboard
dan bertugas untuk menginput skor. ArrayList kedua bertugas untuk memprint out score


Exception Handling
Exception handling dapat ditemukan pada class GamePlay, tepatnya pada method inputScoreMain dan
outputScoreMain.


GUI
Pada FP ini digunakan GUI. Unsur - unsur GUI banyak digunakan dalam membentuk Main Menu. Ini
dapat dilihat pada class MainMenu


Interface
Terdapat class InterfaceTextFormatFile yang merupakan interface bagi class Instructions dan
Storyboard


Abstract Class
Tipe abstract class digunakan dalam membentuk class TextFormatFile


Generics
Generics digunakan untuk menginput data yang terdapat di TextFormatFile. Generics sendiri
dapat ditemukan di class GenericClass


Collection
Pada unsur OOP collection, dapat ditemukan melalui adanya penggunakan ArrayList. ArrayList
sendiri digunakan pada class GamePlay untuk melakukan input dan output score.


Input Output
Input dan output pada FP ini dapat ditemukan dalam melakukan penulisan dan dibacakannya skor.
Method yang mewadahi input dan output ini dapat ditemukan di class GamePlay pada method
inputScoreMain dan outputScoreMain```






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
