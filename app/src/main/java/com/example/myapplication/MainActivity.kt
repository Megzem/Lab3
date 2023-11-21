package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //1. работой с преобразованием строк:
                    val str="ConSequenCeS"
                    var new_str = str.uppercase()
                    println("Задание 1: $new_str")
                    new_str = str.lowercase()
                    println("Задание 1: $new_str")
                    new_str = str.reversed()
                    println("Задание 1: $new_str")
                    //2. базовой арифметикой и выводом результата в консоль:
                    val a=12
                    val b=6
                    val c=a*a+b*b*b+a/b+b/a+b/a
                    println("Задание 2: $c")
                    println("Задание 2: ${16%3}")
                    val d=1.0
                    val f=3.0
                    println("Задание 2: ${d/f}")
                    //3. примерами интерполяции сток:
                    val hello = "Привет"
                    val world ="Мир"
                    val multiString= """
                    Задание 3:
                    $hello
                    $world
                    Начнем кодить!
                    """.trimIndent()
                    println(multiString)
                    //4. преобразованием типов:
                    val string: String = "50.51"
                    val float: Float = string.toFloat()
                    println("Задание 4: $float")
                    //5. примером условных операторов (if else):
                    if(float>50)
                    {
                        println("Задание 5: Все верно!")
                    }
                    else
                    {
                        println("Задание 5: Неверно!")
                    }
                    //6. примером с циклами (for while):
                    for (i in 10 downTo 0 )
                    {
                        println("Задание 6(for): Вывод 6го задания закончится через:$i")
                        //Thread.sleep(1000)
                    }
                    var rn=50;
                    var counter = 0;
                    while (rn>0)
                    {
                        rn-=10
                        counter+=6
                    }
                    println("Задание 6 (while):$counter")
                    //7. примером создания отдельной функции:
                    val t=xyz(5)
                    println("Задание 7: $t")
                    //8. примером работы с массивом:
                    var intArr: IntArray= intArrayOf(1,2,3,4,5,6,7,8,9,0)
                    var mas:Int
                    println("Задание 8(массив до изменения):${intArr.joinToString(" ")}")
                    for(i in 0 until intArr.size-5)
                    {
                        mas=intArr[i+5]
                        intArr[i+5]=intArr[i]
                        intArr[i]=mas
                    }
                    println("Задание 8(массив после изменения):${intArr.joinToString(" ")}")
                }
                }
            }
        }
    }
fun xyz(a:Int) : Int
{
    return a*5
}