package pl.sobieraj.mariusz.pierwsza_aplikacja;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Podstawowy_Activity extends AppCompatActivity implements View.OnClickListener{

    EditText pierwszaLiczbaPole;
    EditText drugaLiczbaPole;

    Button btn_mnozenie;
    Button btn_dzielenie;
    Button btn_dodawanie;
    Button btn_odejmowanie;

    TextView wynikText;

    String operator = "";


    @Override                                                                //nadpisanie
    protected void onCreate(Bundle savedInstanceState) {                  // wszystko co w onCreate  zostaje wykonywane podczas uruchomienia apliakcji
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podstawowy_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //określenie elementów
        pierwszaLiczbaPole = (EditText) findViewById(R.id.pierwszaLiczbaPole);
        drugaLiczbaPole = (EditText) findViewById(R.id.drugaLiczbaPole);

        btn_dodawanie = (Button) findViewById(R.id.btn_dodawanie);
        btn_odejmowanie = (Button) findViewById(R.id.btn_odejmowanie);
        btn_mnozenie = (Button) findViewById(R.id.btn_mnozenie);
        btn_dzielenie = (Button) findViewById(R.id.btn_dzielenie);

        wynikText = (TextView) findViewById(R.id.wynikText);

        //wykonanie po nacisnieciu

        btn_dodawanie.setOnClickListener((View.OnClickListener) this);
        btn_odejmowanie.setOnClickListener((View.OnClickListener) this);
        btn_mnozenie.setOnClickListener((View.OnClickListener) this);
        btn_dzielenie.setOnClickListener((View.OnClickListener) this);
    }


    public void PowróT(View view){
                                                 //otwieranie rządanego aktiwiti
        System.exit(0);
    }


    @Override
    public void onClick(View v){

        float liczba1=0;
        float liczba2=0;
        float wynik=0;
        if (TextUtils.isEmpty(pierwszaLiczbaPole.getText().toString())
                ||TextUtils.isEmpty((drugaLiczbaPole.getText().toString()))){
            return;
        }
        liczba1=Float.parseFloat(pierwszaLiczbaPole.getText().toString());
        liczba2=Float.parseFloat(drugaLiczbaPole.getText().toString());

        switch (v.getId()){
            case R.id.btn_dodawanie:
                operator = "+";
                wynik = liczba1 + liczba2;
                break;
            case R.id.btn_odejmowanie:
                operator= "-";
                wynik= liczba1-liczba2;
                break;
            case R.id.btn_mnozenie:
                operator="*";
                wynik=liczba1*liczba2;
                break;
            case R.id.btn_dzielenie:
                operator="/";
                wynik=liczba1/liczba2;
                break;
            default:
                break;
        }
        wynikText.setText(liczba1 +"  "+ operator +"  "+ liczba2 + "  =  " + wynik);
    }



}
