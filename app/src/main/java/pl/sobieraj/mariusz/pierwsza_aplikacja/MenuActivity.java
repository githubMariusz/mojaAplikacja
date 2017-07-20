package pl.sobieraj.mariusz.pierwsza_aplikacja;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void ProstY(View view){
        Intent intent = new Intent(this,Podstawowy_Activity.class);     //pierwszy parametr aktualne okno, drugi (jakie okno chemy otworzyc)
        startActivity(intent);                                          //otwieranie rządanego aktiwiti
    }
    public void ZaawansowanY(View view){
        Intent intent = new Intent(this,Zaawansowany_Activity.class);
        startActivity(intent);
    }
    public  void WyjściE(View view){
        System.exit(0);                                                  // wyjście z aplikacji
    }

}
