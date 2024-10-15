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
        sentenciaIf()
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
    /**/
    private fun sentenciaIf(){
        val myNumber = 12

        // Operadores condicionales
        // > mayor que
        // < menor que
        // > = mayor o igual que
        //< = menor o igual que
        // == igualdad
        // ! = desigualdad

        if (myNumber < 10){
            //Sentencia if
            println("$myNumber es menor o igual que 10")
        } else {
            //Sentencia else
            println("$myNumber es mayor que 10")
        }

    }
}