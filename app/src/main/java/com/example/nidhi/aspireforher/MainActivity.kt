package com.example.nidhi.aspireforher

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:support@aspireforher.org")
            }
            startActivity(Intent.createChooser(emailIntent, "Reach out to us!"))
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun instapage(view: View) {
        val insta: ImageButton = findViewById(R.id.instagram)
        insta.setOnClickListener{
            val uri = Uri.parse("https://www.instagram.com/aspireforher/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

    fun twittterpage(view: View) {
        val twitter: ImageButton = findViewById(R.id.twittorbtn)
        twitter.setOnClickListener{
            val uri = Uri.parse("https://twitter.com/her_aspire")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
    fun fbpage(view: View) {
        val facebook: ImageButton = findViewById(R.id.fbbtn)
        facebook.setOnClickListener{
            val uri = Uri.parse("https://www.facebook.com/aspireforher/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
    fun ytpage(view: View) {
        val youtube: ImageButton = findViewById(R.id.ytbtn)
        youtube.setOnClickListener{
            val uri = Uri.parse("https://www.youtube.com/channel/UCHyAxtHoi_jAHHcuGm5At8Q")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
    fun lipage(view: View) {
        val linkedin: ImageButton = findViewById(R.id.libtn)
        linkedin.setOnClickListener{
            val uri = Uri.parse("https://www.linkedin.com/company/aspire-for-her/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

    fun signup(view: View) {
        val signup: ImageButton = findViewById(R.id.signupbtn)
        signup.setOnClickListener{
            val uri = Uri.parse("https://forms.gle/rUw3dWgRmZ3dmjiu5")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

    fun explore(view: View) {
        val explore: ImageButton = findViewById(R.id.explorebtn)
        explore.setOnClickListener {
            val uri = Uri.parse("http://www.aspireforher.org/learningsaspire/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }

    fun apply(view: View) {

        val apply: ImageButton = findViewById(R.id.applybtn)
        apply.setOnClickListener {
            val uri = Uri.parse("https://www.aspireforher.org/careers/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}