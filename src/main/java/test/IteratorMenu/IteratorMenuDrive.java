package test.IteratorMenu;

import test.IteratorMenu.Menu.PancakeHouseMenu;
import test.IteratorMenu.Menu.DinerMenu;

public class IteratorMenuDrive {
  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
    waitress.printMenu();
  }
}