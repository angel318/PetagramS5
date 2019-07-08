package com.example.petagram;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.petagram.adapter.PageAdapter;
import com.example.petagram.fragment.PerfilFragment;
import com.example.petagram.fragment.RecyclerviewFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ImageView tbStarAction;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar miActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        miActionBar = (Toolbar) findViewById(R.id.miActionBarM);
        tbStarAction = (ImageView) findViewById(R.id.tbStarActionTBM);

        if (miActionBar !=null){
            setSupportActionBar(miActionBar);
        }

        setUpViewPager();

        tbStarAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(MainActivity.this, MascotaFavoritaActivity.class);
                startActivity(intent);
            }
        });

    }

    private ArrayList<Fragment> agregarFragmentos(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerviewFragment());
        fragments.add(new PerfilFragment());
        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragmentos()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_user);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mContacto:
                Intent intent2 = new  Intent(MainActivity.this, ContactoActivity.class);
                startActivity(intent2);
                break;
            case R.id.mAbout:
                Intent intent3 = new  Intent(MainActivity.this, AcercaDeActivity.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}