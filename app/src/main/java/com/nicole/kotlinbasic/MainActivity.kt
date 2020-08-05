package com.nicole.kotlinbasic

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 먼저 이 코틀린 파일이 실행될 view 파일을 지정을 해준다.
//        ctrl + / : 해당 줄을 주석으로
//        메모 처럼 주석을 적자
//        xml에 그려둔 clickme 버튼이 눌렸다는 것을 감지 하고 싶다.

        clickMeBtn.setOnClickListener {
            // 중괄호 내부의 코드 => clickMeBtn이 눌리면 실행될 코드.
            Log.d("버튼 클릭", "버튼이 클릭되었습니다.")

            Toast.makeText(this, "버튼이 클릭되었습니다!", Toast.LENGTH_SHORT).show()
        }

        secondBtn.setOnClickListener {
            Log.d("버튼 눌림", "두번째 버튼 눌림!")
            Toast.makeText(this, "두번째 버튼도 클릭되었습니다.", Toast.LENGTH_SHORT).show()
        }


    }
}