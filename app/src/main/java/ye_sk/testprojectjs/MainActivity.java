package ye_sk.testprojectjs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView)findViewById(R.id.web);
        //webView.loadUrl("file:///android_asset/www/index.html");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/www/folder/milsymbol/unitgenerator/index.html");
    }
}
