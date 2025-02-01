public class Cinema {
    Screen[] screens;
    Cinema(int numScreens) {
        screens = new Screen[numScreens];
        screens[0]=new Screen("Standard");
        screens[1]=new Screen("Gold");
        screens[2]=new Screen("Silver");
        screens[3]=new Screen("Platinum");
        screens[4]=new Screen("Diamond");
    }
}
