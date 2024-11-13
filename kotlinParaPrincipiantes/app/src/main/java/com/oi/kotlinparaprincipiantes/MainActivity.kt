package com.oi.kotlinparaprincipiantes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //clase1
      //  variablesYConstantes()

        //clase2
        //tiposDeDatos()

        //clase3
      //  sentenciaIf()

        //clase4
       // sentenciaWhen()

        //clase5
        arrays()
    }
    /*
    Aqui vamos a hablar de variables y constantes
     */

    private fun variablesYConstantes(){

        //variables

        var myFirstVariable = "Hello Hackermen"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos !!!"

        println(myFirstVariable)
        //no podemos asignar un tipo int a una variable de tipo string
        //myFirstVariable = 1

        var mySecondVariable = "Suscribete!"
        println(mySecondVariable)
        mySecondVariable = myFirstVariable
        println(mySecondVariable)
        myFirstVariable = "¿Ya te has suscrito?"
        println(myFirstVariable)
        //constantes

        val myFirstConstant = "¿te ha gustado el tutorial?"
        println(myFirstConstant)

        //Una constante no puede modificar su valor
        //myFirstConstant = "Si te ha gustado, dale a LIKE"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)

    }
    /*
    Aquí vamos hablar de tipos de datos (data types)
    * */
    private fun tiposDeDatos(){

        // String

        val myString: String = "Hola oi"
        val myString2 = "Bienvenidos a oi"
        val myString3 = myString + " " + myString2
        println(myString3)

        // Enteros (Byte , Short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 //En realidad esto es un Int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }
    /*
    * Sentencia if
    * */
    private fun sentenciaIf(){
        val myNumber = 12

        // Operadores condicionales
        // > mayor que
        // < menor que
        // > = mayor o igual que
        //< = menor o igual que
        // == igualdad
        // ! = desigualdad

        //Operadores logicos
        // && operador y
        // || operador o
        // ! operador no

        if ((myNumber < 10 && myNumber > 5) || myNumber == 53){
            //Sentencia if
            println("$myNumber es menor o igual que 10")
        } else if(myNumber == 60){
            println("El numero es igual a 60")
        } else {
            //Sentencia else
            println("$myNumber es mayor que 10")
        }

    }
    /*
    * sentencia when
    * */
    private fun sentenciaWhen(){

        //when con string
        val country = "España"

        when (country){
            "España" , "mexico" , "Argentina" ->{
                println("El idioma es español")
            }
             "Euuu" ->{
                 println("El idioma es ingles")
             }
            else ->{
                println("oi")
            }
        }
        //when con int
        val age = 1

        when (age) {
            0 , 1 , 2 ->{
                println("Es un bebe")
            }
            in 3 .. 10 ->{
                println("Es un niño")
            }
            else ->{
                println("oi")
            }
        }
    }

    private fun arrays(){
        val name = "Brais"
        val surname = "oi"
        val company = "oioi"
        val age = "32"

        //Creacion de un Array

        val myArray : ArrayList<String> = arrayListOf<String>()

        //Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        //añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(myArray)

        //acceso a datos

        val myCompany : String = myArray[2]
        println(myCompany)

        //modificacion de datos

        myArray[5] = "Suscribete ..."
        println(myArray)

        //Eliminar datos
        myArray.removeAt(4)

        println(myArray)

        // Recorrer datos

        myArray.forEach{
            println(it)
        }

        //otras operaciones

        println(myArray.count())

        myArray.clear()

        println(myArray.count())

        myArray.first()
        myArray.last()


    }
}