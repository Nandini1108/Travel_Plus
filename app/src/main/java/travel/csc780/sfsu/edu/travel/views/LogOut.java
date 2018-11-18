package travel.csc780.sfsu.edu.travel.views;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

import travel.csc780.sfsu.edu.travel.R;

public class LogOut extends AppCompatActivity {

    Button button;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListner;
    GoogleApiClient mGoogleApiClient;
    GoogleSignInClient mGoogleSignInClient;

    private static final String TAG = "LogOut";

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListner);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_out);
        final Activity a = this;

        button = (Button) findViewById(R.id.logout);
        mAuth = FirebaseAuth.getInstance();

//        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestIdToken(getString(R.string.default_web_client_id))
//                .requestEmail()
//                .build();
////
//        mGoogleSignInClient=GoogleSignIn.getClient(this, gso);

        mAuthListner = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null)
                    startActivity(new Intent(LogOut.this, MainActivity.class));
            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            Sign-out only done from Firebase.... Need more refining....
                mAuth.signOut();
//                mGoogleSignInClient.signOut()
//                        .addOnCompleteListener(a, new OnCompleteListener<Void>() {
//                            @Override
//                            public void onComplete(@NonNull Task<Void> task) {
//                                startActivity(new Intent(SecondOne.this, MainActivity.class));
//                            }
//                        });

//                Auth.GoogleSignInApi.signOut(mGoogleApiClient);
//                startActivity(new Intent(a, MainActivity.class));








            }

        });
    }
}
