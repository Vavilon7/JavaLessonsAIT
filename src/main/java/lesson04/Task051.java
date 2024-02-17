package lesson04;

public class Task051 {
    public static void main(String[] args){
 int SongSec1 = 500;
 int SongSec2 = 650;
 int SongSec3 = 600;

 // если укажем тут переменную float, то получим результат 29.166666
 int totalSec=SongSec1+SongSec2+SongSec3;

 //тут считаем длину песни в минутах. Переменная int показывает только целую часть.
     // Если хотим увидеть дробную, то используем переменную float
int SongMin1 = SongSec1/60;
int SongMin2 = SongSec2/60;
int SongMin3 = SongSec3/60;

 //тут считаем количество оставшихся секунд, после выделения целого количества минут
 int RestSec1 = SongSec1-(SongMin1*60);
 int RestSec2 = SongSec2-(SongMin2*60);
 int RestSec3 = SongSec3-(SongMin3*60);

System.out.println("Общая длительность трех песен в секундах= "+totalSec);
 System.out.println("Общая длительность трех песен в минутах= "+(totalSec)/60);

System.out.println("Длина песни 1 в минутах= "+SongMin1);
 System.out.println("Длина песни 1 в секундах= "+SongSec1);

 System.out.println("Длина песни 2 в минутах= "+SongMin2);
 System.out.println("Длина песни 2 в секундах= "+SongSec2);

 System.out.println("Длина песни 3 в минутах= "+SongMin3);
System.out.println("Длина песни 3 в секундах= "+SongSec3);

 System.out.println("Длина песни 1: "+SongMin1+" минут и "+RestSec1+" секунд");
 System.out.println("Длина песни 2: "+SongMin2+" минут и "+RestSec2+" секунд");
System.out.println("Длина песни 3: "+SongMin3+" минут и "+RestSec3+" секунд"); }}