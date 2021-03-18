package com.example.todochallenge

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.todochallenge.databinding.ActivityMainBinding
import com.example.todochallenge.infrastructure.BasePagerAdapter
import com.example.todochallenge.tabs.done.ToDoFragment
import com.example.todochallenge.tabs.todo.DoneFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        setupTabLayout(binding.notesTabLayout, binding.notesViewPager)
        setupViewPager()

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    private fun setupTabLayout(tabLayout: TabLayout, viewPager: ViewPager) = tabLayout.setupWithViewPager(viewPager)

    private fun setupViewPager() {
        val viewPagerAdapter = BasePagerAdapter(
                supportFragmentManager = supportFragmentManager,
                fragmentList = getFragmentList(),
                titleList = getTabTitles()
        )

        binding.notesViewPager.adapter = viewPagerAdapter
    }

    private fun getTabTitles() = listOf(
            getString(R.string.todo_tab_title),
            getString(R.string.done_tab_title)
    )

    private fun getFragmentList(): List<Fragment> {
        return listOf(
                ToDoFragment(),
                DoneFragment()
        )
    }

}