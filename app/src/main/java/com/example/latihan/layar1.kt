package com.example.latihan


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.latihan.databinding.FragmentLayar1Binding
import kotlinx.android.synthetic.main.fragment_layar1.*

/**
 * A simple [Fragment] subclass.
 */
class layar1 : Fragment() {

    private lateinit var binding: FragmentLayar1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_layar1, container, false)

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_layar1,container,false)

        binding.btnShare.setOnClickListener{
            v: View? ->
            val mIntent = Intent (Intent.ACTION_SEND)

            mIntent.data = Uri.parse("mail to:")
            mIntent.type = "text"

            mIntent.putExtra (Intent.EXTRA_EMAIL,arrayOf("andidadang06@gmail.com"))
            mIntent.putExtra (Intent.EXTRA_SUBJECT, "Jawaban")
            mIntent.putExtra (Intent.EXTRA_TEXT,"keliling : ")

            try {
                startActivity(Intent.createChooser(mIntent,"chose email client"))
            }
            catch (e: Exception){

            }
        }

        return binding.root
    }


}
