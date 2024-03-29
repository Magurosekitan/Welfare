package com.works.solutionchallange2024



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.works.solutionchallange2024.config.RetrofitClient
import com.works.solutionchallange2024.manager.AppPref

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AppPref sınıfından bir örnek oluşturun
        val appPref = AppPref(this)



        // "Hatırla beni" özelliği aktifse ve kayıtlı kullanıcı bilgileri varsa
        if (appPref.getIsChecked() && appPref.getMail() != null && appPref.getPassword() != null) {
            // LoginActivity'e değil direkt olarak HomeActivity'e git
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // MainActivity'yi kapat
        }
    }
}