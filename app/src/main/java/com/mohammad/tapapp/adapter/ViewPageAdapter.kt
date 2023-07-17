package com.mohammad.tapapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mohammad.tapapp.fragment.BookFragment
import com.mohammad.tapapp.fragment.GameFragment
import com.mohammad.tapapp.fragment.MovieFragment

class ViewPageAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
      return 3
    }

    override fun createFragment(position: Int): Fragment {
       when(position){
           0 ->{
               return BookFragment()
           }
           1->{
               return GameFragment()
           }
       }
        return MovieFragment()
    }
}