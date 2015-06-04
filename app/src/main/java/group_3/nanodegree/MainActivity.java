package group_3.nanodegree;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        //Nothing here for the moment, since the bar is useless
        return super.onOptionsItemSelected(item);
    }

    //Butterknife magic :-)

    @OnClick(R.id.spotify_streamer_btn)
    void onSpotifySteamerClicked()
    {
        Toast.makeText(this, "This button will launch spotify streamer app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.scores_app_btn)
    void onScoresClicked()
    {
        Toast.makeText(this, "This button will launch scores app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.lib_app_btn)
    void onLibraryAppClicked()
    {
        Toast.makeText(this, "This button will launch library app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.build_it_bigger_btn)
    void onBuildItBiggerClicked()
    {
        Toast.makeText(this, "This button will launch build it bigger app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.xyz_reader_btn)
    void onXyzReaderClicked()
    {
        Toast.makeText(this, "This button will launch XYZ reader app", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.capstone_btn)
    void onCapstoneClicked()
    {
        Toast.makeText(this, "This button will launch capstone  app", Toast.LENGTH_SHORT).show();
    }


}
