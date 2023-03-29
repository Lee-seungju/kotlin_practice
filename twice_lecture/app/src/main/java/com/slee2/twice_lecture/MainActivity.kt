package com.slee2.twice_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private val members = listOf(R.id.member1, R.id.member2, R.id.member3, R.id.member4, R.id.member5, R.id.member6, R.id.member7, R.id.member8, R.id.member9)

    private fun setMemberClickListeners() {
        members.forEachIndexed { index, memberId ->
            val memberBtn = findViewById<ImageView>(memberId)
            memberBtn.setOnClickListener { setMemberClickListener(index + 1) }
        }
    }

    private fun setMemberClickListener(memberId: Int) {
        val intent = Intent(this, ImageInsideActivity::class.java)
        intent.putExtra("data", memberId.toString())
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMemberClickListeners()
    }
}