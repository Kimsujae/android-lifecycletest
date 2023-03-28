package kr.ac.kumoh.s20160250.lifecyclecheck

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kr.ac.kumoh.s20160250.lifecyclecheck.databinding.FragmentTestBinding


class testFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(getContext(),"fragment 연결", Toast.LENGTH_SHORT).show()
        Log.d("On Attach","fragment  연결") // fragment 연결
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(getContext(),"fragment 생성", Toast.LENGTH_SHORT).show()
        Log.d("On Create","fragment  생성") // fragment 생성

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_test, container, false)
        Toast.makeText(getContext(),"fragment UI 생성", Toast.LENGTH_SHORT).show()
        Log.d("On Create View","fragment UI 생성") // fragment UI 생성
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Toast.makeText(getContext(),"액티비티가 모든 fragment 와 함께 생성", Toast.LENGTH_SHORT).show()
        Log.d("On Activity Created","액티비티가 모든 fragment 와 함께 생성") // 액티비티가 모든 fragment 와 함께 생성
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(getContext(),"fragment 보이기시작", Toast.LENGTH_SHORT).show()
        Log.d("On start","fragment 보이기 시작") // fragment 보이기시작
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(getContext(),"fragment 포그라운드 위치 (프로세스 대기)", Toast.LENGTH_SHORT).show()
        Log.d("On Resume","fragment 포그라운드 위치 (프로세스 대기)") // fragment 포그라운드 위치 (프로세스 대기)
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(getContext(),"fragment 포그라운드 벗어남 ", Toast.LENGTH_SHORT).show()
        Log.d("On Pause","fragment 포그라운드 위치 벗어남") // fragment 포그라운드 위치 벗어남
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(getContext(),"fragment 안보임 ", Toast.LENGTH_SHORT).show()
        Log.d("On stop","fragment 안보임") // 안보임
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(getContext(),"fragment view 소멸 될때  ", Toast.LENGTH_SHORT).show()
        Log.d("On DestroyView","fragment view 소멸") // fragment view 소멸 될때
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(getContext(),"fragment 소멸   ", Toast.LENGTH_SHORT).show()
        Log.d("On Destroy","fragment  소멸") // fragment 소멸 될때
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(getContext(),"fragment 분리 ", Toast.LENGTH_SHORT).show()
        Log.d("On detach","fragment  분리") // fragment 분리 될때
    }


}