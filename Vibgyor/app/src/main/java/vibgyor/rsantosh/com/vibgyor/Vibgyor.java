package vibgyor.rsantosh.com.vibgyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Vibgyor extends AppCompatActivity implements View.OnClickListener {


    //Creating an object for a tex view.
    TextView textviewred;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibgyor);

        //Initialising the objects.
        textviewred=(TextView) findViewById(R.id.red);
        textviewred.setOnClickListener(this);

        textviewred=(TextView) findViewById(R.id.orange);
        textviewred.setOnClickListener(this);

        textviewred=(TextView) findViewById(R.id.yellow);
        textviewred.setOnClickListener(this);

        textviewred=(TextView) findViewById(R.id.green);
        textviewred.setOnClickListener(this);

        textviewred=(TextView) findViewById(R.id.blue);
        textviewred.setOnClickListener(this);

        textviewred=(TextView) findViewById(R.id.indigo);
        textviewred.setOnClickListener(this);

        textviewred=(TextView) findViewById(R.id.violet);
        textviewred.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Switch case statement for calling the appropriate action.
        switch(view.getId()){

            //This case is for Red colour.
            case R.id.red: Toast.makeText(this, "You Clicked on Red.",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Red.");
                 break;

            //This case is for Orange colour.
            case R.id.orange: Toast.makeText(this, "You clicked on Orange",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Orange.");
                 break;

            //This case is for Yellow colour.
            case R.id.yellow: Toast.makeText(this, "You clicked on Yellow",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Yellow.");
                 break;

            //This case is for Green colour.
            case R.id.green: Toast.makeText(this, "You clicked on Green",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Green.");
                 break;

            //This case is for Blue colour.
            case R.id.blue: Toast.makeText(this, "You clicked on Blue",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Blue.");
                 break;

            //This case is for Indigo colour.
            case R.id.indigo: Toast.makeText(this, "You clicked on Indigo",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Indigo.");
                 break;

            //This case is for Violet colour.
            case R.id.violet: Toast.makeText(this, "You clicked on Violet",Toast.LENGTH_LONG).show();
                 Log.d( "onClick","You Clicked on Violet.");
                 break;

        }
    }


}
