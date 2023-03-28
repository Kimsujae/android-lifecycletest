package kr.ac.kumoh.s20160250.lifecyclecheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"액티비티 생성",Toast.LENGTH_SHORT).show()
        Log.d("On create","액티비티 생성") // 액티비티 생성
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"on start",Toast.LENGTH_SHORT).show()
        Log.d("On start","액티비티 대기")
        //액티비티를 포그라운드에 보낼준비 -> process 대기 상태와 비슷
    }
    override fun onResume(){
        super.onResume()
        Toast.makeText(this,"on Resume",Toast.LENGTH_SHORT).show()
        Log.d("On Resume","액티비티 준비 ")
        // 액티비티가 포그라운드에 표시 -> -> process 준비 상태와 비슷
        // 사용자가 만약 잠시 액티비를 떠난다 -> onPause() 함수 실행 -> 다시 onResume()으로

    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"on Pause",Toast.LENGTH_SHORT).show()
        Log.d("On Pause","액티비티 활동 중지")
        // 액티비티 일시정지 화면을 떠나거나
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"on Stop",Toast.LENGTH_SHORT).show()
        Log.d("On stop","액티비티 대기 상태로 만듬")
        // 액티비티 대기 상태로만듬
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"on Destroy",Toast.LENGTH_SHORT).show()
        Log.d("On Destroy","액티비티 삭제")
        //액티비티 활동이 종료될때 호출 finish() 함수 이전

    }


}