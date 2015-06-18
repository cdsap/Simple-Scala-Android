package com.cdsap

import android.content.Intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

import android.widget.{Button, TextView}


class MainActivityScala extends AppCompatActivity with MenuWithTraits {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main_scala)

    val scalaTextView = findViewById(R.id.activity_main_scala_text).asInstanceOf[TextView]
    scalaTextView.setText("Hi from Scala")

    val scalaButton = findViewById(R.id.activity_main_scala_button).asInstanceOf[Button]
    scalaButton.setText("Go to Java")

    scalaButton.setOnClickListener(new View.OnClickListener() {
      def onClick(v: View) {
        startActivity(new Intent(MainActivityScala.this, classOf[MainActivity]))
      }
    })
  }
}
