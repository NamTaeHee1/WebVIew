package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true // 자바 스크립트 허용
        //웹뷰에서 새 창이 뜨지 않도록 방지하는 구문
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()
        //웹뷰에서 새 창이 뜨지 않도록 방지하는 구문
        webView.loadUrl("https://www.naver.com") // 링크 주소를 Load 함

    }


    override fun onBackPressed() { // 백버튼 누를 시 수행할 로직 구현
        if(webView.canGoBack())
        {//웹 사이트에서 뒤로 갈 페이지가 존재한다면
            webView.goBack()
        }
        else
        {
            super.onBackPressed() // 본래의 백 버튼 기능 수행 (안드로이드)
        }
    }
}