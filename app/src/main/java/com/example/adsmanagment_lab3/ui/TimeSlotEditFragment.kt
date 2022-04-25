package com.example.adsmanagment_lab3.ui


import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.ui.NavigationUI
import com.example.adsmanagment_lab3.R
import android.view.MenuInflater
import android.widget.*

class TimeSlotEditFragment : Fragment() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
     super.onCreate(savedInstanceState)
     }
     override fun onCreateView(
         inflater: LayoutInflater, container: ViewGroup?,
         savedInstanceState: Bundle?
     ): View? {
         // Inflate the layout for this fragment
         setHasOptionsMenu(true)
         return inflater.inflate(R.layout.edit_time_slot, container, false)

     }
}


