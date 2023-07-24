package com.example.ums

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.ums.databinding.FragmentCustomBinding

class FragmentCustom : Fragment() {
   private val binding by lazy { FragmentCustomBinding.inflate(layoutInflater) }
    lateinit var  list : ArrayList<User>
    lateinit var adapter: CustomAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var key = arguments?.getInt("tarif")
        when(key){
            0->{
                tarifCustom()
                aa()
            }
            1->{
                daqiqaCustom()
                aa()
            }
            2->{
                mb()
                aa()
            }
            3->{
                sms()
                aa()
            }

        }

        return binding.root
    }
    fun aa(){
        adapter = CustomAdapter(list,object : CustomAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                findNavController().navigate(R.id.FragmentCustomToAboutFragment, bundleOf("keyUser" to list[position]))
            }
        })
        binding.recyclerView.adapter = adapter
    }
    fun tarifCustom(){
        list = ArrayList<User>()
        list.add(User("Mobi 20", "*111*120#", "20 000/1 000 so'm oylik/kunlik abonet tolovi 500/17"))
        list.add(User("Mobi 30", "*111*121#", "30 000/2 000 so'm oylik/kunlik abonet tolovi 1000/17"))
        list.add(User("Mobi 40", "*111*122#", "40 000/3 000 so'm oylik/kunlik abonet tolovi 1500/17"))
        list.add(User("Mobi 50", "*111*123#", "50 000/4 000 so'm oylik/kunlik abonet tolovi 2000/17"))
        list.add(User("Mobi 60", "*111*124#", "60 000/5 000 so'm oylik/kunlik abonet tolovi 2500/17"))
        list.add(User("Mobi 70", "*111*125#", "70 000/6 000 so'm oylik/kunlik abonet tolovi 3000/17"))
        list.add(User("Mobi 80", "*111*126#", "80 000/7 000 so'm oylik/kunlik abonet tolovi 3500/17"))
        list.add(User("Mobi 90", "*111*127#", "90 000/8 000 so'm oylik/kunlik abonet tolovi 4000/17"))
        list.add(User("Mobi 100", "*111*128#", "100 000/9 000 so'm oylik/kunlik abonet tolovi 4500/17"))

    }
    fun daqiqaCustom(){
        list = ArrayList<User>()
        list.add(User("<<60-daqiqa", "*110*60#", "Beriladigan daqiqa 60"))
        list.add(User("<<70-daqiqa", "*110*60#", "Beriladigan daqiqa 70"))
        list.add(User("<<80-daqiqa", "*110*60#", "Beriladigan daqiqa 80"))
        list.add(User("<<90-daqiqa", "*110*60#", "Beriladigan daqiqa 90"))
        list.add(User("<<100-daqiqa", "*110*60#", "Beriladigan daqiqa 100"))
        list.add(User("<<110-daqiqa", "*110*60#", "Beriladigan daqiqa 110"))
        list.add(User("<<120-daqiqa", "*110*60#", "Beriladigan daqiqa 120"))
    }
    fun mb(){
        list.add(User("MB 1 GB","*150*1#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 3 BG","*150*3#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 5 GB","*150*5#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 8 GB","*150*8#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 10 GB","*150*10#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 15 GB","*150*15#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 25 GB","*150*25#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 50 GB","*150*50#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB 100 GB","*150*100#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("MB Cheksiz","*150*150#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
    }
    fun sms(){
        list.add(User("SMS 10","*150*1#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("SMS 100","*150*3#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("SMS 100","*150*5#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("SMS 1000","*150*8#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("SMS 10000","*150*10#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
        list.add(User("SMS 100000","*150*15#","20 000/1000 soʻm oylik/\\nkunlik abonent toʻlovi 500/17 " ))
    }

}