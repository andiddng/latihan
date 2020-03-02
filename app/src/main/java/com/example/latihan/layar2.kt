package com.example.latihan


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.latihan.databinding.FragmentLayar2Binding

/**
 * A simple [Fragment] subclass.
 */
class layar2 : Fragment() {

    private lateinit var binding: FragmentLayar2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_layar2, container, false)
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_layar2,container,false)

        return binding.root
    }


}
