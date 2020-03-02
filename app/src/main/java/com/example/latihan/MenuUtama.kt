package com.example.latihan


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.latihan.databinding.FragmentMenuUtamaBinding

/**
 * A simple [Fragment] subclass.
 */
class MenuUtama : Fragment() {

    private lateinit var binding: FragmentMenuUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_menu_utama, container, false) ini harus di hapus

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_menu_utama,container,false)

        binding.btnLayar1.setOnClickListener{
            v: View? -> findNavController().navigate(R.id.action_menuUtama_to_layar1)
        }

        binding.btnLayar2.setOnClickListener{
            v: View? -> findNavController().navigate(R.id.action_menuUtama_to_layar2)
        }

        setHasOptionsMenu(true)

        
        return binding.root //setiap di tambahkan binding harus ada retunrnya (khusus di fragment)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())|| super.onOptionsItemSelected(item)

    }
}
