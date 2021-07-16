package com.example.appclassunit5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//手動加入
import android.util.Log

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }*/
        //初始化頁面
        Log.e(TAG,"onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //連結畫面
        Log.e(TAG,"onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //連結Fragment與Activity
        Log.e(TAG,"onActivityCreated")
    }

    /*FirstFragment.kt 中同樣的內容*/
    override fun onStart(){
        super.onStart()
        //頁面可見
        Log.e(MainActivity.TAG,"onStart")
    }
    override fun onResume(){
        super.onResume()
        //頁面與使用者開始互動
        Log.e(MainActivity.TAG,"onResume")
    }
    override  fun onPause(){
        super.onPause()
        //離開頁面
        Log.e(MainActivity.TAG,"onPause")
    }
    override fun onStop(){
        super.onStop()
        //頁面不可見
        Log.e(MainActivity.TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        //回收頁面
        Log.e(MainActivity.TAG,"onDestroy")
    }
    /**/
    override  fun onDetach(){
        super.onDetach()
        //移除Fragment
        Log.e(SecondFragment.TAG,"onDetach")
    }

    companion object {
        //手動加入
        const val TAG="FirstFragment"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}