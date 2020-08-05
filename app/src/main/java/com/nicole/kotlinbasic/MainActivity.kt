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

        copyBtn.setOnClickListener {
            // 에디트 텍스트에 입력된 내용을 받아와서 밑에 칸에 문구로 반영한다.
            // 그리고 코틀린에서 변수를 선언할 때 자료형은 선언하지 않는다.
            // toString()을 사용하는 이유: 문자열을 받는 상황 외에, 예를 들어 숫자를 받는다거나 할 때,
            // inputMsg.text.toInt() 이런식으로 바로 안되고 inputMsg.text.toString().toInt()
            // 이런 형식으로 사용할 수 있다. 이런 저런 제약이 많아서 toString()으로 사용한다.
            val inputMessage = inputMsg.text.toString()

//            입력한 내용이 5글자가 안된다면, 5자 이상 입력하라고 안내,
//            5자 이상이라면 문구로 반영.
            if (inputMessage.length < 5) {
                Toast.makeText(this, "5글자 이상 입력하세요", Toast.LENGTH_SHORT).show()
            }
            // 5글자는 넘지만, 10글자가 안된다면 로그로 10글자가 안된다고 출력 그외 상황에서는 문구로 반영
            else if (inputMessage.length < 10) {
                Log.d("입력글자 수", "5글자 이상이면서 10글자 미만입니다. ")
            } else {
                // 복사하는 곳에 문구로 반영
                resultMsg.text = inputMessage
            }


        }
    }
}