package com.mad.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.mad.lifecycle.models.QuestionModel

class SecondActivity : AppCompatActivity() {

    private lateinit var myModel : QuestionModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("LifeCycle","OnCreate")

        val btn : Button = findViewById(R.id.btnAdd)
        val tv : TextView = findViewById(R.id.tvQuestion)
        val tvName : TextView = findViewById(R.id.tvName)

        myModel = QuestionModel.getInstance()
        tv.text = myModel.getQuestion()
        tvName.text = myModel.name

       // if(savedInstanceState != null)
           // tv.text = savedInstanceState?.getString("question")

        btn.setOnClickListener(){
            tv.text = myModel.generateQuestion()
        }

    }

    override fun onStart(){
        super.onStart()
        Log.i("LifeCycle","OnStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i("LifeCycle","OnResume")

    }

    override fun onPause(){
        super.onPause()
        Log.i("LifeCycle","OnPause")

    }

    override fun onStop(){
        super.onStop()
        Log.i("LifeCycle","OnStop")

    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i("LifeCycle","OnDestroy")

    }
/*
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val tvQuestion : TextView = findViewById(R.id.tvQuestion)
        outState.putString("question", tvQuestion.text.toString())
    }
*/
}