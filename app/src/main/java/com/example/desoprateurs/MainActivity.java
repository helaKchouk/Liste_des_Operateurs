package com.example.desoprateurs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText,rechargement;
    private TextView login,messageTextView,MessageTextView2,coderecharge,solde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(TextView) findViewById(R.id.l1);
        editText = (EditText) findViewById(R.id.l3);
        rechargement=(EditText) findViewById(R.id.l5);
        messageTextView = (TextView) findViewById(R.id.messageTextView);
        MessageTextView2 = (TextView) findViewById(R.id.l4);
        coderecharge=(TextView) findViewById(R.id.l7);


        Button callButton = findViewById(R.id.l8);
        Button callButton2 = findViewById(R.id.l10);
        solde=(TextView)findViewById(R.id.l9);



        Intent intent = getIntent();
        String chaineExtraite = intent.getStringExtra("cha");
        login.setText(chaineExtraite);
        editText.addTextChangedListener(new TextWatcher() {
            @Override

            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }


            InputFilter maxLengthFilter = new InputFilter.LengthFilter(14); // Initialisation avec une limite par défaut de 14 chiffres

            @Override


            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    rechargement.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        }

                        @Override
                        public void onTextChanged(CharSequence s, int start, int before, int count) {
                            if(s.length() > 0) {
                                switch (charSequence.charAt(0)) {
                                    case '5':

                                        coderecharge.setText("*100*" + s + "#");

                                        callButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                // Récupérez le numéro de téléphone à partir de l'EditText
                                                String phoneNumber = coderecharge.getText().toString();

                                                // Créez une intention pour composer un numéro de téléphone
                                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                                                // Démarrez l'intention pour ouvrir l'application d'appel téléphonique
                                                startActivity(callIntent);
                                            }
                                        });
                                        break;

                                    case '2':

                                        coderecharge.setText("*101*" + s + "#");
                                        callButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                // Récupérez le numéro de téléphone à partir de l'EditText
                                                String phoneNumber = coderecharge.getText().toString();

                                                // Créez une intention pour composer un numéro de téléphone
                                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                                                // Démarrez l'intention pour ouvrir l'application d'appel téléphonique
                                                startActivity(callIntent);
                                            }
                                        });
                                        break;

                                    case '9':


                                        coderecharge.setText("*123*" + s + "#");
                                        callButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                // Récupérez le numéro de téléphone à partir de l'EditText
                                                String phoneNumber = coderecharge.getText().toString();

                                                // Créez une intention pour composer un numéro de téléphone
                                                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                                callIntent.setData(Uri.parse("tel:" + phoneNumber));

                                                // Démarrez l'intention pour ouvrir l'application d'appel téléphonique
                                                startActivity(callIntent);
                                            }
                                        });
                                        break;

                                }
                            }
                            else { coderecharge.setText("");}

                        }

                        @Override
                        public void afterTextChanged(Editable s) {

                        }
                    });





                    switch (charSequence.charAt(0)) {
                        case '5':

                            coderecharge.setBackgroundColor(Color.parseColor("#FFA500"));

                            solde.setBackgroundColor(Color.parseColor("#FFA500"));

                            messageTextView.setTextColor(Color.parseColor("#FFA500"));

                            messageTextView.setText("Orange");
                            messageTextView.setVisibility(View.VISIBLE);
                            MessageTextView2.setText("recharge 14 chiffres");
                            MessageTextView2.setVisibility(View.VISIBLE);
                            rechargement.setVisibility(View.VISIBLE);
                            maxLengthFilter = new InputFilter.LengthFilter(14); // Limite à 14 chiffres
                            solde.setText("*111#");


                            callButton2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    // Récupérez le numéro de téléphone à partir de l'EditText
                                    String phoneNumber = solde.getText().toString();

                                    // Créez une intention pour composer un numéro de téléphone
                                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                    callIntent.setData(Uri.parse("tel:" + phoneNumber));

                                    // Démarrez l'intention pour ouvrir l'application d'appel téléphonique
                                    startActivity(callIntent);
                                }
                            });




                            break;

                        case '2':
                            coderecharge.setTextColor(Color.parseColor("#FFFFFFFF"));
                            coderecharge.setBackgroundColor(Color.parseColor("#FF0000"));

                            solde.setTextColor(Color.parseColor("#FFFFFFFF"));
                            solde.setBackgroundColor(Color.parseColor("#FF0000"));


                            messageTextView.setTextColor(Color.parseColor("#FF0000"));

                            messageTextView.setText("ooredoo");
                            messageTextView.setVisibility(View.VISIBLE);
                            MessageTextView2.setText("recharge 14 chiffres");
                            MessageTextView2.setVisibility(View.VISIBLE);
                            rechargement.setVisibility(View.VISIBLE);

                            maxLengthFilter = new InputFilter.LengthFilter(14); // Limite à 14 chiffres
                            solde.setText("*100#");


                            callButton2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    // Récupérez le numéro de téléphone à partir de l'EditText
                                    String phoneNumber = solde.getText().toString();

                                    // Créez une intention pour composer un numéro de téléphone
                                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                    callIntent.setData(Uri.parse("tel:" + phoneNumber));

                                    // Démarrez l'intention pour ouvrir l'application d'appel téléphonique
                                    startActivity(callIntent);
                                }
                            });









                            break;

                        case '9':

                            coderecharge.setTextColor(Color.parseColor("#FFFFFFFF"));
                            coderecharge.setBackgroundColor(Color.parseColor("#0000FF"));

                            solde.setTextColor(Color.parseColor("#FFFFFFFF"));
                            solde.setBackgroundColor(Color.parseColor("#0000FF"));


                            messageTextView.setTextColor(Color.parseColor("#3B9AED"));

                            messageTextView.setText("telecom");
                            messageTextView.setVisibility(View.VISIBLE);
                            MessageTextView2.setText("recharge 13 chiffres");
                            MessageTextView2.setVisibility(View.VISIBLE);
                            rechargement.setVisibility(View.VISIBLE);

                            maxLengthFilter = new InputFilter.LengthFilter(13); // Limite à 13 chiffres
                            solde.setText("*122#");

                            callButton2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    // Récupérez le numéro de téléphone à partir de l'EditText
                                    String phoneNumber = solde.getText().toString();

                                    // Créez une intention pour composer un numéro de téléphone
                                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                    callIntent.setData(Uri.parse("tel:" + phoneNumber));

                                    // Démarrez l'intention pour ouvrir l'application d'appel téléphonique
                                    startActivity(callIntent);
                                }
                            });



                            break;
                    }

                    InputFilter[] filters = {maxLengthFilter};
                    rechargement.setFilters(filters);
                }
                else {


                    messageTextView.setVisibility(View.GONE);
                    MessageTextView2.setText("entrer votre code de recharge");
                    coderecharge.setText("");
                    rechargement.setText("");
                    solde.setText("");

                }
            }


            @Override
            public void afterTextChanged(Editable editable) {
            }

        });


    }
}