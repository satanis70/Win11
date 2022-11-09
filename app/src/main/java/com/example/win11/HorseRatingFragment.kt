package com.example.win11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.win11.adapters.HorseAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.awaitResponse


class HorseRatingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_horse_rating, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val retrofit = RetrofitInstance.instance()
        val context = requireView()
        CoroutineScope(Dispatchers.IO).launch {
            val response = retrofit.getHorseRating().awaitResponse()
            if (response.isSuccessful){
                launch(Dispatchers.Main) {
                    val recyclerView = context.findViewById<RecyclerView>(R.id.horse_recycler)
                    recyclerView.layoutManager = LinearLayoutManager(requireContext())
                    recyclerView.adapter = HorseAdapter(response.body()!!.horserating)
                }
            }
        }
    }
}