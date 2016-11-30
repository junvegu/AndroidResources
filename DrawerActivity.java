public class MainActivity extends AppCompatActivity {

    DrawerLayout mDrawer;
    NavigationView navigationView;
    SessionManager mSessionManager;
    private Toolbar toolbar;
    private ActionBarDrawerToggle mDrawerToggle;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    public TextView tv_username;
    public ImageView profile_image;
    public TextView tv_state_gender;
    public User mUser;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *Setup the DrawerLayout and NavigationView
         */
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.layout_content_frame);
        mDrawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView = (NavigationView) findViewById(R.id.navigation);
        mSessionManager = new SessionManager(getApplicationContext());
        /**
         * Lets inflate the very first fragment
         */


        EventFragment guardifyFragment =
                (EventFragment) getSupportFragmentManager().findFragmentById(R.id.layout_content_frame);

        if (guardifyFragment == null) {
            guardifyFragment = EventFragment.newInstance();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), guardifyFragment, R.id.layout_content_frame);
        }


        /**
         * Setup click events on the Navigation View Items.
         */

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle("");
        setupDrawerContent(navigationView);

        mDrawerToggle = new ActionBarDrawerToggle(
                this,                    /* host Activity */
                mDrawer,                    /* DrawerLayout object */
                toolbar,
                R.string.app_name,  /* "open drawer" description for accessibility */
                R.string.app_name  /* "close drawer" description for accessibility */
        );
        mDrawerToggle.syncState();
        mDrawer.setDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle.syncState();
        View header = navigationView.getHeaderView(0);
        //tv_username = (TextView) header.findViewById(R.id.tv_fullnanme);
        //tv_state_gender = (TextView) header.findViewById(R.id.tv_state_gender);
        //profile_image = (ImageView) header.findViewById(R.id.imageView);
        //  startService(new Intent(this, GeolocationService.class));
        initHeader();
    }


    public void initHeader() {

     
        }



    }



    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {


                        menuItem.setChecked(false);
                        menuItem.setCheckable(false);


                        switch (menuItem.getItemId()) {
                            case R.id.nav_connect:
                 
                                break;
                            case R.id.nav_profile:
                                break;
                            case R.id.nav_contact:

                                break;
                            case R.id.places:    
                                break;
                            case R.id.nav_signout:
                                break;

                            default:

                                break;
                        }
                        // Close the navigation drawer when an item is selected.
                        menuItem.setChecked(false);
                        mDrawer.closeDrawers();
                        return true;
                    }

                });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        if (this.mDrawer.isDrawerOpen(GravityCompat.START)) {
            this.mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


}
