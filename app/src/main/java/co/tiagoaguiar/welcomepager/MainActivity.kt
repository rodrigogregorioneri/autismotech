package co.tiagoaguiar.welcomepager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.view.size
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tip_content.view.*
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        setContentView(R.layout.activity_main)

        val tips = arrayOf(
            Tip(
                "VOCÊ SABIA?",
                "Em todo o mundo, uma em cada 160 crianças tem autismo.\n" +
                        "Fonte: OMS (2017)",
                R.drawable.puzzle,
                R.drawable.backgroundblue
            ),
            Tip(
                "VOCÊ SABIA?",
                "Existem cerca de 70 milhões de pessoas com autismo no mundo. \n" +
                        "Fonte: Agência Senado (2020)",
                R.drawable.terra,
                R.drawable.backgroundpink
            ),
            Tip(
                "VOCÊ SABIA?",
                "Estima-se que existam, aproximadamente, 2 milhões de pessoas com algum grau de autismo, no Brasil.\n" +
                        "Fonte: APAE Brasil (2017)",
                R.drawable.brasil,
                R.drawable.backgroundorange
            )
        )

        addDots(tips.size)

        view_pager.adapter = OnboardingAdapter(tips)

        view_pager.setPageTransformer(true) { page, position ->
//            page.alpha = 1 - abs(position)
//            page.translationX =  -position * page.width
        }


        view_pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                addDots(tips.size, position)
            }

        })


        next.setOnClickListener {
            if (view_pager.currentItem == view_pager.size){
                val intent = Intent(this, Entrar::class.java)

                //intent.putExtra("keyIdentifier", "valor")

                startActivity(intent)
                //Toast.makeText(this, "Rodrigo", Toast.LENGTH_SHORT).show()
        }

            view_pager.setCurrentItem(view_pager.currentItem + 1, true)
        }
    }

    private fun addDots(size: Int, position: Int = 0) {
        dots.removeAllViews()
        Array(size) {
            val textView = TextView(baseContext).apply {
                text = getText(R.string.dotted)
                textSize = 35f
                setTextColor(
                    if (position == it) ContextCompat.getColor(baseContext, android.R.color.white)
                    else ContextCompat.getColor(baseContext, android.R.color.darker_gray)
                )

            }
            dots.addView(textView)
        }
    }

    private inner class OnboardingAdapter(val tips: Array<Tip>) : PagerAdapter() {

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val view = layoutInflater.inflate(R.layout.tip_content, container, false)

            with(tips[position]) {
                view.tip_title.text = title
                view.tip_subtitle.text = subtitle
                view.tip_logo.setImageResource(logo)
                view.background = ContextCompat.getDrawable(this@MainActivity, background)
            }

            container.addView(view)

            return view
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(`object` as View)
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return view == `object`
        }

        override fun getCount(): Int = tips.size

    }
}
