package fr.limayrac.sn2.myapplication.P_ihm;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

import fr.limayrac.sn2.myapplication.R;

public class MainActivity extends AppCompatActivity {
    final String TAG = "resto";
    TextView secondNameValue;
    TextView firstNameValue;
    TextView classValue;
    TextView messageLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondNameValue = findViewById(R.id.secondNameValue);
        firstNameValue = findViewById(R.id.firstNameValue);
        classValue = findViewById(R.id.classValue);
        messageLabel = findViewById(R.id.messageLabel);
    }

    public void verifierIdentifiants(View v){
        String nom = secondNameValue.getText().toString();
        String prenom = firstNameValue.getText().toString();
        String classe = classValue.getText().toString();
        //Etudiant e = new Etudiant(nom,prenom,classe);

        messageLabel.setText("Bienvenue "+prenom.toUpperCase()+" "+nom.toUpperCase()+" !");
    }
}