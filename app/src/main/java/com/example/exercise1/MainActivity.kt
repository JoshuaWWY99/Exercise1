package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<View>(R.id.confirm_button)

        btn.setOnClickListener(){
            val carP = car_price.text.toString()
            val downP = down_payment.text.toString()
            val loanP = loan_period.text.toString()
            val interestR = interest_rate.text.toString()

            val carL:Double = carP.toDouble() - downP.toDouble()
            val interest:Double = carL * interestR.toDouble() * loanP.toDouble()
            val monthlyR:Double = (carL + interest)/loanP.toDouble()/12

            car_loan.text = "RM %2.f".format(carL)
            interestA.text = "RM %2.f".format(interest)
            monthly_repayment.text = "RM %2.f".format(monthlyR)
        }
    }
}
