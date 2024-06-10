package com.example.myweatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnEnter: Button
    private lateinit var inputDay: EditText
    private lateinit var tempFigure: TextView
    private lateinit var weather: TextView

    private var WeekDays: List<WeekDay> =  listOf(
        WeekDay("Monday", "Sunny and Windy" , 15-22),
        WeekDay("Tuesday", "Cloudy" , 10-18),
        WeekDay("Wednesday", "Sunny" , 17-28),
        WeekDay("Thursday", "Sunny", 18-29),
        WeekDay("Friday", "Rainy and Warm", 17-27),
        WeekDay("Saturday", "Cloudy" , 12-23),
        WeekDay("Sunday", "Sunny", 19-27),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnEnter = findViewById(R.id.btnEnter)
        inputDay = findViewById(R.id.InputDay)
        tempFigure = findViewById(R.id.tempFigure)
        weather = findViewById(R.id.weather)

        btnEnter.setOnClickListener {
            val enteredDay = inputDay.text.toString().toIntOrNull()

            if (enteredDay != null) {
                val matchingFigure = WeekDays.find { it.day.equals(tempFigure) }
                if (matchingFigure != null) {
                    tempFigure.text = "(${matchingFigure.degrees})"
                    weather.text = "${matchingFigure.condition}"
                } else {
                    tempFigure.text = "Spelling Error or Wrong Input."
                    weather.text = " "
                }
            } else {
                tempFigure.text = ""
                weather.text = "mistake with the conditions, please give a weekday again"
            }
        }
    }
    private data class WeekDay(val day: String, val condition: String, val degrees: Int)
}