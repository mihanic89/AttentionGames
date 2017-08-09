package xyz.yapapa.attentiongames;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;



public class MainActivityRecycler extends AppCompatActivity {



    private StaggeredGridLayoutManager gaggeredGridLayoutManager;

    //private AdView mAdView;
    //private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        //recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        int[] gaggeredList = getListItemData();

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivityRecycler.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);


       /* mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2888343178529026~2653479392");


        mAdView = (AdView) findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder()
                //.addTestDevice("09D7B5315C60A80D280B8CDF618FD3DE")
                .build();
        mAdView.loadAd(adRequest);
        */


    }

    private int[] getListItemData(){

            int[] mDataset = new int[]{
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
                    R.mipmap.l01,
                    R.mipmap.l02,
                    R.mipmap.l03,
                    R.mipmap.l04,
            };


       return mDataset;
    }
/*
    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }


    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }


    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }
  */

}
