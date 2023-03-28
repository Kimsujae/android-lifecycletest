package kr.ac.kumoh.s20160250.lifecyclecheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kr.ac.kumoh.s20160250.lifecyclecheck.databinding.ActivityFragementBinding
import kr.ac.kumoh.s20160250.lifecyclecheck.databinding.FragmentTestBinding

class fragementActivity : AppCompatActivity() {

    private var flag = 0
    private var fragment2 = testFragment2()
    private var fragment = testFragment()
    private lateinit var fragmentManager: FragmentManager
    private lateinit var fragmentActivityBinding: ActivityFragementBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentActivityBinding=ActivityFragementBinding.inflate(layoutInflater)
        setContentView(fragmentActivityBinding.root)
        fragmentActivityBinding.fragmentChangeButton.setOnClickListener {
            switchFragment()
        }
        fragmentManager = getSupportFragmentManager()

    }
    private fun switchFragment(){
        val transaction = supportFragmentManager.beginTransaction()
        when(flag){
            0->{
                transaction.replace(R.id.fragmentLayout,fragment2).commitAllowingStateLoss()
            }
            1->{transaction.replace(R.id.fragmentLayout,fragment).commitAllowingStateLoss()}
        }
        flag=(flag+1)%2
    }
}